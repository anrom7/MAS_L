package ua.agentlab;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
  @author Giovanni Caire - TILAB
 */
class BookSellerGui extends JFrame {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1331346802753304828L;

	private BookSellerAgent myAgent;
	
	private JTextField titleField, priceField,countField;
	
	BookSellerGui(BookSellerAgent a) {
		super(a.getLocalName());
		
		myAgent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,3));
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
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myAgent.doDelete();
			}
		} );
		
		setResizable(false);
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

