package ua.agentlab;

import jade.core.Agent;
//import jade.core.behaviours.*;
import jade.wrapper.StaleProxyException;
import jade.wrapper.AgentController;
import jade.core.behaviours.ParallelBehaviour;


public class ParallelBehaviours extends Agent {

	/**
	 * Клас який реалізує паралельну поведінку
	 * 
	 */
	private static final long serialVersionUID = 9093104234489779274L;


	private class Buyer extends jade.core.behaviours.OneShotBehaviour {
		/**
		 * Клас створений дляч запуску агента
		 */
		private static final long serialVersionUID = 2830801870384026969L;
		String cl;
		int i;
		public Buyer(String clas, int integer) {
			// TODO Auto-generated constructor stub
			cl=clas;
			i=integer;
		}
		public void action() {
			// TODO Auto-generated method stub
			//Buyer start up
			try {
				System.out.println("Buyer Logged In");
				startNewAgent(cl, "BookBuyerAgent"
						+ i, getArguments());
			} catch (StaleProxyException e) {
				// TODO Auto-generated catch block
			}
		}
	};
	
	private class Seller extends jade.core.behaviours.OneShotBehaviour {
		/**
		 * Клас створений дляч запуску агента
		 */
		private static final long serialVersionUID = 2830801870384026969L;
		String cl;
		int i;
		public Seller(String clas, int integer) {
			// TODO Auto-generated constructor stub
			cl=clas;
			i=integer;
		}
		public void action() {
			// TODO Auto-generated method stub
			//Seller Start Up
			try {
				System.out.println("Seller Logged In");
				startNewAgent(cl, "BookSellerAgent"
						+ i, getArguments());
			} catch (StaleProxyException e) {
				// TODO Auto-generated catch block
			}
		}
	};
	
//Behaviour setup
	protected void setup(){
		System.out.println("Operation 1");
		//Parallel behaviour setup. Quit when all finish.
		ParallelBehaviour pb = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL);
		//Buyer agents
		pb.addSubBehaviour(new Buyer ("ua.agentlab.BookBuyerAgent", 1));
		pb.addSubBehaviour(new Buyer ("ua.agentlab.BookBuyerAgent", 2));

		//Seller agents
		pb.addSubBehaviour(new Seller("ua.agentlab.BookSellerAgent", 1));
		
		//Agent boot up
		this.addBehaviour(pb);
		
	}

	private void startNewAgent(String className, String agentName,
			Object[] arguments) throws StaleProxyException {
		((AgentController) getContainerController().createNewAgent(agentName,
				className, arguments)).start();
	}

	
}
