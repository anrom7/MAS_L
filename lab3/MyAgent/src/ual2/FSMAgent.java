/*****************************************************************
JADE - Java Agent DEvelopment Framework is a framework to develop 
multi-agent systems in compliance with the FIPA specifications.
Copyright (C) 2000 CSELT S.p.A. 

GNU Lesser General Public License

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation, 
version 2.1 of the License. 

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the
Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA  02111-1307, USA.
 *****************************************************************/

package ual2;

import java.util.Random;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.FSMBehaviour;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

/**
 * This example shows the usage of the <code>FSMBehavior</code> that allows
 * composing behaviours according to a Finite State Machine.<br>
 * 
 * @author Giovanni Caire - TILAB
 */
public class FSMAgent extends Agent {
	// State name
	private static final String STATE_A = "A";
	private static final String STATE_C = "C";
	private static final String STATE_F = "F";

	protected void setup() {
		FSMBehaviour fsm = new FSMBehaviour(this) {
			public int onEnd() {
				System.out.println("FSM behaviour completed.");
				myAgent.doDelete();
				return super.onEnd();
			}
		};

		// Register state A (first state)
		fsm.registerFirstState(new NameSellers(), STATE_A);

		// Register state C
		fsm.registerState(new GeneratorBuyers(), STATE_C);

		// Register state F (final state)
		fsm.registerLastState(new ToDelete(), STATE_F);

		// Register the transitions
		fsm.registerDefaultTransition(STATE_A, STATE_A);
		fsm.registerTransition(STATE_A, STATE_C, 2);
		fsm.registerDefaultTransition(STATE_C, STATE_F);

		addBehaviour(fsm);
	}

// add sleep time, for write information 
	private void Time(int t) {
		Thread thread = new Thread();
		try {
			thread.sleep(t * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
// add new agent (saller or buyer)
	private void startNewAgent(String className, String agentName,
			Object[] arguments) throws StaleProxyException {
		((AgentController) getContainerController().createNewAgent(agentName,
				className, arguments)).start();
	}
//generator sellers.
	private class NameSellers extends OneShotBehaviour {
		public void action() {
			try {
				startNewAgent("ual2.BookSellerAgent",
						"BookSellerAgent" + Math.random(), getArguments());
			} catch (StaleProxyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// BookSellerAgent sellerAgent = new BookSellerAgent( );
			System.out.println("Executing behaviour " + getBehaviourName());
			Time(10);
		}

		public int onEnd() {
			Random randomGenerator = new Random();
			int exitValue = randomGenerator.nextInt(3);
			System.out.println(exitValue);
			return exitValue;
		}
	}

// generator buyer. buy book name "s" default. 
	private class GeneratorBuyers extends OneShotBehaviour {
		// extends NamePrinter {
		public void action() {
			String[] ss = { "s" };
			try {
				startNewAgent("ual2.BookBuyerAgent",
						"BookBuyerAgent" + Math.random(), ss);
			} catch (StaleProxyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// BookBuyerAgent buyerAgent = new BookBuyerAgent();
			System.out.println("Executing behaviour " + getBehaviourName());

			Time(20);
		}

		public int onEnd() {
			Random randomGenerator = new Random();
			int exitValue = randomGenerator.nextInt(2);
			System.out.println(exitValue);
			return exitValue;
		}

	}
// end 
	private class ToDelete extends OneShotBehaviour {
		public void action() {
			System.out.println("End");
		}

		public int onEnd() {
			Random randomGenerator = new Random();
			int exitValue = randomGenerator.nextInt(3);
			System.out.println(exitValue);
			return exitValue;
		}
	}

}
