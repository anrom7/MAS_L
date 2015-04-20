1. Створила проект, додала класи.
2. Модифікація: запуск кожної поведінки в окремому потоці

//оголошення фабрики потоків, щоб запускати кожну поведінку в агенті в окремому потоці
	private ThreadedBehaviourFactory tbf = new ThreadedBehaviourFactory();


в методі setup():

//призначення окремих поведінок для даної фабрики 
		addBehaviour(tbf.wrap(new OfferRequestsServer()));// поведінка оголошення вільних книжок, які продаються

		addBehaviour(tbf.wrap(new PurchaseOrdersServer()));// підтвердження угоди і продаж книжки
	