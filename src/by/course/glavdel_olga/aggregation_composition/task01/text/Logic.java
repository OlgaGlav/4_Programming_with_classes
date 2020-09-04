package by.course.glavdel_olga.aggregation_composition.task01.text;

import java.util.Scanner;

public class Logic {

	Text text = new Text();

	public void printText(Text text) {

		text.printText(text);
	}

	public void printHeading(Text text) {

		System.out.println(text.getHeading() + ".");
	}

	public void addWord(String word, Text text) {

		int numberSentence = enterInt("Введите номер предложения, которое изменить ");

		numberSentence = checkPositiv(numberSentence, "Введите номер предложения, которое изменить ");

		numberSentence = checkValue(numberSentence, text);

		text = text.addWord(word, numberSentence, text);
		
		printText(text);
	}

	private int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);

		while (!scanner.hasNextInt()) {

			System.out.println("Некорректный ввод. " + message);
			scanner.next();
		}
		return scanner.nextInt();
	}

	private int checkValue(int numberSentence, Text text) {

		if (numberSentence > text.getSentence().length) {

			numberSentence = text.getSentence().length;
		}
		return numberSentence;
	}

	private int checkPositiv(int nextInt, String message) {

		while (nextInt < 0) {

			System.out.println("Некорректный ввод. ");

			nextInt = enterInt(message);
		}
		return nextInt;
	}
}
