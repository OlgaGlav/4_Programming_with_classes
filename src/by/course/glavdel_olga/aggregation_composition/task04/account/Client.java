package by.course.glavdel_olga.aggregation_composition.task04.account;

import java.time.LocalDate;
import java.util.Arrays;

public class Client {
	private String name;
	private LocalDate dateOfBirth;
	private Account[] purse;

	public Client() {
		this.name = "noName";
	}

	public Client(String name, LocalDate dateOfBirth, Account[] purse) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.purse = purse;
	}

	public void sortByNumber(Account[] account) {

		Account accountTemp = new Account();

		for (int i = 0; i < account.length; i++) {

			for (int j = 0; j < account.length; j++) {

				if (account[j].getNumber() > account[i].getNumber()) {

					accountTemp = account[i];
					account[i] = account[j];
					account[j] = accountTemp;
				}
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Account[] getPurse() {
		return purse;
	}

	public void setPurse(Account[] purse) {
		this.purse = purse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(purse);
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
		Client other = (Client) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(purse, other.purse))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", dateOfBirth=" + dateOfBirth + ", purse=" + Arrays.toString(purse) + "]";
	}
}
