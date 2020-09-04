package by.course.glavdel_olga.aggregation_composition.task02.car;

import java.util.Scanner;

public class View {

	public void printBrand(Car car) {
		System.out.println("The car brand is "+car.getBrand());
	}

	public void printIsGoing(boolean isGoing) {
		if( isGoing) {
			System.out.println("Car is going");
		}else {
			System.out.println("Car isn't going");
		}
		
	}

	public double enterDouble(String message) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(message);
		
		while(!scanner.hasNextDouble()) {
			
			System.out.println("Некорректный ввод. "+message);
			scanner.next();
		}
		
		return scanner.nextDouble();
		
	}

	
	public void printFuelCar(int quantityInTank) {
		
		System.out.println("В баке "+quantityInTank+" литра(ов).");
		
	}

	public void printWrongRadius() {
		System.out.println("Колесо не подходит по радиусу");
		
	}

}
