package by.course.glavdel_olga.classes_and_object.task09.main;

import by.course.glavdel_olga.classes_and_object.task09.entity.Book;
import by.course.glavdel_olga.classes_and_object.task09.entity.Library;
import by.course.glavdel_olga.classes_and_object.task09.logic.BookLogic;

//Создать класс Book,  спецификация которого приведена ниже. Определить конструкторы, set- И get-методы, toString().
//Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
//Задать критерии выбора данных и вывести эти данные на консоль

//Класс Book: id, название, авторы, издательство, год издания, количество страниц, цена, тип переплета
//Найти и вывести:
//список книг заданного автора;
//список книг, выпущенных заданным издательством
//список книг, выпущенных после заданного года

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("History", new String[] { "Ivanov", "Petrov" }, "Moskow-house", 2005, 234, 15.16, "hard");
		Book book3 = new Book("Word History", new String[] { "Petrov" }, 2016, 17.56);
		Book book4 = new Book("Music", new String[] { "Sidorov" }, "Kiev-house", 2020);

		
		Library library = new Library (book1, book2,book3,book4);
		
		BookLogic logic = new BookLogic();
		
		logic.findAuthor(library);
		
		logic.findPublishingHouse(library);
		
		logic.findBookAfterYear(library);
	}

}
