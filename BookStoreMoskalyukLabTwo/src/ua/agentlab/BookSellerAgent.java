package ua.agentlab;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

import java.util.*;

public class BookSellerAgent extends Agent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3918119750762462404L;
	// The catalogue of books for sale (maps the title of a book to its price)
	private Hashtable<String,Integer> catalogue;
	// The GUI by means of which the user can add books in the catalogue
	private BookSellerGui myGui;

	// Put agent initializations here
	protected void setup() {
		// Create the catalogue
		catalogue = new Hashtable<String,Integer>();
		
		// Get array of arguments
				Object[] args = getArguments();
				//Checking if array of arguments not null and have at least 1 element
				if (args != null && args.length > 0) {
					//go loop with step = 2, every element that x/2 residual = 0 - it's title,
					//and x/2 residual = 1 - it's price
					for(int i=0;i<args.length;i=i+2){
						//call update catalogue method to add new books from arguments
						updateCatalogue(args[i].toString(),new Integer(args[i+1].toString()));
						}
					}
		// Create and show the GUI 
		myGui = new BookSellerGui(this);
		myGui.showGui();

		// Register the book-selling service in the yellow pages
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setType("book-selling");
		sd.setName("JADE-book-trading");
		dfd.addServices(sd);
		try {
			DFService.register(this, dfd);
		}
		catch (FIPAException fe) {
			fe.printStackTrace();
		}

		// Add the behaviour serving queries from buyer agents
		addBehaviour(new OfferRequestsServer());

		// Add the behaviour serving purchase orders from buyer agents
		addBehaviour(new PurchaseOrdersServer());
	}

	// Put agent clean-up operations here
	protected void takeDown() {
		// Deregister from the yellow pages
		try {
			DFService.deregister(this);
		}
		catch (FIPAException fe) {
			fe.printStackTrace();
		}
		// Close the GUI
		myGui.dispose();
		// Printout a dismissal message
		System.out.println("Seller-agent "+getAID().getName()+" terminating.");
	}

	/**
     This is invoked by the GUI when the user adds a new book for sale
	 */
	public void updateCatalogue(final String title, final int price) {
		addBehaviour(new OneShotBehaviour() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4363910349522932265L;

			public void action() {
				catalogue.put(title, new Integer(price));
				System.out.println(title+" inserted into catalogue. Price = "+price);
			}
		} );
		
		//Behaviour by time - it's mean that handler would be catch just with time delay
		addBehaviour(new WakerBehaviour(this, 20000) {
			//Handler that will catch only once, after timeout is over
			protected void handleElapsedTimeout() {
				//Getting price of book by title from catalogue
				Integer price = (Integer) catalogue.get(title);
				//check if price equal null - that means that book've already sold.
				if (price!=null)
				{
					//change price in catalogue (as it hashtable we could just put value in it
					//and if there any element with same key - that would be replaced with new value)
					catalogue.put(title,(int)Math.round(price*0.9));
					//message about sale :)
					System.out.println("Price of "+title+" was down on 10%. Now it costs just "+catalogue.get(title));
				}
			}
			} );
	}

	/**
	   Inner class OfferRequestsServer.
	   This is the behaviour used by Book-seller agents to serve incoming requests 
	   for offer from buyer agents.
	   If the requested book is in the local catalogue the seller agent replies 
	   with a PROPOSE message specifying the price. Otherwise a REFUSE message is
	   sent back.
	 */
	private class OfferRequestsServer extends CyclicBehaviour {
		/**
		 * 
		 */
		private static final long serialVersionUID = 7667936598472198168L;

		public void action() {
			MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.CFP);
			ACLMessage msg = myAgent.receive(mt);
			if (msg != null) {
				// CFP Message received. Process it
				String title = msg.getContent();
				ACLMessage reply = msg.createReply();

				Integer price = (Integer) catalogue.get(title);
				if (price != null) {
					// The requested book is available for sale. Reply with the price
					reply.setPerformative(ACLMessage.PROPOSE);
					reply.setContent(String.valueOf(price.intValue()));
				}
				else {
					// The requested book is NOT available for sale.
					reply.setPerformative(ACLMessage.REFUSE);
					reply.setContent("not-available");
				}
				myAgent.send(reply);
			}
			else {
				block();
			}
		}
	}  // End of inner class OfferRequestsServer

	/**
	   Inner class PurchaseOrdersServer.
	   This is the behaviour used by Book-seller agents to serve incoming 
	   offer acceptances (i.e. purchase orders) from buyer agents.
	   The seller agent removes the purchased book from its catalogue 
	   and replies with an INFORM message to notify the buyer that the
	   purchase has been sucesfully completed.
	 */
	private class PurchaseOrdersServer extends CyclicBehaviour {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7489461216926838790L;

		public void action() {
			MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.ACCEPT_PROPOSAL);
			ACLMessage msg = myAgent.receive(mt);
			if (msg != null) {
				// ACCEPT_PROPOSAL Message received. Process it
				String title = msg.getContent();
				ACLMessage reply = msg.createReply();

				Integer price = (Integer) catalogue.remove(title);
				if (price != null) {
					reply.setPerformative(ACLMessage.INFORM);
					System.out.println(title+" sold to agent "+msg.getSender().getName());
				}
				else {
					// The requested book has been sold to another buyer in the meanwhile .
					reply.setPerformative(ACLMessage.FAILURE);
					reply.setContent("not-available");
				}
				myAgent.send(reply);
			}
			else {
				block();
			}
		}
	}  // End of inner class OfferRequestsServer
	
	
}


