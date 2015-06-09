package ua.agentlab;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.AMSService;
import jade.domain.FIPAAgentManagement.AMSAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.lang.acl.ACLMessage;
public class PingAgent extends Agent {
private static final long serialVersionUID = 8257866411543354395L;
public void setup() {
System.out.println("Hello World, my name is : " + getAID().getName());
// �������� ������ ���������� � ����
addBehaviour(new CyclicBehaviour(this) {
private static final long serialVersionUID = 7774831398907094833L;
public void action() {
ACLMessage msg = receive();
if (msg != null) {
                  // ���� �� ����� ���������� ���� ������ � ���������� �����������
                    System.out.println(" � " + myAgent.getLocalName() + " received: " + msg.getContent());
                }
// ������� ��������, �� ����� � ���� ���������� ������ ���� � ������ �����������
block();
}
});
AMSAgentDescription[] agents = null;
try {
            SearchConstraints c = new SearchConstraints();
            c.setMaxResults(new Long(-1));
            agents = AMSService.search(this, new AMSAgentDescription(), c);
        } catch (Exception e) {
            System.out.println("Problem searching AMS: " + e);
            e.printStackTrace();
        }
for (AMSAgentDescription agent : agents) {
            AID agentID = agent.getName();
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(agentID);// id ������ ����� ����������� �����������
            msg.setLanguage("English");// ���� �����������
            msg.setContent("Ping"); // ���� �����������
            send(msg); // ³������� �����������
        }
}
}

