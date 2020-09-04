package by.course.glavdel_olga.aggregation_composition.task05.tourist;

public class Voucher {
	private Country country;
	private Type type;
	private double price;
	private TypeEat typeEat;
	private Transport transport;
	private int days;

	public Voucher() {
		this.country = Country.RUSSIA;
		this.type = Type.EXCURSION;
		this.typeEat = TypeEat.BB;
		this.transport = Transport.AVIA;
	}

	public Voucher(int days, double price) {
		this();
		this.days = days;
		this.price = price;
	}

	public Voucher(Country country, int days, double price) {
		this();
		this.country = country;
		this.days = days;
		this.price = price;
	}

	public Voucher(TypeEat typeEat, Transport transport, int days, double price) {
		this();
		this.typeEat = typeEat;
		this.transport = transport;
		this.days = days;
		this.price = price;
	}

	public Voucher(Type type, TypeEat typeEat, int days, double price) {
		this();
		this.type = type;
		this.typeEat = typeEat;
		this.days = days;
		this.price = price;
	}

	public Voucher(Country country, Type type, TypeEat typeEat, Transport transport, int days, double price) {
		super();
		this.country = country;
		this.type = type;
		this.typeEat = typeEat;
		this.transport = transport;
		this.days = days;
		this.price = price;
	}

	public boolean isType(Type type) {

		if (type.equals(getType())) {

			return true;
		}
		return false;
	}

	public boolean isTransport(Transport transport) {
		if (transport.equals(getTransport())) {

			return true;
		}
		return false;
	}

	public boolean isTypeEat(TypeEat typeEat) {

		if (typeEat.equals(getTypeEat())) {

			return true;
		}
		return false;
	}

	public boolean isDays(int days) {
		if (days == getDays()) {

			return true;
		}
		return false;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TypeEat getTypeEat() {
		return typeEat;
	}

	public void setTypeEat(TypeEat typeEat) {
		this.typeEat = typeEat;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + days;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((typeEat == null) ? 0 : typeEat.hashCode());
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
		Voucher other = (Voucher) obj;
		if (country != other.country)
			return false;
		if (days != other.days)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		if (typeEat != other.typeEat)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voucher [country=" + country + ", type=" + type + ", price=" + price + ", typeEat=" + typeEat
				+ ", transport=" + transport + ", days=" + days + "]";
	}

}
