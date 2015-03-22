На цій лабораторній роботі я запустив тестові агенти і запропонував модифікацію: графічний інтерфейс для агента BookBuyerAgent.
Для цього я створив новий клас BookBuyerGui, додав новий метод
protected void takeDown() {
		// Закриття графічного інтерфейсу
		myGui.dispose();
		// Printout a dismissal message
		System.out.println("Buyer-agent " + getAID().getName()
				+ " terminating.");
	}


 для агента BookBuyerAgent.
Також підкорегував метод setTitle.