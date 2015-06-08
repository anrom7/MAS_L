1. I was create project, and add classes.
2. Modification: class"BrokerAgent"
It added that checkOffer function randomly returns True or False,
If you return True - if the broker receives the application and sends further processing.
Otherwise, sends a message Reject, which interrupts the chain of messages.

Chenget Code:
ACLMessage agree = request.createReply();
if (checkOffer())
{
System.out.println("Agent "+getLocalName()+": REQUEST received from "+request.getSender().getName()+". Action is "+request.getContent());
agree.setPerformative(ACLMessage.AGREE);
}
else
{
System.out.println("Agent "+getLocalName()+": REQUEST received from "+request.getSender().getName()+". Action is REJECTED. OFFER IS TOO BAD!!");
agree.setPerformative(ACLMessage.REJECT_PROPOSAL);
}
