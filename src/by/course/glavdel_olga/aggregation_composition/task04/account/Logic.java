package by.course.glavdel_olga.aggregation_composition.task04.account;

public class Logic {

	public void blockAllAccount(Client client) {

		for (Account account : client.getPurse()) {
			account.block(account);
		}
	}

	public void blockAccount(Account account) {
		account.block(account);
	}

	public Account findAccountByNumber(int number, Client client) {

		for (Account account : client.getPurse()) {

			if (account.findAccountByNumber(number)) {
				return account;
			}
		}
		return null;
	}

	public void sortByNumber(Client client) {
		client.sortByNumber(client.getPurse());

	}

	public double findTotalSumm(Client client) {

		double summ = 0.0;

		for (Account account : client.getPurse()) {
			
			summ = summ + account.getBalance();
		}
		return summ;
	}

	public double findPositiveBalanceSumm(Client client) {

		double summ = 0.0;

		for (Account account : client.getPurse()) {

			summ = summ + account.positiveBalance(account);
		}
		return summ;
	}

	public double findNegativeBalanceSumm(Client client) {
		
		double summ = 0.0;

		for (Account account : client.getPurse()) {

			summ = summ + account.negativeBalance(account);
		}
		return summ;
	}
}
