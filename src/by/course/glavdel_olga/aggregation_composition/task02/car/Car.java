package by.course.glavdel_olga.aggregation_composition.task02.car;

public class Car {
	private Wheel wheelFront1;
	private Wheel wheelFront2;
	private Wheel wheelBack1;
	private Wheel wheelBack2;
	private Engine engine;
	private int year;
	private Brand brand;
	private int tankCapasity;
	private int quantityInTank;
	
	View view = new View();

	public Car() {
		this.wheelFront1 = new Wheel();
		this.wheelFront2 = new Wheel();
		this.wheelBack1 = new Wheel();
		this.wheelBack2 = new Wheel();
		this.engine = new Engine();
		this.tankCapasity = 40;
		this.quantityInTank = 0;
	}

	public Car(Wheel wheel, Engine engine, int year, Brand brand, int tankCapasity, int quantityInTank) {
		super();
		this.wheelFront1 = this.wheelFront2 = this.wheelBack1 = this.wheelBack2 = wheel;
		this.engine = engine;
		this.year = year;
		this.brand = brand;
		this.tankCapasity = tankCapasity;
		this.quantityInTank = quantityInTank;
	}

	public Car(int year, Brand brand, int quantityInTank) {
		this();
		this.year = year;
		this.brand = brand;
		this.quantityInTank = quantityInTank;
	}

	public Car(Wheel wheel, Engine engine, Brand brand, int tankCapasity, int quantityInTank) {
		super();
		this.wheelFront1 = this.wheelFront2 = this.wheelBack1 = this.wheelBack2 = wheel;
		this.engine = engine;
		this.brand = brand;
		this.tankCapasity = tankCapasity;
		this.quantityInTank = quantityInTank;
	}

	public boolean tankIsEmpty() {

		if (quantityInTank > 0) {
			return true;
		}
		return false;
	}

	public boolean isSameWhell(Wheel wheel1, Wheel wheel2) {

		if (wheel1.getRadius() == wheel2.getRadius()) {
			return true;
		}
		return false;
	}

	public boolean checkWheel(Wheel wheel, Wheel wheelCar) {
			
		if (wheel.checkWheel(wheel, wheelCar)) {
			
			return true;
		}
		return false;
	}

	public Wheel getWheelFront1() {
		return wheelFront1;
	}

	public void setWheelFront1(Wheel wheelFront1) {
		this.wheelFront1 = wheelFront1;
	}

	public Wheel getWheelFront2() {
		return wheelFront2;
	}

	public void setWheelFront2(Wheel wheelFront2) {
		this.wheelFront2 = wheelFront2;
	}

	public Wheel getWheelBack1() {
		return wheelBack1;
	}

	public void setWheelBack1(Wheel wheelBack1) {
		this.wheelBack1 = wheelBack1;
	}

	public Wheel getWheelBack2() {
		return wheelBack2;
	}

	public void setWheelBack2(Wheel wheelBack2) {
		this.wheelBack2 = wheelBack2;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getTankCapasity() {
		return tankCapasity;
	}

	public void setTankCapasity(int tankCapasity) {
		this.tankCapasity = tankCapasity;
	}

	public int getQuantityInTank() {
		return quantityInTank;
	}

	public void setQuantityInTank(int quantityInTank) {
		this.quantityInTank = quantityInTank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + quantityInTank;
		result = prime * result + tankCapasity;
		result = prime * result + ((wheelBack1 == null) ? 0 : wheelBack1.hashCode());
		result = prime * result + ((wheelBack2 == null) ? 0 : wheelBack2.hashCode());
		result = prime * result + ((wheelFront1 == null) ? 0 : wheelFront1.hashCode());
		result = prime * result + ((wheelFront2 == null) ? 0 : wheelFront2.hashCode());
		result = prime * result + year;
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
		Car other = (Car) obj;
		if (brand != other.brand)
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (quantityInTank != other.quantityInTank)
			return false;
		if (tankCapasity != other.tankCapasity)
			return false;
		if (wheelBack1 == null) {
			if (other.wheelBack1 != null)
				return false;
		} else if (!wheelBack1.equals(other.wheelBack1))
			return false;
		if (wheelBack2 == null) {
			if (other.wheelBack2 != null)
				return false;
		} else if (!wheelBack2.equals(other.wheelBack2))
			return false;
		if (wheelFront1 == null) {
			if (other.wheelFront1 != null)
				return false;
		} else if (!wheelFront1.equals(other.wheelFront1))
			return false;
		if (wheelFront2 == null) {
			if (other.wheelFront2 != null)
				return false;
		} else if (!wheelFront2.equals(other.wheelFront2))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [wheelFront1=" + wheelFront1 + ", wheelFront2=" + wheelFront2 + ", wheelBack1=" + wheelBack1
				+ ", wheelBack2=" + wheelBack2 + ", engine=" + engine + ", year=" + year + ", brand=" + brand
				+ ", tankCapasity=" + tankCapasity + ", quantityInTank=" + quantityInTank + "]";
	}

}
