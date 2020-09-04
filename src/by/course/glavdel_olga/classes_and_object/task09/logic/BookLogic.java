package by.course.glavdel_olga.classes_and_object.task09.logic;

import by.course.glavdel_olga.classes_and_object.task09.entity.Library;
import by.course.glavdel_olga.classes_and_object.task09.view.BookViewEnter;

public class BookLogic {

	BookViewEnter view = new BookViewEnter();

	public void findAuthor(Library library) {

		String author = view.enterString("Введите фамилию автора ");

		library.findSameAuthor(author, library);
	}

	public void findPublishingHouse(Library library) {

		String publishingHouse = view.enterString("Введите издательство ");

		library.findSamePublishingHouse(publishingHouse, library);
	}

	public void findBookAfterYear(Library library) {

		int year = view.enterInt("Введите год, с которого следует начать поиск ");

		library.findBookAfterYear(year, library);
	}

}
