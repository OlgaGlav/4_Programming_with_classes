package by.course.glavdel_olga.classes_and_object.task10.logic;

import java.time.LocalTime;

import by.course.glavdel_olga.classes_and_object.task10.entity.Airport;
import by.course.glavdel_olga.classes_and_object.task10.entity.DaysOfWeek;
import by.course.glavdel_olga.classes_and_object.task10.view.*;

public class LogicAirport {

	ViewPrint viewPrint = new ViewPrint();
	ViewEnter viewEnter = new ViewEnter();

	Airport airport = new Airport();

	public void findDestination(String message, Airport airport) {

		String destination = viewEnter.enterString(message);

		int tempCount = 0;

		for (int i = 0; i < airport.getAirport().length; i++) {

			if (airport.findDestination(destination, airport.getAirport()[i])) {

				viewPrint.print(airport.getAirport()[i]);

				tempCount++;
			}
		}
		checkCount(tempCount);
	}

	private void checkCount(int tempCount) {

		if (tempCount == 0) {

			viewPrint.printNoSame();
		}

	}

	public void findDays(String message, Airport airport) {

		String day = viewEnter.enterString(message);

		while (!checkValue(day, DaysOfWeek.values())) {

			day = viewEnter.enterString("Неправильно введен день недели. " + message);
		}

		for (int i = 0; i < airport.getAirport().length; i++) {

			if (airport.findDays(day, airport.getAirport()[i])) {

				viewPrint.print(airport.getAirport()[i]);
			}
		}

	}

	public boolean checkValue(String temp, DaysOfWeek[] values) {

		for (DaysOfWeek dayEnum : values) {

			if (temp.equalsIgnoreCase(dayEnum.toString())) {

				return true;
			}
		}
		return false;
	}

	public void findDaysTime(String message, String message2, Airport airport) {

		String day = viewEnter.enterString(message);

		while (!checkValue(day, DaysOfWeek.values())) {

			day = viewEnter.enterString("Неправильно введен день недели. " + message);
		}

		int hour = viewEnter.enterInt(message2 + " часы");

		while (!checkValue(hour)) {

			hour = viewEnter.enterInt("Некорректный ввод." + message2 + " часы");
		}

		LocalTime time = LocalTime.of(hour, 0);

		for (int i = 0; i < airport.getAirport().length; i++) {

			if (airport.findDaysTime(day, time, airport.getAirport()[i])) {

				viewPrint.print(airport.getAirport()[i]);
			}
		}

	}

	private boolean checkValue(int temp) {

		if (temp < 23 && temp > 0) {

			return true;
		}
		return false;
	}
}
