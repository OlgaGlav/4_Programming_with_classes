package by.course.glavdel_olga.classes_and_object.task10.view;

import by.course.glavdel_olga.classes_and_object.task10.entity.Airline;

public class ViewPrint {

	public void print(Airline airline) {

		System.out.println("Рейс номер " + airline.getId() + ", пункт назначения " + airline.getDestination()
				+ ", время отправления " + airline.getTimeDeparture() + ", день недели " + airline.getDay());
	}

	public void printNoSame() {

		System.out.println("Совпадений не обнаружено.");
	}

}
