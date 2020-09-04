package by.course.glavdel_olga.aggregation_composition.task02.car;

//Создать объект класса автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо, 
//вывести на консоль марку автомобиля

public class Main {

	public static void main(String[] args) {

		Car car = new Car(new Wheel(17.0, Season.WINTER), new Engine(Type.HYBRID, 2.0), 2015, Brand.AUDI, 50, 30);
		Car car2 = new Car();

		Logic logic = new Logic();

		View view = new View();

		view.printBrand(car);

		boolean isGoing;
		
		isGoing = logic.carIsGoing(car);
		view.printIsGoing(isGoing);

		isGoing = logic.carIsGoing(car2);
		view.printIsGoing(isGoing);
		
		logic.fuelCar(view.enterDouble("Введите количество топлива "), car);
		
		logic.changeWheel(new Wheel(17.0, Season.SUMMER), car, 1);
		
		System.out.println(car);
		

		
		
	}

}
