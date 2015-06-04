1. Project created, added classes.
2. Updates: Class "BrokerAgent"
Were added checkOffer function that randomly returns True or False states,
If you return True - then the broker accepts the application and sends it to verification.
Otherwise, sends a message Reject, that interrupts the message chain.

The updated code:
ACLMessage agree = request.createReply ();
if (checkOffer ())
{
System.out.println ("Agent" + getLocalName () + ": REQUEST received from" + request.getSender (). GetName () + ". Action is" + request.getContent ());
agree.setPerformative (ACLMessage.AGREE);
}
else
{
System.out.println ("Agent" + getLocalName () + ": REQUEST received from" + request.getSender (). GetName () + ". Action is REJECTED. OFFER IS TOO BAD !!");
agree.setPerformative (ACLMessage.REJECT_PROPOSAL);
}