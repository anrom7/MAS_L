1. I was create project, and add classes.
2. Modification: paraleling run behavior

//Advertisement class Paraleling Behavior 
	ParallelBehaviour pb = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL);


in method setup():

//Paralelling running Seller and Buyer in Sub Behavior
		pb.addSubBehaviour(new Behaviour1("ua.lab.BookSellerAgent"));
		pb.addSubBehaviour(new Behaviour1("ua.lab.BookBuyerAgent"));
		pb.addSubBehaviour(new WakerBehaviour(this, 20000) {
			private static final long serialVersionUID = 1L;
			public void onWake() { System.out.println("timeout expired");//off all agents in SubBehavior when time was out 
		}
		});	
	