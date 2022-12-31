package mypack;

import static mypack.GroupOfStudents.createStudent;
import static mypack.GroupOfStudents.displayArray;

import java.io.IOException;

class Test5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("if else...");

		int a[] = { 10, 22, 33, 44, 55, 66, 77 };

		//
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "   " + a[i]);
		}
		// print all

		for (int y : a)
			System.out.println(y);

		Student ss[] = { new Student(1, "Chandrani"), new Student(11, "Mouma"), new Student(3, "Nibedita"),
				new Student(4, "Rishi") };
		for (Student y : ss)
			System.out.println(y.getId() + "  " + y.getName());

		// GroupOfStudents.createStudent();

		displayArray(createStudent());

	}

}
