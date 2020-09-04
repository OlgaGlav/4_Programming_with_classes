package by.course.glavdel_olga.aggregation_composition.task03.state;

import java.util.Arrays;

public class Region {
	private Area[] areaInRegion;
	private NameRegions name;

	public Region() {
	}

	public Region(Area[] areaInRegion, NameRegions name) {
		super();
		this.areaInRegion = areaInRegion;
		this.name = name;
	}

	public void findCapital(Region region) {
		
		for (Area area : region.getAreaInRegion()) {
			area.findCapital(area);
		}

	}

	public void findRegionCenter(Region region) {

		for (Area area : region.getAreaInRegion()) {
			area.findRegionCenter(area);
		}
	}

	public double findSquare(Region region) {

		double square = 0.0;
		
		for (Area area : region.getAreaInRegion()) {
			square = square + area.findSquare(area);
		}
		return square;

	}

	public Area[] getAreaInRegion() {
		return areaInRegion;
	}

	public void setAreaInRegion(Area[] areaInRegion) {
		this.areaInRegion = areaInRegion;
	}

	public NameRegions getName() {
		return name;
	}

	public void setName(NameRegions name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(areaInRegion);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (!Arrays.equals(areaInRegion, other.areaInRegion))
			return false;
		if (name != other.name)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [areaInRegion=" + Arrays.toString(areaInRegion) + ", name=" + name + "]";
	}

	
}
