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
package ua.edu.lp.cad.mas.lab5;

import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.basic.Action;
import jade.core.AID;
import jade.core.Agent;
import jade.core.ContainerID;
import jade.domain.FIPANames;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.RefuseException;
import jade.domain.JADEAgentManagement.CreateAgent;
import jade.domain.JADEAgentManagement.JADEManagementOntology;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.proto.AchieveREInitiator;
import jade.proto.AchieveREResponder;

import java.util.UUID;
import java.util.Vector;

/**
 * This example shows how to implement nested protocols. In this case in
 * particular we want to implement a broker agent that forwards incoming
 * requests to perform actions to another agent. To implement that we use an
 * <code>AchieveREResponder</code> ("Achieve Rational effect") and we register
 * an <code>AchieveREInitiator</code> in the state where the requested action
 * has to be performed.
 * 
 * @author Giovanni Caire - TILAB
 */
public class BrokerAgent extends Agent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6722260240298703947L;
	private AID responder;

	protected void setup() {
		// Read the name of agent to forward requests to
		Object[] args = getArguments();
		if (args != null && args.length > 0) {
			responder = new AID((String) args[0], AID.ISLOCALNAME);
			init();
		} else {
			final UUID uuid = UUID.randomUUID();

			try {
				String containerName = getContainerController().getContainerName();
				
				CreateAgent ca = new CreateAgent();
				ca.setAgentName(uuid.toString());
				ca.setClassName(FIPARequestResponderAgent.class.getName());
				ca.setContainer(new ContainerID(containerName, null));

				Action actExpr = new Action(getAMS(), ca);

				Codec codec = new SLCodec();
				getContentManager().registerLanguage(codec, FIPANames.ContentLanguage.FIPA_SL);
				getContentManager().registerOntology(JADEManagementOntology.getInstance());
				
				ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
				request.addReceiver(getAMS());
				request.setOntology(JADEManagementOntology.getInstance().getName());
				request.setLanguage(codec.getName());
				request.setProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST);
				
				getContentManager().fillContent(request, actExpr);

				addBehaviour(new AchieveREInitiator(this, request) {
					private static final long serialVersionUID = 2818161826776926883L;

					protected void handleInform(ACLMessage inform) {
						System.out.println("Agent successfully created");
						
						responder = new AID(uuid.toString(), AID.ISLOCALNAME);
						init();
					}

					protected void handleFailure(ACLMessage failure) {
						System.err.println("Error creating agent.");
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void init() {
		System.out.println("Agent " + getLocalName()
				+ " waiting for requests...");
		MessageTemplate template = MessageTemplate.and(MessageTemplate
				.MatchProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST),
				MessageTemplate.MatchPerformative(ACLMessage.REQUEST));

		AchieveREResponder arer = new AchieveREResponder(this, template) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4720916388686275267L;

			protected ACLMessage prepareResponse(ACLMessage request)
					throws NotUnderstoodException, RefuseException {
				System.out.println("Agent " + getLocalName()
						+ ": REQUEST received from "
						+ request.getSender().getName() + ". Action is "
						+ request.getContent());
				ACLMessage agree = request.createReply();
				agree.setPerformative(ACLMessage.AGREE);
				return agree;
			}
		};
		// Register an AchieveREInitiator in the PREPARE_RESULT_NOTIFICATION
		// state
		arer.registerPrepareResultNotification(new AchieveREInitiator(this,
				null) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -4149180503746115359L;

			// Since we don't know what message to send to the responder
			// when we construct this AchieveREInitiator, we redefine this
			// method to build the request on the fly
			protected Vector prepareRequests(ACLMessage request) {
				// Retrieve the incoming request from the DataStore
				String incomingRequestKey = (String) ((AchieveREResponder) parent).REQUEST_KEY;
				ACLMessage incomingRequest = (ACLMessage) getDataStore().get(
						incomingRequestKey);
				// Prepare the request to forward to the responder
				System.out.println("Agent " + getLocalName()
						+ ": Forward the request to " + responder.getName());
				ACLMessage outgoingRequest = new ACLMessage(ACLMessage.REQUEST);
				outgoingRequest
						.setProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST);
				outgoingRequest.addReceiver(responder);
				outgoingRequest.setContent(incomingRequest.getContent());
				outgoingRequest.setReplyByDate(incomingRequest.getReplyByDate());
				Vector v = new Vector(1);
				v.addElement(outgoingRequest);
				return v;
			}

			protected void handleInform(ACLMessage inform) {
				storeNotification(ACLMessage.INFORM);
			}

			protected void handleRefuse(ACLMessage refuse) {
				storeNotification(ACLMessage.FAILURE);
			}

			protected void handleNotUnderstood(ACLMessage notUnderstood) {
				storeNotification(ACLMessage.FAILURE);
			}

			protected void handleFailure(ACLMessage failure) {
				storeNotification(ACLMessage.FAILURE);
			}

			protected void handleAllResultNotifications(Vector notifications) {
				if (notifications.size() == 0) {
					// Timeout
					storeNotification(ACLMessage.FAILURE);
				}
			}

			private void storeNotification(int performative) {
				if (performative == ACLMessage.INFORM) {
					System.out.println("Agent " + getLocalName()
							+ ": brokerage successful");
				} else {
					System.out.println("Agent " + getLocalName()
							+ ": brokerage failed");
				}

				// Retrieve the incoming request from the DataStore
				String incomingRequestkey = (String) ((AchieveREResponder) parent).REQUEST_KEY;
				ACLMessage incomingRequest = (ACLMessage) getDataStore().get(
						incomingRequestkey);
				// Prepare the notification to the request originator and store
				// it in the DataStore
				ACLMessage notification = incomingRequest.createReply();
				notification.setPerformative(performative);
				String notificationkey = (String) ((AchieveREResponder) parent).RESULT_NOTIFICATION_KEY;
				getDataStore().put(notificationkey, notification);
			}
		});

		addBehaviour(arer);
	}
}
