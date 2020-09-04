package by.course.glavdel_olga.aggregation_composition.task04.account;

import java.time.LocalDate;

// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный баланс отдельно
public class Main {

	public static void main(String[] args) {

		Account account1 = new Account(15.0);
		Account account2 = new Account(-20.0);
		Account account3 = new Account(13, 10.0, false);

		Client client1 = new Client("Vasiliy", LocalDate.of(79, 02, 15),
				new Account[] { account1, account2, account3 });

		Logic logic = new Logic();
		View view = new View();

		double summ;
		double summPositiveBalance;
		double summNegativeBalance;

		view.printAccount(client1);

		logic.blockAccount(account1);
		view.printAccount(client1);

		Account account = logic.findAccountByNumber(13, client1);
		view.printAccount(account);

		logic.sortByNumber(client1);
		view.printAccount(client1);

		summ = logic.findTotalSumm(client1);

		summPositiveBalance = logic.findPositiveBalanceSumm(client1);

		summNegativeBalance = logic.findNegativeBalanceSumm(client1);

		System.out.println("Общий баланс =" + summ + ", баланс по счетам с положительным остатком "
				+ summPositiveBalance + ", баланс по счетам с отрицательным остатком " + summNegativeBalance);

	}

}
