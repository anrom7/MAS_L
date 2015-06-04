package ua.agentlab5;

import java.io.ObjectInputStream.GetField;
import java.util.Random;

public class random {
	private static int add;
	private static int sub;
	private static Float mul;
	private static Float div;
// generator random numbers
	public static Integer Ran() {

		Random randomGenerator = new Random();
		int exitValue = randomGenerator.nextInt(10);
		return exitValue;
	}
// perform actions add, sub, mul and div
	public static void Result(int one, int two) {

		add = one + two;
		sub = one - two;
		mul = ((float) one * (float) two);

		try {
			div = ((float) one / (float) two);
		} catch (Exception ex) {
			System.out.println("Exception 'div by 0' +" + ex);
			div = (float) -1.0;
		}

	}
// checking of action
	public static String getCheck(Character character) {
		String string = "";
		switch (character) {
		case ('+'):
			string = "" + add;
			break;
		case ('-'):
			string = "" + sub;
			break;

		case ('*'):
			string = "" + mul;
			break;
		case ('/'):
			string = "" + div;
			break;

		}
		return string;
	}

}
