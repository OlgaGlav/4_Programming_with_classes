package by.course.glavdel_olga.classes_and_object.task09.view;

import by.course.glavdel_olga.classes_and_object.task09.entity.Book;

public class BookViewOutput {

	public void print(Book book) {
		System.out.println("Название книги \"" + book.getName() + "\", автор" + printAuthor(book) + "издательство "
				+ book.getPublishingHouse() + ", год издания " + book.getYear());
	}

	
	private StringBuilder printAuthor(Book book) {
		StringBuilder authors = new StringBuilder();

		for (int i = 0; i < book.getAuthor().length; i++) {

			authors.append(" " + book.getAuthor()[i] + ", ");
		}
		return authors;
	}

	
	public void printNoData() {
		System.out.println("По данному запросу нет данных ");
	}

}
