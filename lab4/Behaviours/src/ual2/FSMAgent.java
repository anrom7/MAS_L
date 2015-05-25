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
import java.util.Scanner;
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
	// State name declaration
	private static final String STATE_A = "A";
	private static final String STATE_B = "B";
	private static final String STATE_C = "C";
	private static Integer agentBuyerIterator = 1;
	
	
	protected void setup() {
		FSMBehaviour fsm = new FSMBehaviour(this) {
			public int onEnd() {
				System.out.println("FSM behaviour completed.");
				myAgent.doDelete();
				return super.onEnd();
			}
		};

		fsm.registerFirstState(new BuyersGenerator(), STATE_A);
		fsm.registerState(new SellerGenerator(), STATE_B);
		fsm.registerLastState(new onEnd(), STATE_C);

		// Register the transitions
		fsm.registerTransition(STATE_A, STATE_A, 0);
		fsm.registerTransition(STATE_A, STATE_B, 1);
		fsm.registerDefaultTransition(STATE_B, STATE_C);

		addBehaviour(fsm);
	}

// Start new agent (seller/buyer)
	private void startNewAgent(String className, String agentName,
			Object[] arguments) throws StaleProxyException {
		((AgentController) getContainerController().createNewAgent(agentName,
				className, arguments)).start();
	}
//Seller generator (there is only one seller)
	private class SellerGenerator extends OneShotBehaviour {
		public void action() {
			try {
				startNewAgent("ual2.BookSellerAgent",
						"BookSellerAgent", getArguments());
			} catch (StaleProxyException e) {
				e.printStackTrace();
			}

			System.out.println("Executing behaviour " + getBehaviourName());
		}

		public int onEnd() {
			return 0;
		}
	}
//Buyer generator (generates buyers
	private class BuyersGenerator extends OneShotBehaviour {
		String Answer = "Y"; //set default answer
		Scanner scanInBookName = new Scanner(System.in);
		Scanner scanInYN = new Scanner(System.in);
		String[] bookName = {"default"};
		public void action() {
			//read book name
			System.out.println("Which book are we looking for?");
			bookName[0] = scanInBookName.nextLine();
			
			//read answer whether look for another book or no
			System.out.println("Are we looking for another book? (Y/N)");
			Answer = scanInYN.nextLine();
			
			try {
				startNewAgent("ual2.BookBuyerAgent",
						"BookBuyerAgent" + agentBuyerIterator, bookName);
			} catch (StaleProxyException e) {
				e.printStackTrace();
			}
			agentBuyerIterator++;			
		}
		
		public int onEnd() {	
			//act considering on user answer Y or N
			if (Answer.charAt(0) == 'Y'){
				System.out.println("You choose to look for another book");
				return 0;
			} else {
				System.out.println("Yo choose to stop adding more books");
				scanInBookName.close();
				scanInYN.close();
				return 1;
			}
		}
	}

	private class onEnd extends OneShotBehaviour {
		public void action() {
			System.out.println("Take actions on behaviour ending");
			System.out.println("End");
		}

		public int onEnd() {
			return 0;
		}
	}

}
