package by.course.glavdel_olga.classes_and_object.task10.main;

import java.time.LocalTime;

import by.course.glavdel_olga.classes_and_object.task10.entity.Airline;
import by.course.glavdel_olga.classes_and_object.task10.entity.Airport;
import by.course.glavdel_olga.classes_and_object.task10.entity.DaysOfWeek;
import by.course.glavdel_olga.classes_and_object.task10.logic.LogicAirport;


//Создать класс Airline,  спецификация которого приведена ниже. Определить конструкторы, set- И get-методы, toString().
//Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
//Задать критерии выбора данных и вывести эти данные на консоль

//Класс Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели

//Найти и вывести:
//список рейсов для заданного пункта назначения;
//список рейсов для заданного дня недели
//список рейсов для заданного дня недели, времени вылета для которых больше заданного

public class AirlineMain {

	public static void main(String[] args) {

		Airline airline1 = new Airline();
		Airline airline2 = new Airline("815A", "Paris", "TU-15", LocalTime.of(12, 52), DaysOfWeek.FRIDAY);
		Airline airline3 = new Airline("11G", "Moskow", LocalTime.of(15, 32), DaysOfWeek.FRIDAY);
		Airline airline4 = new Airline("81", "Paris", "TU-24", LocalTime.of(12, 52), DaysOfWeek.MONDAY);
		Airline airline5 = new Airline("115", "London", LocalTime.of(02, 32), DaysOfWeek.SATURDAY);

		Airport airport = new Airport(airline1, airline2, airline3, airline4, airline5);

		LogicAirport logic = new LogicAirport();

		logic.findDestination("Введите пункт назначения ", airport);

		logic.findDays("Введите день недели ", airport);

		logic.findDaysTime("Введите день недели ", "Введите время вылета", airport);

	}

}
