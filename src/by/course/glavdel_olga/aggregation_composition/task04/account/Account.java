package by.course.glavdel_olga.aggregation_composition.task04.account;

public class Account {

	private int number;
	private double balance;
	private boolean isActiv;

	private static int idNumber = 10000000;

	public Account() {
		this.number = idNumber;
		this.isActiv = true;
		this.balance = 0.0;
		idNumber++;
	}

	public Account(double balance) {
		this();
		this.balance = balance;
	}

	public Account(int number, double balance, boolean isActiv) {
		super();
		this.number = number;
		this.balance = balance;
		this.isActiv = isActiv;
	}

	public void block(Account account) {

		if (account.isActiv) {
			account.setActiv(false);
		}
	}

	public boolean findAccountByNumber(int number) {

		if (getNumber() == number) {

			return true;
		}
		return false;
	}

	public double positiveBalance(Account account) {

		if (account.getBalance() > 0.0) {

			return account.getBalance();
		}
		return 0.0;
	}

	public double negativeBalance(Account account) {

		if (account.getBalance() < 0.0) {

			return account.getBalance();
		}
		return 0.0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActiv() {
		return isActiv;
	}

	public void setActiv(boolean isActiv) {
		this.isActiv = isActiv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isActiv ? 1231 : 1237);
		result = prime * result + number;
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isActiv != other.isActiv)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", isActiv=" + isActiv + "]";
	}

}
