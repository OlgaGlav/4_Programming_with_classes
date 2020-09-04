package by.course.glavdel_olga.classes_and_object;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
//Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

public class Task04 {

	public static void main(String[] args) {

		Train[] allTrain = new Train[5];

		allTrain[0] = new Train("Minsk", 111, LocalTime.of(01, 00));
		allTrain[1] = new Train("Gaaga", 12, LocalTime.of(02, 00));
		allTrain[2] = new Train("Paris", 999, LocalTime.of(03, 00));
		allTrain[3] = new Train("Gaaga", 516, LocalTime.of(01, 15));
		allTrain[4] = new Train("Gaaga", 719, LocalTime.of(17, 50));

		Logic logic = new Logic();

		int actionNumber = logic.enterInt("Если Вы хотите отсортировать поезда по номеру - наберите 1;"
				+ "\nЕсли Вы хотите вывести информацию о поезде по его номеру - наберите 2;"
				+ "\nЕсли Вы хотите отсортировать поезда по пункту назначения - наберите 3;"
				+ "\nЕсли Вы хотите выйти из программы - наберите любое число.");

		logic.doAction(actionNumber, allTrain);

	}

}

class Logic {

	public int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();

			System.out.println("Некорректный ввод \n" + message);
		}

		return scanner.nextInt();
	}

	public void doAction(int actionNumber, Train[] trains) {

		switch (actionNumber) {

		case 1:

			sortNumber(trains);

			print(trains);

			doAction(enterInt("Если хотите продлжить, наберите номер операции. "), trains);

			break;

		case 2:

			int numberTrain = enterInt("Введите номер поезда ");

			findTrain(numberTrain, trains);

			doAction(enterInt("Если хотите продлжить, наберите номер операции. "), trains);

			break;

		case 3:

			sortDestination(trains);

			print(trains);

			doAction(enterInt("Если хотите продлжить, наберите номер операции. "), trains);

			break;

		default:
			
			System.out.println("До встречи.");
		}

	}

	
	private void sortDestination(Train[] trains) {

		Arrays.sort(trains, new Comparator<Train>() {
			
			@Override
			public int compare(Train tr1, Train tr2) {

				if (tr1.getDestination().compareToIgnoreCase(tr2.getDestination()) == 0) {
					
					return tr1.getTimeDeparture().compareTo(tr2.getTimeDeparture());
					
				} else {
					
					return tr1.getDestination().compareToIgnoreCase(tr2.getDestination());
				}

			}
		});
	}

	private void findTrain(int number, Train[] trains) {

		int counter = 0;

		for (Train tr : trains) {

			if (number == tr.getTrainNumber()) {

				System.out.println(tr);
				counter++;
			}
		}
		if (counter == 0) {

			System.out.println("Поезда с таким номером нет.");
		}
	}

	private void print(Train[] trains) {

		for (Train tr : trains) {

			System.out.println(tr);
		}

	}

	private void sortNumber(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {

			for (int j = 0; j < trains.length; j++) {

				if (trains[i].getTrainNumber() < trains[j].getTrainNumber()) {

					Train temp = trains[i];
					trains[i] = trains[j];
					trains[j] = temp;
				}
			}
		}
	}

}

class Train {

	private String destination;
	private int trainNumber;
	private LocalTime timeDeparture;

	Train() {

	}

	public Train(String destination, int trainNumber, LocalTime timeDeparture) {
		super();
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.timeDeparture = timeDeparture;
	}

	public String getDestination() {
		return destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public LocalTime getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(LocalTime timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	@Override
	public String toString() {
		return "Поезд на " + destination + ", номер " + trainNumber + ", время отправления " + timeDeparture;
	}

}
