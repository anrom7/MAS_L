package ua.edu.lp.cad.mas.lab2;

import java.util.ArrayList;
import java.util.List;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class BookBuyerAgent extends Agent {
	private static final long serialVersionUID = -6300630449468161409L;

	// The titles list of the books to buy
	private List<String> targetBookTitles = new ArrayList<String>();
	// The list of known seller agents
	private AID[] sellerAgents = null;
	
	private BookBuyerGui gui = null;
	
	// Набір слухачів
	private List<BookHandler> bookHandlers = new ArrayList<BookBuyerAgent.BookHandler>();

	// Put agent initializations here
	protected void setup() {
		
		gui = new BookBuyerGui(this);
		gui.showGui();
		
		System.out.println("Hello! Buyer-agent " + getAID().getName() + " is ready.");
		
		addBehaviour(new TickerBehaviour(this, 60000) {
			private static final long serialVersionUID = -2539521521322352923L;

			protected void onTick() {
				// Update the list of seller agents
				DFAgentDescription template = new DFAgentDescription();
				ServiceDescription sd = new ServiceDescription();
				sd.setType("book-selling");
				template.addServices(sd);
				
				try {
					DFAgentDescription[] result = DFService.search(myAgent, template);
					sellerAgents = new AID[result.length];
					
					for (int i = 0; i < result.length; ++i) {
						sellerAgents[i] = result[i].getName();
					}
				} catch (FIPAException fe) {
					fe.printStackTrace();
				}
				
				// Пошук по усіх книгах
				for (String title : targetBookTitles) {
					myAgent.addBehaviour(new RequestPerformer(title));
				}
			}
		});
	}
	
	// Додавання книги в список
	public void addBook(String title) {
		System.out.println("Added book " + title);
		
		targetBookTitles.add(title);
	}
	
	// Добавляє слухача для відслідковування змін 
	public void addBookHandler(BookHandler bookHandler) {
		this.bookHandlers.add(bookHandler);
	}
	
	// Видалення слухача
	public void removeBookHandler(BookHandler bookHandler) {
		this.bookHandlers.remove(bookHandler);
	}

	private class RequestPerformer extends Behaviour {
		private static final long serialVersionUID = 1820263965187147270L;
		
		private AID bestSeller; // The agent who provides the best offer
		private int bestPrice; // The best offered price
		private int repliesCnt = 0; // The counter of replies from seller agents
		private MessageTemplate mt; // The template to receive replies
		private int step = 0;

		// Дане поле призначене для зберігання назви книги яку потрібно купити в даній поведінці
		public String targetBookTitle = null;
		
		public RequestPerformer(String targetBookTitle) {
			this.targetBookTitle = targetBookTitle;
		}
		
		public void action() {
			switch (step) {
			case 0:
				// Send the cfp to all sellers
				ACLMessage cfp = new ACLMessage(ACLMessage.CFP);
				for (int i = 0; i < sellerAgents.length; ++i) {
					cfp.addReceiver(sellerAgents[i]);
				}
				
				cfp.setContent(targetBookTitle);
				cfp.setConversationId("book-trade");
				cfp.setReplyWith("cfp" + System.currentTimeMillis()); // Unique value
				myAgent.send(cfp);
				// Prepare the template to get proposals
				mt = MessageTemplate.and(
						MessageTemplate.MatchConversationId("book-trade"),
						MessageTemplate.MatchInReplyTo(cfp.getReplyWith()));
				step = 1;
				break;
			case 1:
				// Receive all proposals/refusals from seller agents
				ACLMessage reply = myAgent.receive(mt);
				if (reply != null) {
					// Reply received
					if (reply.getPerformative() == ACLMessage.PROPOSE) {
						// This is an offer
						int price = Integer.parseInt(reply.getContent());
						if (bestSeller == null || price < bestPrice) {
							// This is the best offer at present
							bestPrice = price;
							bestSeller = reply.getSender();
						}
					}
					
					repliesCnt++;
					
					if (repliesCnt >= sellerAgents.length) {
						// We received all replies
						step = 2;
					}
				} else {
					block();
				}
				break;
			case 2:
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
				break;
			case 3:
				// Receive the purchase order reply
				reply = myAgent.receive(mt);
				if (reply != null) {
					// Purchase order reply received
					if (reply.getPerformative() == ACLMessage.INFORM) {
						// Purchase successful. We can terminate
						System.out.println(targetBookTitle + " successfully purchased.");
						
						// Повідомляємо усіх слухачів про зміну в наборі книжок
						for (BookHandler handler : bookHandlers) {
							handler.onBookBay(targetBookTitle);
						}
						
						System.out.println("Price = " + bestPrice);
					}
					step = 4;
				} else {
					block();
				}
				break;
			}
		}

		public boolean done() {
			return ((step == 2 && bestSeller == null) || step == 4);
		}
	}
	
	@Override
	protected void takeDown() {
		gui.dispose();
		
		super.takeDown();
	}

	/*
	 * BookHandler призначений для повідомлення графічних інтерфейсів про
	 * зміну набору книжок, які потрібно купити
	 * */
	
	public interface BookHandler {
		public void onBookBay(String title); // Повідомляє про видалення назви книги
	}
}