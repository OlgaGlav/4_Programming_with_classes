package by.course.glavdel_olga.classes_and_object.task10.entity;

import java.time.LocalTime;
import java.util.Arrays;

public class Airport {

	private Airline[] airport;

	public Airport() {
		this.airport = new Airline[10];
	}

	public Airport(Airline... airline) {
		this.airport = new Airline[airline.length];

		for (int i = 0; i < airline.length; i++) {

			this.airport[i] = airline[i];
		}
	}

	public Airline[] getAirport() {
		return airport;
	}

	public void setAirport(Airline[] airport) {
		this.airport = airport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(airport);
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
		Airport other = (Airport) obj;
		if (!Arrays.equals(airport, other.airport))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airport [airport=" + Arrays.toString(airport) + "]";
	}

	public boolean findDestination(String destination, Airline airline) {

		if (destination.equals(airline.getDestination())) {

			return true;
		}
		return false;
	}

	public boolean findDays(String day, Airline airline) {

		if (day.equalsIgnoreCase(airline.getDay().toString())) {

			return true;
		}
		return false;
	}

	public boolean findDaysTime(String day, LocalTime time, Airline airline) {
		
		if (findDays(day, airline) && (time.isBefore(airline.getTimeDeparture()))) {

			return true;
		}
		return false;
	}

}
