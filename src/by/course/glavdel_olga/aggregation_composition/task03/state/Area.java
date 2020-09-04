package by.course.glavdel_olga.aggregation_composition.task03.state;

import java.util.Arrays;

public class Area {
	private City[] city;
	private String name;
	private double area;
	
	public Area() {
		this.name="noName";
		this.area=0;
	}

	public Area(String name, double area, City[] city) {
		super();
		this.name = name;
		this.area = area;
		this.city=city;
	}

	public City[] getCity() {
		return city;
	}

	public void setCity(City[] city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(city);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Area other = (Area) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (!Arrays.equals(city, other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area [city=" + Arrays.toString(city) + ", name=" + name + ", area=" + area + "]";
	}

	public void findCapital(Area area) {
		
		for(City city: area.getCity()) {
			city.findCapital(city);
		}
		
	}

	public void findRegionCenter(Area area) {
		
		for(City city: area.getCity()) {
			city.findRegionCity(city);
		}
	}

	public double findSquare(Area area) {
		
		return area.getArea();
	}
}
