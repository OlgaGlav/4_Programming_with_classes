package by.course.glavdel_olga.classes_and_object.task08.entity;

import java.util.Comparator;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long numberCreditCard;
	private long numberBankAccount;

	private static int idCounter = 1;

	public Customer() {
		this.id = idCounter;
		idCounter++;
		this.surname = "";
		this.name = "";
		this.patronymic = "";
		this.adress = "";
	}

	public Customer(String surname, String name, String patronymic) {
		super();
		this.id = idCounter;
		idCounter++;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
	}

	public Customer(int id, String surname, String name, String patronymic, String adress, long numberCreditCard,
			long numberBankAccount) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.numberCreditCard = numberCreditCard;
		this.numberBankAccount = numberBankAccount;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(long numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public long getNumberBankAccount() {
		return numberBankAccount;
	}

	public void setNumberBankAccount(long numberBankAccount) {
		this.numberBankAccount = numberBankAccount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", numberCreditCard=" + numberCreditCard + ", numberBankAccount="
				+ numberBankAccount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (numberBankAccount ^ (numberBankAccount >>> 32));
		result = prime * result + (int) (numberCreditCard ^ (numberCreditCard >>> 32));
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberBankAccount != other.numberBankAccount)
			return false;
		if (numberCreditCard != other.numberCreditCard)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	public static class SurnameComparator implements Comparator<Customer> {
		@Override
		public int compare(Customer a, Customer b) {
			return a.getSurname().compareToIgnoreCase(b.getSurname());
		}
	}

}
