package by.course.glavdel_olga.aggregation_composition.task04.account;

public class View {

	public void printAccount(Client client1) {

		for (Account account : client1.getPurse()) {

			printAccount(account);
		}
	}

	public void printAccount(Account account) {
		
		System.out.println("Счет № " + account.getNumber() + ", баланс " + account.getBalance() + ", статус: активен "
				+ account.isActiv());
	}
}
