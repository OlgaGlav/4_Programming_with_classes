package by.course.glavdel_olga.classes_and_object;
// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов).

import java.util.Arrays;

//Создайте массив из 10элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки только 9 или10

public class Task03 {

	public static void main(String[] args) {

		Student[] allStudent = new Student[10];

		allStudent[0] = new Student("st1", "gr1", new double[] { 9.0, 10.0, 9.0, 10.0 });
		allStudent[1] = new Student("st2", "gr2", new double[] { 10.0, 9.0, 10.0 });
		allStudent[2] = new Student("st3", "gr3", new double[] { 10.0, 10.0, 9.0, 10.0 });
		allStudent[3] = new Student("st4", "gr1", new double[] { 9.0, 10.0, 6.0, 10.0 });
		allStudent[4] = new Student("st5", "gr2", new double[] { 9.0, 10.0, 9.0, 10.0 });
		allStudent[5] = new Student("st6", "gr3", new double[] { 1.0, 10.0, 9.0, 10.0, 10.0 });
		allStudent[6] = new Student("st7", "gr1", new double[] { 9.0, 2.0, 9.0, 10.0 });
		allStudent[7] = new Student("st8", "gr2", new double[] { 9.0, 10.0, 9.0, 10.0 });
		allStudent[8] = new Student("st9", "gr3", new double[] { 9.0, 10.0, 5.0, 10.0 });
		allStudent[9] = new Student("st10", "gr1", new double[] { 10.0, 10.0, 9.0, 10.0 });

		printGoodStudents(allStudent);
	}

	private static void printGoodStudents(Student[] allStudent) {
		
		for (Student student : allStudent) {

			if (isGoodStudent(student)) {

				System.out.println("Студент "+student.getName()+" номер группы "+student.getIdGroup());
			}
		}
	}

	private static boolean isGoodStudent(Student st) {

		for (int i = 0; i < st.getMarks().length; i++) {

			if (st.getMarks()[i] < 9.0) {

				return false;
			}
		}
		return true;
	}
}

class Student {

	private String name;
	private String idGroup;
	private double[] marks;

	Student() {

	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, String idGroup, double[] marks) {
		super();
		this.name = name;
		this.idGroup = idGroup;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public String getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(String idGroup) {
		this.idGroup = idGroup;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student name=" + name + ", idGroup=" + idGroup + ", marks=" + Arrays.toString(marks);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGroup == null) ? 0 : idGroup.hashCode());
		result = prime * result + Arrays.hashCode(marks);
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
		Student other = (Student) obj;
		if (idGroup == null) {
			if (other.idGroup != null)
				return false;
		} else if (!idGroup.equals(other.idGroup))
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
