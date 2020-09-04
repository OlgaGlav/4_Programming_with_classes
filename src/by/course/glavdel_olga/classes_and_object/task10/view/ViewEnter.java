package by.course.glavdel_olga.classes_and_object.task10.view;

import java.util.Scanner;

public class ViewEnter {

	public String enterString(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		return scanner.next();
	}

	
	public int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);
		
		while (!scanner.hasNextInt()) {
			
			scanner.nextInt();
			System.out.println(message);
		}

		return scanner.nextInt();
	}
}
