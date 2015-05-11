package ua.lab5.protocols;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class InitiatorGUI  extends JFrame {
	/**
	 * Клас InitiatorGUI - для графічного відображення дій.
	 */
	private static final long serialVersionUID = -7027921827955923008L;
	private JTextField textField; //поле вводу першого числа
	private JTextField textField_1; //поле вводу другого числа
	JTextField textField_2; //поле виведення результату
	String[] actions = { "+", "-", "*", "/" }; //Стрічка дій
	JComboBox comboBox;
	Character acsn='+';//символ дії
	FIPARequestInitiatorAgent agn;
		
	
	public InitiatorGUI(FIPARequestInitiatorAgent a) {
		super(a.getLocalName());
		agn=a;
		JPanel panel = new JPanel();
		panel.setLayout(null);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		//опис поля вводу
		textField = new JTextField();
		textField.setBounds(29, 24, 43, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		//опис поля вводу
		textField_1 = new JTextField();
		textField_1.setBounds(135, 25, 43, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		//опис кнопки
		JButton button = new JButton("\u041E\u0431\u0447\u0438\u0441\u043B\u0438\u0442\u0438");
		button.setBounds(188, 24, 89, 23);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField_2.setText(agn.sendMessage(acsn+";"+Integer.parseInt(textField.getText())+";"+Integer.parseInt(textField_1.getText()))); 
			}
		});
		panel.add(button);
		
		comboBox = new JComboBox<Object>(actions);
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			acsn=actions[comboBox.getSelectedIndex()].charAt(0);
			}
		});
		comboBox.setBounds(82, 24, 43, 20);
		panel.add(comboBox);
		
		//опис поля виводу
		textField_2 = new JTextField();
		textField_2.setBounds(92, 79, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		lblNewLabel.setBounds(26, 81, 78, 17);
		panel.add(lblNewLabel);
	}
	
	//метод відображення графічного інтерфейсу
	public void showGui() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		setPreferredSize(new Dimension(240, 130));
		setSize(centerX/2, centerY/2);
		super.setVisible(true);
	}	
} 
