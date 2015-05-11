package ua.lab5.protocols;

import java.util.Random;

public class random {
	//клас виконання дій і генерування випадкових чисел
	private static int add;
	private static int sub;
	private static Float mul;
	private static Float div;

	//метод генерування випадкового числа від 0 до 10
	public static Integer Ran() {

		Random randomGenerator = new Random();
		int exitValue = randomGenerator.nextInt(10);
		return exitValue;
	}

	//метод обрахування суми, різниці, добутку і ділення двох чисел
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
	
	// метод перевірки дії
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
