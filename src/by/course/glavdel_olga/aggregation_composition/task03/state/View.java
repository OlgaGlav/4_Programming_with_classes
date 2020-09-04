package by.course.glavdel_olga.aggregation_composition.task03.state;

public class View {

	public void printCapital(City city) {
		System.out.println("Столица государства - "+ city.getName());
		
	}

	public void printRegionCity(City city) {
		System.out.println("Областной центр - "+city.getName());
		
	}

	public void printSquare(double square) {
		System.out.println("Площадь государства = "+square);
	}

	public void printQQuantityRegion(int qualityRegion) {
		System.out.println("Количество регионов = "+qualityRegion);
		
	}

}
