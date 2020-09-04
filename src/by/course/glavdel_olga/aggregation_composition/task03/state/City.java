package by.course.glavdel_olga.aggregation_composition.task03.state;

public class City {
	private boolean isCapital;
	private boolean isRegionalCenter;
	private String name;
	
	View view = new View();

	public City() {
		this.isCapital = false;
		this.isRegionalCenter = false;
		this.name = "noName";
	}

	public City(boolean isCapital, boolean isRegionalCenter, String name) {
		super();
		this.isCapital = isCapital;
		this.isRegionalCenter = isRegionalCenter;
		this.name = name;
	}

	public City(boolean isRegionalCenter, String name) {
		super();
		this.isCapital = false;
		this.isRegionalCenter = isRegionalCenter;
		this.name = name;
	}

	public City(String name) {
		this();
		this.name = name;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public boolean isRegionalCenter() {
		return isRegionalCenter;
	}

	public void setRegionalCenter(boolean isRegionalCenter) {
		this.isRegionalCenter = isRegionalCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCapital ? 1231 : 1237);
		result = prime * result + (isRegionalCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (isCapital != other.isCapital)
			return false;
		if (isRegionalCenter != other.isRegionalCenter)
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
		return "City [isCapital=" + isCapital + ", isRegionalCenter=" + isRegionalCenter + ", name=" + name + "]";
	}

	public void findCapital(City city) {
		
		if(city.isCapital) {
			view.printCapital(city);
		}
		
	}

	public void findRegionCity(City city) {
		
		if(city.isRegionalCenter) {
			view.printRegionCity(city);
		}
	}
}
