package com.multiAgent;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class PongAgent extends Agent {
	private static final long serialVersionUID = 3663966406239393054L;

	protected void setup() {
		addBehaviour(new CyclicBehaviour(this) {
			private static final long serialVersionUID = -1912882200351395625L;

			public void action() {
				ACLMessage msg = receive();
				if (msg != null) {
					// ¬ив≥д на екран локального ≥мен≥ агента ≥ отриманого
					// пов≥домленн€
					System.out.println(" Ц " + myAgent.getLocalName()
							+ " received: " + msg.getContent());
					ACLMessage reply = msg.createReply();
					reply.setPerformative(ACLMessage.INFORM); // встановлюЇмо
																// перформатив
																// пов≥домленн€
					reply.setContent("Pong"); // вм≥ст пов≥домленн€
					send(reply);// в≥дправка пов≥домленн€
				}
				block();
			}
		});
	}
}
