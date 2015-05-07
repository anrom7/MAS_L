1. Created a project Myagent
2. Created a project Book
3. Modified the project "Book": Created new class "book" with quantity of books available for selling

package ua.agentlab;

public class Book
{
	String title;
	Integer price;
	public Book(String t, Integer p)
	{
		title=t;
		price=p;
	}
}

4. Modified the class "BookSellerAgent":
private ArrayList<Book> catalogue; - list of books (displaying the name,price of a book and its quantity) 
 	setup() creating a new list - catalogue = new ArrayList<Book>();
        action() method,that enables adding new books to indicate the number of copies:
public void action() {
				for(int i=0;i<count;i++){
					catalogue.add(new Book(title,price));
					//catalogue.put(title, new Integer(price));
				}
				System.out.println(Integer.toString(count) +" books "+title+" inserted into catalogue. Price = "+price);
			}
		}
5. BookSellerGui refreshed:added to the toolbar TextField and Label, which will be responsible for the introduction of these amounts.
private JTextField titleField, priceField,countField;
	
	BookSellerGui(BookSellerAgent a) {
		super(a.getLocalName());
		
		myAgent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 3));
		p.add(new JLabel("Book title:"));
		titleField = new JTextField(15);
		p.add(titleField);
		p.add(new JLabel("Price:"));
		priceField = new JTextField(15);
		p.add(priceField);
		p.add(new JLabel("Count:"));
		countField = new JTextField(15);
		p.add(countField);
		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					String title = titleField.getText().trim();
					String price = priceField.getText().trim();
					String count = countField.getText().trim();
					myAgent.updateCatalogue(title, Integer.parseInt(price),Integer.parseInt(count));
					titleField.setText("");
					priceField.setText("");
					countField.setText("");
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(BookSellerGui.this, "Invalid values. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		} );
		p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
