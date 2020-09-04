package by.course.glavdel_olga.classes_and_object;
//Создайте класс с двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.

//Добавьте метод, который находит сумму знвчений этих переменных и метод, который находит наибольшее значение из этих переменных

public class Task01 {

	private int first;
	private int second;

	Task01(int first, int second) {
		this.first = first;
		this.second = second;
	}

	Task01() {

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

	public void print(int x) {
		System.out.println(x);
	}

	public void print(int x, int y) {
		System.out.println(x + "  " + y);
	}

	public int summ(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}

	public int findMax(int x, int y) {
		return x > y ? x : y;
	}
}
