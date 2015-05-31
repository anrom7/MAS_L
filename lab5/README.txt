Modification allows to run multiple requests through the broker at once.
To do this, BrokerAgent was modified in a way that allows to connect to multiple responders at once.

Each responder has it's own ID (name). By making a loop that reads all ID's (names) of requesters we can initialize all of them.

"
...
if (args != null && args.length > 0) {
		 System.out.println("Agent "+getLocalName()+" waiting for requests...");//modified for better execution. also allows multiple requests
  		for (int i=0;i<args.length;i++)
  		{
  			responder = new AID((String) args[i], AID.ISLOCALNAME);
  		  	MessageTemplate template = MessageTemplate.and(
  			  		MessageTemplate.MatchProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST),
  			  		MessageTemplate.MatchPerformative(ACLMessage.REQUEST) );
...
"					
  
To make sure the correct message is sent to correct agent forwarding section was also modified to include ID check

"
...
Vector<ACLMessage> v = new Vector<ACLMessage>(globalArgs.length); //new vector to handle multiple requests
								for (int j=0;j<globalArgs.length;j++)
								{
									AID localResponder = new AID((String) globalArgs[j], AID.ISLOCALNAME);
									System.out.println("Agent "+getLocalName()+": Forward the request to "+localResponder.getName());
									ACLMessage outgoingRequest = new ACLMessage(ACLMessage.REQUEST);
									outgoingRequest.setProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST);
									outgoingRequest.addReceiver(localResponder);
									outgoingRequest.setContent(incomingRequest.getContent());
									outgoingRequest.setReplyByDate(incomingRequest.getReplyByDate());
									v.addElement(outgoingRequest);
								}
...
"