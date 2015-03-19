package Lab2;

import jade.core.AID;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class BookBuyerGui extends JFrame {
	private static int countAdd = 0;
	private BookBuyerAgent myAgent;
private JTextField titleField, priceField, genreField;
	
	BookBuyerGui(BookBuyerAgent a) {
		super(a.getLocalName());
		
		myAgent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("Book title:"));
		titleField = new JTextField(15);//поля для введення назви книги
		p.add(titleField);
		p.add(new JLabel("Max price:"));
		priceField = new JTextField(15);//поля для введення ціни
		p.add(priceField);

		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					String title = titleField.getText().trim();
					String maxPrice = priceField.getText().trim();
					myAgent.addBook(title, Integer.parseInt(maxPrice));
					titleField.setText("");
					priceField.setText("");
					countAdd++;//кількість введених книг покупцем
					checkAdd();//перевіряє щоб не було введено більше 1 книги
				
					
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(BookBuyerGui.this, "Invalid values. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		} );
		
		
		p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {

			}
		} );
		
		setResizable(false);
		
}
	public void checkAdd(){// метод який перевірє скільки введено книг
		if(countAdd == 1)// якщо книг більше 1 то вікно закривається
		this.setVisible(false);
	}
	public void showGui() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		super.setVisible(true);
	}	

}
