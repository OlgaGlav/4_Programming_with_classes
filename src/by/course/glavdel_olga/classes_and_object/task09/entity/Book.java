package by.course.glavdel_olga.classes_and_object.task09.entity;
//Класс Book: id, название, авторы, издательство, год издания, количество страниц, цена, тип переплета

import java.util.Arrays;

public class Book {

	private int id;
	private String name;
	private String[] author;
	private String publishingHouse;
	private int year;
	private int numberOfPage;
	private double price;
	private String binding;

	private static int idCounter = 1;

	public Book() {
		this.name = "";
		this.author = new String[] { "" };
		this.id = idCounter;

		idCounter++;
	}

	public Book(String name, String[] author, String publishingHouse, int year, int numberOfPage, double price,
			String binding) {
		super();
		this.id = idCounter;
		idCounter++;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.numberOfPage = numberOfPage;
		this.price = price;
		this.binding = binding;
	}

	public Book(String name, String[] author, int year, double price) {
		super();
		this.id = idCounter;
		idCounter++;
		this.name = name;
		this.author = author;
		this.year = year;
		this.price = price;
	}

	public Book(String name, String[] author, String publishingHouse, int year) {
		super();
		this.id = idCounter;
		idCounter++;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	
	public boolean isSameAuthor(String author, Book book) {

		for (int i = 0; i < book.getAuthor().length; i++) {

			if (book.getAuthor()[i].equals(author)) {

				return true;
			}
		}
		return false;
	}

	
	public boolean isSamePublishingHouse(String publishingHouse, Book book) {

		if (book.getPublishingHouse() != null && book.getPublishingHouse().equals(publishingHouse)) {

			return true;
		}
		return false;
	}

	
	public boolean isAfterYear(int year, Book book) {
		
		if (book.getYear() >= year) {
			
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(author);
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfPage;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (!Arrays.equals(author, other.author))
			return false;
		if (binding == null) {
			if (other.binding != null)
				return false;
		} else if (!binding.equals(other.binding))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfPage != other.numberOfPage)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + Arrays.toString(author) + ", publishingHouse="
				+ publishingHouse + ", year=" + year + ", numberOfPage=" + numberOfPage + ", price=" + price
				+ ", binding=" + binding + "]";
	}
}
