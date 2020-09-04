package by.course.glavdel_olga.aggregation_composition.task02.car;

public class Logic {

	View view = new View();

	public boolean carIsGoing(Car car) {

		if (!car.tankIsEmpty() && car.getEngine().isWorking()) {

			return true;
		}
		return false;
	}

	public void fuelCar(double litr, Car car) {

		litr = checkPositive(litr);

		if (litr + car.getQuantityInTank() > car.getTankCapasity()) {
			car.setQuantityInTank(car.getTankCapasity());

		} else {
			car.setQuantityInTank((int) (car.getQuantityInTank() + litr));
		}
		view.printFuelCar(car.getQuantityInTank());

	}

	private double checkPositive(double number) {

		while (number <= 0) {
			number = view.enterDouble("Введите положительное число");
		}
		return number;
	}

	public void changeWheel(Wheel wheelForChange, Car car, int numberWheel) {

		switch (numberWheel) {

		case 1:
			if (car.checkWheel(wheelForChange, car.getWheelFront1())) {
				car.setWheelFront1(wheelForChange);
			} else {
				view.printWrongRadius();
			}
			break;
		case 2:
			if (car.checkWheel(wheelForChange, car.getWheelFront2())) {
				car.setWheelFront2(wheelForChange);
			} else {
				view.printWrongRadius();
			}
			break;
		case 3:
			if (car.checkWheel(wheelForChange, car.getWheelBack1())) {
				car.setWheelBack1(wheelForChange);
			} else {
				view.printWrongRadius();
			}
			break;
		case 4:
			if (car.checkWheel(wheelForChange, car.getWheelBack2())) {
				car.setWheelBack2(wheelForChange);
			} else {
				view.printWrongRadius();
			}
			break;
		default:
			System.out.println("Неправильный номер колеса");
		}
	}

}
