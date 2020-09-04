package by.course.glavdel_olga.aggregation_composition.task03.state;

import java.util.Arrays;

public class State {
	private Region[] regionsInArea;
	private String name;

	public State() {
	}

	public State(Region[] regionsInArea, String name) {
		super();
		this.regionsInArea = regionsInArea;
		this.name = name;
	}

	public Region[] getRegionsInArea() {
		return regionsInArea;
	}

	public void setRegionsInArea(Region[] regionsInArea) {
		this.regionsInArea = regionsInArea;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(regionsInArea);
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
		State other = (State) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(regionsInArea, other.regionsInArea))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [regionsInArea=" + Arrays.toString(regionsInArea) + ", name=" + name + "]";
	}
}
