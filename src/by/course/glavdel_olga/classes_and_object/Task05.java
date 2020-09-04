package by.course.glavdel_olga.classes_and_object;

import java.util.Scanner;

//Опишите класс, реализующий десятичный счетчик, которы может увеличивать или уменьшать свое зачение в заданном диапазоне.
//Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
//Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние.
//Написать код, демонстрирующий все возможности класса.

public class Task05 {

	public static void main(String[] args) {

		System.out.println("Работа счетчика инициализированного значениями по умолчанию: ");

		Counter counter1 = new Counter();

		doMethods(counter1);

		
		System.out.println("Работа счетчика инициализированного значениями: ");

		int begin;
		int end;
		int step;

		begin = enterInt("Введите начало диапазона ");
		end = enterInt("Введите конец диапазона ");
		step = enterInt("Введите шаг счетчика ");

		Counter counter2 = new Counter(begin, end, step);

		doMethods(counter2);
	}

	private static void doMethods(Counter counter) {
		counter.increase();
		counter.getValue();
		counter.decrease();
		counter.getValue();

	}

	private static int enterInt(String message) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(message);

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Некорректный ввод. " + message);
		}
		return scanner.nextInt();
	}

}

class Counter {

	private int value;
	private int begin;
	private int end;
	private int step;

	Counter() {
		this.begin = 0;
		this.end = 10;
		this.step = 1;
	}

    public Counter(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		this.step = 1;
	}
	
	public Counter(int begin, int end, int step) {
		super();
		this.begin = begin;
		this.end = end;
		this.step = step;
	}

	public int getBegin() {
		return begin;
	}

	public int getEnd() {
		return end;
	}

	public int getStep() {
		return step;
	}

	public void setValue(int value) {
		this.value = value;
		System.out.println("Устанавливаем значение счетчика " + value);
	}

	public int getValue() {
		System.out.println("Текущее значение счетчика " + value);
		System.out.println();
		return value;
	}

	public void increase() {

		int step = 0;
		
		while ((getBegin() + step) <= getEnd()) {

			setValue(getBegin() + step);

			step = step + getStep();
		}

	}

	public void decrease() {

		int step = 0;

		while ((getEnd() - step) >= getBegin()) {

			setValue(getEnd() - step);

			step = step + getStep();

		}

	}

	@Override
	public String toString() {
		return "Counter [begin=" + begin + ", end=" + end + ", step=" + step + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + begin;
		result = prime * result + end;
		result = prime * result + step;
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
		Counter other = (Counter) obj;
		if (begin != other.begin)
			return false;
		if (end != other.end)
			return false;
		if (step != other.step)
			return false;
		return true;
	}

}