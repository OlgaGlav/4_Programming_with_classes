package by.course.glavdel_olga.classes_and_object;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Task07 {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(15,15,15);
		
		LogicTriangle logic = new LogicTriangle();
		
		double perimetr = logic.findPerimetr(triangle);

		double square = logic.findSquare(perimetr,triangle);
	}

}

class LogicTriangle{

	public double findPerimetr(Triangle triangle) {
	
		return triangle.getSideA()+  triangle.getSideB()+ triangle.getSideC();
	}

	public double findSquare(double perimetr, Triangle triangle) {
		
		double p=perimetr/2.0;
		
		return Math.sqrt(p*(p-triangle.getSideA())*(p-triangle.getSideB())*(p-triangle.getSideC()));
	}
	
}

class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;

	Triangle() {
		this.sideA = 1.0;
		this.sideB = 1.0;
		this.sideC = 1.0;
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		if (checkSide(sideA, sideB, sideC)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}
		else {
			System.out.println("С такими длинами сторон треугольник не может быть постоен.");
		}
	}

	
	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	
	private boolean checkSide(double sideA, double sideB, double sideC) {
		
		if ((sideA + sideB) > sideC && (sideA +sideC) > sideB && (sideB + sideC) > sideA) {
			
		   return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(sideA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(sideA) != Double.doubleToLongBits(other.sideA))
			return false;
		if (Double.doubleToLongBits(sideB) != Double.doubleToLongBits(other.sideB))
			return false;
		if (Double.doubleToLongBits(sideC) != Double.doubleToLongBits(other.sideC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

	
}