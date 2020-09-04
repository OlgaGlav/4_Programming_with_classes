package by.course.glavdel_olga.classes_and_object;
//Создайте класс с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, инициализирующий члены класса по умолчанию
// Добавьте set- и get- методы для полей экземпляракласса

public class Task02 {

	private int first;
	private int second;

	Task02(int first, int second) {
		this.first = first;
		this.second = second;
	}

	Task02() {
		first = 2;
		second = 3;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
