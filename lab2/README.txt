Change log:
	Changes in ver.4 compared to ver.2:
	1) Added Parallel behavior:
				//Starts up multiple buyer agents and single seller agent
		Following steps used to achieve this:
		a) Created New Class ParallelBehaviours
		b) Inside main code revovles around followinf snipet
				//Behaviour setup
				protected void setup(){
				System.out.println("Start Up");
				//Parallel behaviour setup. Quit when all finish.
				ParallelBehaviour pb = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL);
				//Buyer agents
				pb.addSubBehaviour(new Buyer ("ua.agentlab.BookBuyerAgent", 1));
				pb.addSubBehaviour(new Buyer ("ua.agentlab.BookBuyerAgent", 2));

				//Seller agents
				pb.addSubBehaviour(new Seller("ua.agentlab.BookSellerAgent", 1));
		
				//Agent boot up
				this.addBehaviour(pb);
			ii) Based on:

				Behaviour task = new MyTask();
					ParellelBehaviour pb = new ParallelBehaviour(anAgent, ParallelBehaviour.WHEN_ANY);
					pb.addSubBehaviour(task);
					pb.addSubBehaviour(new WakerBehaviour(anAgent, 60000) {
					public void onWake() { System.out.println("timeout expired");
				}
				});


	2)Minor bug fixes and improvements, including automatic shut down of seller agent.