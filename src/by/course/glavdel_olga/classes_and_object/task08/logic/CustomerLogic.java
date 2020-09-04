package by.course.glavdel_olga.classes_and_object.task08.logic;

import java.util.Arrays;
import by.course.glavdel_olga.classes_and_object.task08.entity.Customer;
import by.course.glavdel_olga.classes_and_object.task08.view.CustomerView;

public class CustomerLogic {

	CustomerView view = new CustomerView();

	public void sortBySurname(Customer[] listCustomers) {
		Arrays.sort(listCustomers, new Customer.SurnameComparator());
		view.print(listCustomers);
	}


	public void numberCreditCardInRange(Customer[] listCustomers) {
		long startInterval;
		long endInterval;
		
		startInterval= view.enterLong("Введите начало интервала ");

		endInterval=view.enterLong("Введите конец интервала ");
		
		for(Customer customer: listCustomers) {
			if(customer.getNumberCreditCard()<= endInterval && customer.getNumberCreditCard()>=startInterval) {
				view.print(customer);
			}
		}
		
	}

}
