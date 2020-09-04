package by.course.glavdel_olga.classes_and_object;

import java.util.Scanner;

//Составьте описание класса для предоставления времени. Предусмотрите возможность установки времени и изменения его отдельных
//полей(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле
//устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд

public class Task06 {

	public static void main(String[] args) {

		TimeLogic logic = new TimeLogic();

		Time time = logic.setTime();

		System.out.println(time);

		System.out.println("Введите данные, на скольно нужно увеличить время.");

		Time timeIncrease = logic.setTime();

		Time timeAfterIncrease = logic.increase(time, timeIncrease);

		System.out.println("Время после увеличения " + timeAfterIncrease);
	}

}

class TimeLogic {

	public Time setTime() {

		Time time = new Time();

		time.setHour(enterInt("Введите количество часов", 23));
		time.setMinute(enterInt("Введите количество минут", 59));
		time.setSecond(enterInt("Введите количество секунд", 59));

		return time;
	}

	public Time increase(Time time, Time timeIncrease) {

		Time timeAfterIncrease = new Time();

		int secondsAfterIncrease;
		int minuteAfterIncrease;
		int hourAfterIncrease;

		int carryOverMinute;
		int carryOverHour;

		secondsAfterIncrease = counting(time.getSecond(), timeIncrease.getSecond(), 60);
		carryOverMinute = findCarryOver(time.getSecond(), timeIncrease.getSecond(), 60);

		minuteAfterIncrease = counting(time.getMinute(), (timeIncrease.getMinute() + carryOverMinute), 60);
		carryOverHour = findCarryOver(time.getMinute(), (timeIncrease.getMinute() + carryOverMinute), 60);

		hourAfterIncrease = counting(time.getHour(), (timeIncrease.getHour() + carryOverHour), 24);

		timeAfterIncrease.setHour(hourAfterIncrease);
		timeAfterIncrease.setSecond(secondsAfterIncrease);
		timeAfterIncrease.setMinute(minuteAfterIncrease);

		return timeAfterIncrease;
	}

	private int counting(int time, int timeIncreace, int limit) {

		return (time + timeIncreace) % limit;
	}

	private int findCarryOver(int time, int timeIncreace, int limit) {

		return (time + timeIncreace) / limit;
	}

	private int enterInt(String message, int limit) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		int temp;

		while (!scanner.hasNextInt()) {

			scanner.next();

			System.out.println("Некорректный ввод. " + message);
		}

		temp = checkValue(scanner.nextInt(), message, limit);

		return temp;
	}

	private int checkValue(int value, String message, int limit) {

		if (value > limit || value < 0) {

			System.out.println("Некорректное значение. ");

			value = enterInt(message, limit);
		}
		return value;
	}

}

class Time {
	private int second;
	private int minute;
	private int hour;

	Time() {

	}

	public Time(int hour) {
		super();
		this.hour = hour;
		this.minute = 0;
		this.second = 0;
	}

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}

	public Time(int second, int minute, int hour) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}