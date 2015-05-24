# MAS_L
Multi-agent system labs
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
