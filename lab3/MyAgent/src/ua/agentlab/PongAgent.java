package ua.agentlab;
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
                  // ���� �� ����� ���������� ���� ������ � ���������� �����������
                    System.out.println(" � " + myAgent.getLocalName() + " received: " + msg.getContent());
                    ACLMessage reply = msg.createReply();
                    reply.setPerformative(ACLMessage.INFORM); // ������������ ����������� �����������
                    reply.setContent("Pong"); // ���� �����������
                    send(reply);// �������� �����������
                }
block();
}
});
}
}
