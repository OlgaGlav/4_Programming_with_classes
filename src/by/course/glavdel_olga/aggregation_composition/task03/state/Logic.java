package by.course.glavdel_olga.aggregation_composition.task03.state;

public class Logic {

	View view = new View();

	public void findCapital(State state) {

		for (Region region : state.getRegionsInArea()) {
			region.findCapital(region);
		}
	}

	public void findRegionCenter(State state) {

		for (Region region : state.getRegionsInArea()) {
			region.findRegionCenter(region);
		}
	}

	public double findSquare(State state) {
		double square = 0.0;

		for (Region region : state.getRegionsInArea()) {
			square = square + region.findSquare(region);
		}
		view.printSquare(square);
		
		return square;
	}

	public int findQuantityRegion(State state) {
		int qualityRegion = state.getRegionsInArea().length;
		
		view.printQQuantityRegion(qualityRegion);
		
		return qualityRegion;
	}

}
