package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupOfStudents {
	static Student array[] = new Student[1];

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		createStudent();
//	}

	static Student[] createStudent() throws NumberFormatException, IOException {
		// to accept data from keyboard

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 1; i++) {
			System.out.println("enter ID please ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("enter Name please ");
			String name = br.readLine();
			array[i] = new Student(id, name);

		}
		return array;

//		displayArray(array);
	}

	static void displayArray(Student[] array) {
		System.out.println("-----------array is ready for display-----------------");

		for (int i = 0; i < 1; i++) {
			array[i].display();
		}
	}
}
