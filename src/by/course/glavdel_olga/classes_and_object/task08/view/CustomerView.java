package by.course.glavdel_olga.classes_and_object.task08.view;

import java.util.Scanner;

import by.course.glavdel_olga.classes_and_object.task08.entity.Customer;

public class CustomerView {

	public void print(Customer customer) {
		System.out.println(customer);
	}

	public void print(Customer[] listCustomers) {
		for (Customer customer : listCustomers) {
			System.out.println(customer);
		}
	}

	public long enterLong(String message) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);

		while (!scanner.hasNextLong()) {
			scanner.next();
			System.out.println(message);
		}

		return scanner.nextLong();
	}

}
