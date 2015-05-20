package com.multiAgent;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class BookBuyerAgent extends Agent {

	private static final long serialVersionUID = 4163594955541140661L;

	// The title of the book to buy
	private String targetBookTitle;
	// The maximum price of the book to buy
	private int targetBookPrice;

	// The list of known seller agents
	private AID[] sellerAgents;
	// The GUI by means of which the user can add books and wishful price
	private BookBuyerGui myGui;

	private AID bestSeller; // The agent who provides the best offer
	private int bestPrice; // The best offered price
	private int repliesCnt = 0; // The counter of replies from seller agents
	private MessageTemplate mt; // The template to receive replies
	private int step = 0;

	protected void setup() {
		final SequentialBehaviour sb = new SequentialBehaviour(this) {
			private static final long serialVersionUID = 9170190913670186558L;

			public int onEnd() {
				reset();
				return super.onEnd();
			}
		};
		System.out.println("Hallo! Buyer-agent " + getAID().getName()
				+ " is ready.");

		// Get the title of the book to buy as a start-up argument
		Object[] args = getArguments();
		if (args != null) {

			myGui = new BookBuyerGui(this);
			myGui.showGui();

			// Add a TickerBehaviour that schedules a request to seller agents
			// every half minute
			
			addBehaviour(new TickerBehaviour(this, 30000) {
				private static final long serialVersionUID = 1L;

				protected void onTick() {
					System.out.println("Trying to buy " + targetBookTitle);
					// Update the list of seller agents
					DFAgentDescription template = new DFAgentDescription();
					ServiceDescription sd = new ServiceDescription();
					sd.setType("book-selling");
					template.addServices(sd);
					try {
						DFAgentDescription[] result = DFService.search(myAgent,
								template);
						System.out
								.println("Found the following seller agents:");
						sellerAgents = new AID[result.length];
						for (int i = 0; i < result.length; ++i) {
							sellerAgents[i] = result[i].getName();
							System.out.println(sellerAgents[i].getName());
						}
					} catch (FIPAException fe) {
						fe.printStackTrace();
					}
					myAgent.addBehaviour(sb);
				}

			});
		} else {
			// Make the agent terminate
			System.out.println("No target book title specified");
			doDelete();
		}
		//add first subBehaviour
		sb.addSubBehaviour(new OneShotBehaviour() {
			private static final long serialVersionUID = -2388091413565474290L;

			@Override
			public void action() {
				// Send the cfp to all sellers
				ACLMessage cfp = new ACLMessage(ACLMessage.CFP);
				for (int i = 0; i < sellerAgents.length; ++i) {
					cfp.addReceiver(sellerAgents[i]);
				}
				cfp.setContent(targetBookTitle);
				cfp.setConversationId("book-trade");
				cfp.setReplyWith("cfp" + System.currentTimeMillis()); // Unique
				// value
				myAgent.send(cfp);
				mt = MessageTemplate.and(
						MessageTemplate.MatchConversationId("book-trade"),
						MessageTemplate.MatchInReplyTo(cfp.getReplyWith()));
				step = 1;
			}
		});
		//add next subBehaviour
		sb.addSubBehaviour(new OneShotBehaviour() {
			private static final long serialVersionUID = -5193353497860198644L;
			@Override
			public void action() {
				// Receive all proposals/refusals from seller agents
				ACLMessage reply = myAgent.receive(mt);
				if (reply != null) {
					// Reply received
					if (reply.getPerformative() == ACLMessage.PROPOSE) {
						// This is an offer
						int price = Integer.parseInt(reply.getContent());
						// if price is best and is less than price limit
						if ((bestSeller == null || price < bestPrice)
								&& (price <= targetBookPrice)) {
							// This is the best offer at present
							bestPrice = price;
							bestSeller = reply.getSender();
						}
					}
					repliesCnt++;
					if (repliesCnt >= sellerAgents.length) {
						step = 2;
					}
				} else {
					block();
				}
			}
		});
		//add next subBehaviour
		sb.addSubBehaviour(new OneShotBehaviour() {
			private static final long serialVersionUID = 5513623928449549801L;

			@Override
			public void action() {
				// Send the purchase order to the seller that provided the best
				// offer
				ACLMessage order = new ACLMessage(ACLMessage.ACCEPT_PROPOSAL);
				order.addReceiver(bestSeller);
				order.setContent(targetBookTitle);
				order.setConversationId("book-trade");
				order.setReplyWith("order" + System.currentTimeMillis());
				myAgent.send(order);
				// Prepare the template to get the purchase order reply
				mt = MessageTemplate.and(
						MessageTemplate.MatchConversationId("book-trade"),
						MessageTemplate.MatchInReplyTo(order.getReplyWith()));
				step = 3;
			}
		});
		//add next subBehaviour
		sb.addSubBehaviour(new OneShotBehaviour() {
			private static final long serialVersionUID = 102726637059811181L;

			@Override
			public void action() {
				// Receive the purchase order reply
				ACLMessage reply = myAgent.receive(mt);
				if (reply != null) {
					// Purchase order reply received
					if (reply.getPerformative() == ACLMessage.INFORM) {
						// Purchase successful. We can terminate
						System.out.println(targetBookTitle
								+ " successfully purchased from agent "
								+ reply.getSender().getName());
						System.out.println("Price = " + bestPrice);
						myAgent.doDelete();
						step = 4;
					} else {
						System.out
								.println("Attempt failed: requested book already sold.");
					}
				} else {
					block();
				}
			}
		});
	}

	public boolean done() {
		if (step == 2 && bestSeller == null) {
			System.out.println("Attempt failed: " + targetBookTitle
					+ " not available for sale");
		}
		return ((step == 2 && bestSeller == null) || step == 4);
	}

	public void updateRecord(final String title, final int price) {
		addBehaviour(new OneShotBehaviour() {
			private static final long serialVersionUID = 282993140142995395L;
			
			public void action() {
				targetBookTitle = title;
				targetBookPrice = price;
				System.out.println("Target book is " + targetBookTitle
						+ ", Limit price = " + targetBookPrice);
			}
		});
	}
}
