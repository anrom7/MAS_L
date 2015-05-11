Changes: 
1) Created new GUI for Agent Buyer:
...
	BookBuyerGui(BookBuyerAgent a) {
		super(a.getLocalName());
		
		myAgent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,3));
		p.add(new JLabel("Book title:"));
		titleField = new JTextField(15);
		p.add(titleField);
		p.add(new JLabel("Maximum price:"));
		priceField = new JTextField(15);
		p.add(priceField);
		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Search");
		addButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					String title = titleField.getText().trim();
					String price = priceField.getText().trim();
					myAgent.search(title, Integer.parseInt(price));
					titleField.setText("");
					priceField.setText("");
				}
...
GUI has 2 text fields: Title of book to search for and Maximum Price, which the buyer is comfortable with.

2) Following changes where made in BookBuyerAgent:
	a) Following lines where added:	
...
		private Integer targetBookPrice;// Target price - maximum price Buyer is comfortable with
		private BookBuyerGui myGui;//Buyer GUI - class for Buyer GUI
...
		myGui = new BookBuyerGui(this); - Shell for Buyer GUI (Loads BookBuyerGUI)
		myGui.showGui();
...
	protected void takeDown() { - shuts down Buyer terminal and closes Buyer GUI
		// Deregister from the yellow pages
		try {
			DFService.deregister(this);
		}
		catch (FIPAException fe) {
			fe.printStackTrace();
		}
				// Close the GUI
				myGui.dispose();
...
/**
    This is invoked by the GUI when the user adds a new book to look for 
	 */
	public void search(final String title, final int price) { - Fetches Title and Maximum Price from GUI
		addBehaviour(new OneShotBehaviour() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4363910349522932265L;

			public void action() {
				
				targetBookTitle = title;
				targetBookPrice = price;
				System.out.println(" Searching for: "+title+" With price less then: "+price);
			}
		} );
	}
...
	b) Following lines where removed (commented out):
...
/*Object[] args = getArguments();                             - Data is being extracted from GUI making this code obsolete
		if (args != null && args.length > 0) {
			targetBookTitle = (String) args[0];
			System.out.println("Trying to buy  "+targetBookTitle);*/
	...
		/*else {
			// Make the agent terminate
			System.out.println("No target book title specified");
			doDelete();
		}
	}*/
...

3) Other minor changes, fixes, and debuging.
