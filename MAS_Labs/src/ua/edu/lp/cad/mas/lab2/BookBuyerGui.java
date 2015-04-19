package ua.edu.lp.cad.mas.lab2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import ua.edu.lp.cad.mas.lab2.BookBuyerAgent.BookHandler;

/*
 * Реалізація графічного інтерфейсу для агента покупця
 * 
 * */

public class BookBuyerGui extends JFrame {
	private static final long serialVersionUID = 1331346802753304828L;

	private JTextField titleField = new JTextField();
	
	private BooksModel booksModel = null;
	private JTable tblBooks = null;
	
	public BookBuyerGui(BookBuyerAgent a) {
		super(a.getLocalName());

		booksModel = new BooksModel(a);
		tblBooks = new JTable(booksModel);
		
		JPanel pnlMain = new JPanel(new BorderLayout());
		
		pnlMain.add(new JLabel("Books list"), BorderLayout.NORTH);
		pnlMain.add(tblBooks, BorderLayout.CENTER);
		
		JPanel pnlBottom = new JPanel(new BorderLayout());
		pnlBottom.add(new JLabel("Book title:"), BorderLayout.WEST);
		pnlBottom.add(titleField, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					// Додавання нової книги в чергу для покупки
					String title = titleField.getText().trim();
					booksModel.addBook(title);
					titleField.setText("");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(BookBuyerGui.this,
							"Invalid values. " + e.getMessage(), "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		pnlBottom.add(addButton, BorderLayout.EAST);
		
		pnlMain.add(pnlBottom, BorderLayout.SOUTH);

		getContentPane().add(pnlMain, BorderLayout.CENTER);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				booksModel.shootDown();
			}
		});
	}

	public void showGui() {
		pack();
		setMinimumSize(new Dimension(500, 250));
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int) screenSize.getWidth() / 2;
		int centerY = (int) screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		super.setVisible(true);
	}
	
	/*
	 * Модель яка відповідає за відображення списку
	 * усіх книг які повинен купити покупець
	 * */
	
	private class BooksModel extends AbstractTableModel {
		private static final long serialVersionUID = -1563735225238755621L;
		
		private BookBuyerAgent myAgent = null;
		private List<String> books = new ArrayList<String>();
		
		public BooksModel(BookBuyerAgent myAgent) {
			this.myAgent = myAgent;
			
			myAgent.addBookHandler(new BookHandler() {
				@Override
				public void onBookBay(String title) {
					books.remove(title);
					myAgent.removeBook(title);
					fireTableDataChanged();
				}
			});
		}
		
		@Override
		public int getRowCount() {
			return books.size();
		}

		@Override
		public int getColumnCount() {
			return 1;
		}

		@Override
		public String getColumnName(int column) {
			return "Title";
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			return String.class;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return books.get(rowIndex);
		}
		
		public void addBook(String title) {
			myAgent.addBook(title);
			books.add(title);
			fireTableDataChanged();
		}
		
		public void shootDown() {
			myAgent.doDelete();
		}
	}
}