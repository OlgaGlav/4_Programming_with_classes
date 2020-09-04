package by.course.glavdel_olga.classes_and_object.task08.main;

//Создать класс  Customer, спецификация которого приведена ниже. Определить конструкторы, set- И get-методы, toString().
//Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
//Задать критерии выбора данных и вывести эти данные на консоль

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета
//Найти и вывести:
//список покупателей в алфавитном порядке;
//список покупателей, у которых номер кредитной карточки находится в заданном интервале.

import by.course.glavdel_olga.classes_and_object.task08.entity.Customer;
import by.course.glavdel_olga.classes_and_object.task08.logic.CustomerLogic;

public class Main {

	public static void main(String[] args) {

		CustomerLogic logic = new CustomerLogic();

		Customer customer1 =new Customer(15, "Petrov", "Oleg", "Ivanovich", "Minsk", 151515, 315151515);
		Customer customer2 =new Customer(20, "Ivanov", "Pavel", "Maximovich", "Mogilev", 172221, 7591515);
		Customer customer3 =new Customer(25, "Sidorov", "Andrey", "Alekseevich", "Borisov", 251697, 9876545);
		Customer customer4 =new Customer(17, "Zevnov", "Boris", "Pavlovich", "Grodno", 1987456, 22221515);

		Customer[] listCustomer = new Customer []{ customer1, customer2, customer3, customer4};
		
		logic.sortBySurname(listCustomer);
		
		logic.numberCreditCardInRange(listCustomer);
		

	}

}
