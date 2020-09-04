package by.course.glavdel_olga.aggregation_composition.task02.car;

public class Engine {
	private Type type;
	private double volume;
	
	static private boolean onOff;
	
	public Engine() {
		this.type=type.PETROL;
		this.volume=1.8;
		onOff=!onOff;
	}

	public Engine(Type type, double volume) {
		super();
		this.type = type;
		this.volume = volume;
		onOff=!onOff;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Engine other = (Engine) obj;
		if (type != other.type)
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", volume=" + volume + "]";
	}

	public boolean isWorking() {
		onOff=!onOff;
		if(onOff) {
			return true;
		}
		return false;
	}
}
