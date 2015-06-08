# MAS_L
Multi-agent system labs
Виконав 3 лабораторну роботу
Я згенерував код для джави із використанням протиже. Додав його до проекту і до онтології. В адресі додав поле континент і перевірку для нього.
Результат:

ENTER the company name --> c1
ENTER details of the company where people will be engaged
  Company address
    Street ------> s1
    Number ------> 1
    City   ------> c1
    Continent   -----> Europa
This is the EngagerAgent representing the company c1
ENTER the local name of the Engager agent --> ea1
ENTER details of the company where people will be engaged
  Company name --> c1
  Company address
    Street ------> s1
    Number ------> 1
    City   ------> c1
    Continent   -----> Africa
ENTER details of person to engage
  Person name --> t1
  Person age ---> 26
  Person address
    Street -----> s1
    Number -----> 1
    City   -----> c1
Person t1 is already working for c1
Would you like to continue?[y/n] 
n
ENTER the local name of the Engager agent --> ea1
ENTER details of the company where people will be engaged
  Company name --> c1
  Company address
    Street ------> s1
    Number ------> 1
    City   ------> c1
    Continent   -----> Europa
ENTER details of person to engage
  Person name --> t2
  Person age ---> 26
  Person address
    Street -----> s1
    Number -----> 1
    City   -----> c1
Engagement agreed. Waiting for completion notification...
Engagement successfully completed
Would you like to continue?[y/n] 


Виконав 4 лабораторну роботу
Я переробив поведінку покупця з 2 лабораторної лаби, де покупець виконував дії з допомогою однієї поведінки і кроками.
В даній роботі я переробив цю поведінку за допомогою складних поведінок.
Результати можна переглянути в папці results.

Лабораторна номер 5
Я переробив BrokerAgent таким чином що тепер якщо йому не вказати параметру він самостійно створить респондера.
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
