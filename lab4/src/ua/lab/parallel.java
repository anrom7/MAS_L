package ua.lab;

import jade.core.Agent;
//import jade.core.behaviours.*;
import jade.wrapper.StaleProxyException;
import jade.wrapper.AgentController;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class parallel extends Agent {

	/**
	 * Клас який реалізує паралельну поведінку
	 * 
	 */
	private static final long serialVersionUID = 9093104234489779274L;


	private class Behaviour1 extends jade.core.behaviours.OneShotBehaviour {
		/**
		 * Клас створений дляч запуску агента
		 */
		private static final long serialVersionUID = 2830801870384026969L;
		String cl;
		public Behaviour1(String clas) {
			// TODO Auto-generated constructor stub
			cl=clas;
		}
		public void action() {
			// TODO Auto-generated method stub
			//Спроба запустити агента
			try {
				System.out.println("Ehhh!!!");
				startNewAgent(cl, "BookSellerAgent"
						+ Math.random(), getArguments());
			} catch (StaleProxyException e) {
				// TODO Auto-generated catch block
			}
		}

	

	};
//Початкові налаштування класу паралельної поведінки
	protected void setup(){
		System.out.println("Operation 1");
		//налаштування паралельної поведвінки
		ParallelBehaviour pb = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL);
		//агенти для запуску
		pb.addSubBehaviour(new Behaviour1("ua.lab.BookSellerAgent"));
		pb.addSubBehaviour(new Behaviour1("ua.lab.BookSellerAgent"));
		pb.addSubBehaviour(new Behaviour1("ua.lab.BookBuyerAgent"));
		//тайм-аут
		pb.addSubBehaviour(new WakerBehaviour(this, 20000) {
		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		public void onWake() { System.out.println("timeout expired");
		}
		});
				
		this.addBehaviour(pb);
		
	}

	private void startNewAgent(String className, String agentName,
			Object[] arguments) throws StaleProxyException {
		((AgentController) getContainerController().createNewAgent(agentName,
				className, arguments)).start();
	}

	
}
