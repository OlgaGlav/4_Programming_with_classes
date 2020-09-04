package by.course.glavdel_olga.classes_and_object.task08.entity;

import java.util.Arrays;

public class ListCustomer {

	private Customer[] listCustomer;

	public ListCustomer() {
		this.listCustomer = new Customer[5];
	}

	public ListCustomer(Customer... customer) {
		super();
		this.listCustomer = new Customer[customer.length];
		
		for (int i = 0; i < customer.length; i++) {
			this.listCustomer[i] = customer[i];
		}
	}

	@Override
	public String toString() {
		return "ListCustomer [listCustomer=" + listCustomer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(listCustomer);
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
		ListCustomer other = (ListCustomer) obj;
		if (!Arrays.equals(listCustomer, other.listCustomer))
			return false;
		return true;
	}

}
