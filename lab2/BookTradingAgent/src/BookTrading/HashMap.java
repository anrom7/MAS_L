package BookTrading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

public class HashMap {
	private int price;
	private String name;
	private String line;

	public HashMap() {

		JFileChooser chooser = new JFileChooser();
		
		int returnVal = chooser.showDialog(null, "Open File");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You choose to open this file: " + chooser.getSelectedFile().getName());

			try {
				BufferedReader reader = new BufferedReader(new FileReader(chooser.getSelectedFile()));
				
				while ((line = reader.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, "|");
					name = st.nextToken();
					price = Integer.parseInt(st.nextToken());
					BookSellerAgent.catalogue.put(name, new Integer(price));
					System.out.println(name + " inserted into catalogue. Price = " + price);
				}
			} catch (IOException e) {
				System.out.println("Data input error");
			}
			
		}
	}
}
