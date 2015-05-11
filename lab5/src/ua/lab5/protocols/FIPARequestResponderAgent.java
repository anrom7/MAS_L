/**
 * ***************************************************************
 * JADE - Java Agent DEvelopment Framework is a framework to develop
 * multi-agent systems in compliance with the FIPA specifications.
 * Copyright (C) 2000 CSELT S.p.A.
 * 
 * GNU Lesser General Public License
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation,
 * version 2.1 of the License.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA  02111-1307, USA.
 * **************************************************************
 */
package ua.lab5.protocols;

import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.proto.AchieveREResponder;
import jade.domain.FIPANames;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.RefuseException;
import jade.domain.FIPAAgentManagement.FailureException;

/**
   This example shows how to implement the responder role in 
   a FIPA-request interaction protocol. In this case in particular 
   we use an <code>AchieveREResponder</code> ("Achieve Rational effect") 
   to serve requests to perform actions from other agents. We use a 
   random generator to simulate request refusals and action execution 
   failures.
   @author Giovanni Caire - TILAB
 */
public class FIPARequestResponderAgent extends Agent {
	/**
	 * Клас який виконує дії
	 */
	private static final long serialVersionUID = 1L;
	String action;
	boolean b = false;
	String cont="";
	random random = new random();
  protected void setup() {
	  
	  Object[] args = getArguments();
	  action = (String) args[0];//визначення аргументів
	  
  	System.out.println("Agent "+getLocalName()+" waiting for requests...");
  	MessageTemplate template = MessageTemplate.and(
  		MessageTemplate.MatchProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST),
  		MessageTemplate.MatchPerformative(ACLMessage.REQUEST) );
  		
  	//метод прийому повідомлень
		addBehaviour(new AchieveREResponder(this, template) {
			//метод підготовки відповіді
			protected ACLMessage prepareResponse(ACLMessage request) throws NotUnderstoodException, RefuseException {
				System.out.println("Agent "+getLocalName()+": REQUEST received from "+request.getSender().getName()+". Action is "+request.getContent());
				if (checkAction(request.getContent())) {
					// We agree to perform the action. Note that in the FIPA-Request
					// protocol the AGREE message is optional. Return null if you
					// don't want to send it.
					System.out.println("Agent "+getLocalName()+": Agree");
					ACLMessage agree = request.createReply();
					agree.setPerformative(ACLMessage.AGREE);
					cont = request.getContent();
					return agree;
				}
				else {
					// We refuse to perform the action
					System.out.println("Agent "+getLocalName()+": Refuse");
					throw new RefuseException("check-failed");
				}
			}
			
			//метод підготовки і відправки результату
			protected ACLMessage prepareResultNotification(ACLMessage request, ACLMessage response) throws FailureException {
				if (performAction()) {
					String[] text = cont.split(";");
					random.Result(Integer.parseInt(text[1]), Integer.parseInt(text[2]));				
					System.out.println("Agent "+getLocalName()+": Action successfully performed");
					ACLMessage inform = request.createReply();
					inform.setPerformative(ACLMessage.INFORM);
					inform.setContent(random.getCheck(text[0].charAt(0)));
					return inform;
				}
				else {
					System.out.println("Agent "+getLocalName()+": Action failed");
					throw new FailureException("unexpected-error");
				}	
			}
		} );
  }
  
  //метод перевірки підтримки дії
  private boolean checkAction(String string) {
  	// Simulate a check by generating a random number
	  
	  if (action.equals(string.substring(0, 1))){
		  b = true;
	  } else {
		  b = false;
	  }
	  
  	return (b);
  }
  
  //метод підтвердження дії
  private boolean performAction() {
  	// Simulate action execution by generating a random number
  	return (b);
  }
}

