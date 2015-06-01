1. Created a project, added a few classes.
2. Updates: each behaviour now starts within a separate thread

// Ad factory flow to run each agent behavior in a separate thread:
	private ThreadedBehaviourFactory tbf = new ThreadedBehaviourFactory ();


the method setup ():

// designation of certain behaviors for a given factory
addBehaviour (tbf.wrap (new OfferRequestsServer ())); // behaviour f ad-free books sold

addBehaviour (tbf.wrap (new PurchaseOrdersServer ())); // confirmation of the transaction and the sale of a book