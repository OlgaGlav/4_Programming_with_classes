package by.course.glavdel_olga.classes_and_object.task09.entity;

import java.util.Arrays;

import by.course.glavdel_olga.classes_and_object.task09.view.BookViewEnter;
import by.course.glavdel_olga.classes_and_object.task09.view.BookViewOutput;

public class Library {

	private Book[] library;

	Book book = new Book();

	BookViewEnter viewEnter = new BookViewEnter();
	BookViewOutput viewOutput = new BookViewOutput();

	public Library() {
		this.library = new Book[10];
	}

	public Library(Book... book) {
		super();
		this.library = new Book[book.length];

		for (int i = 0; i < book.length; i++) {

			this.library[i] = book[i];
		}
	}

	public Book[] getLibrary() {
		return library;
	}

	public void setLibrary(Book[] library) {
		this.library = library;
	}

	public void findSameAuthor(String author, Library library) {

		int tempCount = 0;

		for (int i = 0; i < library.getLibrary().length; i++) {

			if (book.isSameAuthor(author, library.getLibrary()[i])) {

				viewOutput.print(library.getLibrary()[i]);

				tempCount++;
			}
		}

		check(tempCount);
	}

	private void check(int tempCount) {

		if (tempCount == 0) {

			viewOutput.printNoData();
		}
	}

	public void findSamePublishingHouse(String publishingHouse, Library library) {

		int tempCount = 0;

		for (int i = 0; i < library.getLibrary().length; i++) {

			if (book.isSamePublishingHouse(publishingHouse, library.getLibrary()[i])) {

				viewOutput.print(library.getLibrary()[i]);

				tempCount++;
			}
		}
		check(tempCount);
	}

	public void findBookAfterYear(int year, Library library) {

		int tempCount = 0;

		for (int i = 0; i < library.getLibrary().length; i++) {

			if (book.isAfterYear(year, library.getLibrary()[i])) {

				viewOutput.print(library.getLibrary()[i]);

				tempCount++;
			}
		}
		check(tempCount);
	}

	@Override
	public String toString() {
		return "Library [library=" + Arrays.toString(library) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(library);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (!Arrays.equals(library, other.library))
			return false;
		return true;
	}
}
