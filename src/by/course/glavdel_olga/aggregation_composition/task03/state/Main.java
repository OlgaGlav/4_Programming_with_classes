package by.course.glavdel_olga.aggregation_composition.task03.state;
// Создать обьекут класса Государство, используя классы Область, район, Город.

//Методы: вывести на консоль столицу, количество областей, площадь, областные центры

public class Main {

	public static void main(String[] args) {

		City city1 = new City("City_1");
		City city2 = new City("City_2");
		City city3 = new City("City_3");
		City city4 = new City(true, true, "Capital");
		City city5 = new City(true, "RegionCity_1");
		City city6 = new City(true, "RegionCity_2");
		City city7 = new City(true, "RegionCity_3");
		City city8 = new City("City_4");
		City city9 = new City("City_5");
		City city10 = new City("City_6");
		City city11 = new City("City_7");

		Area area1 = new Area("Area_1", 15.1, new City[] { city1, city5, city2 });
		Area area2 = new Area("Area_2", 24.9, new City[] { city3, city4, city6 });
		Area area3 = new Area("Area_3", 10.0, new City[] { city7, city8, city9 });
		Area area4 = new Area("Area_4", 5.0, new City[] { city10, city11 });

		Region region1 = new Region(new Area[] { area1, area2 }, NameRegions.REGION_1);
		Region region2 = new Region(new Area[] { area3, area4 }, NameRegions.REGION_2);

		State state = new State(new Region[] { region1, region2 }, "State");

		Logic logic = new Logic();

		logic.findCapital(state);

		logic.findRegionCenter(state);

		double square = logic.findSquare(state);

		int quantityRegion = logic.findQuantityRegion(state);

	}

}
