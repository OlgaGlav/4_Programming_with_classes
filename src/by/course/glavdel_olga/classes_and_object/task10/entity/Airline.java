package by.course.glavdel_olga.classes_and_object.task10.entity;

import java.time.LocalTime;

public class Airline {
	
	private String destination;
	private String id;
	private String typeAircraft; 
	private LocalTime timeDeparture;
	private DaysOfWeek day;
	
	public Airline() {
		super();
		this.destination = "";
		this.id = "";
		this.typeAircraft = "";
		this.timeDeparture = LocalTime.of(0, 0);
		this.day = DaysOfWeek.INDEFINED;
	}

	public Airline(String id,String destination,  String typeAircraft, LocalTime timeDeparture, DaysOfWeek dayOfWeek ) {
		super();
		this.destination = destination;
		this.id = id;
		this.typeAircraft = typeAircraft;
		this.timeDeparture = timeDeparture;
		this.day = dayOfWeek;
		
	}
	
	public Airline(String id,String destination, LocalTime timeDeparture, DaysOfWeek dayOfWeek) {
		super();
		this.destination = destination;
		this.id = id;
		this.timeDeparture = timeDeparture;
		this.day = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeAircraft() {
		return typeAircraft;
	}

	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}

	public LocalTime getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(LocalTime timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public DaysOfWeek getDay() {
		return day;
	}

	public void setDay(DaysOfWeek day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((timeDeparture == null) ? 0 : timeDeparture.hashCode());
		result = prime * result + ((typeAircraft == null) ? 0 : typeAircraft.hashCode());
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
		Airline other = (Airline) obj;
		if (day != other.day)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (timeDeparture == null) {
			if (other.timeDeparture != null)
				return false;
		} else if (!timeDeparture.equals(other.timeDeparture))
			return false;
		if (typeAircraft == null) {
			if (other.typeAircraft != null)
				return false;
		} else if (!typeAircraft.equals(other.typeAircraft))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", id=" + id + ", typeAircraft=" + typeAircraft
				+ ", timeDeparture=" + timeDeparture + ", day=" + day + "]";
	}
	
}
