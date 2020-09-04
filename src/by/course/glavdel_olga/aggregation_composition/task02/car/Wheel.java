package by.course.glavdel_olga.aggregation_composition.task02.car;

public class Wheel {
	private double radius;
	private Season season;
	
	public Wheel() {
		this.radius = 15.0;
		this.season = season.UNIVERSAL;

	}

	public Wheel(double radius, Season season) {
		super();
		this.radius = radius;
		this.season = season;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((season == null) ? 0 : season.hashCode());
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
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		if (season != other.season)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", season=" + season + "]";
	}

	public boolean checkWheel(Wheel wheel, Wheel wheelCar) {
		
		if(wheel.getRadius()==wheelCar.getRadius()) {
			return true;
		}
		return false;
	}
}
