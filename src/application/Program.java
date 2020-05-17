package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Instructor;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		System.out.println("=== INSTRUCTOR REGISTER ===");
		System.out.print("Instructor name: ");
		String instructorName = sc.nextLine();
		System.out.print("How many courses do you want to register: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		Instructor instructor = new Instructor(instructorName);
		for (int i = 1; i <= quantity; i++) {
			System.out.print("Enter name your " + i + "st course: ");
			instructor.registerCourse(sc.nextLine());
		}
		
		System.out.println();
		for (int i = 0; i < instructor.getList().size(); i++) {
			System.out.print("How many students for course " + instructor.getList().get(i).getName() + "? ");
			int n = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				System.out.print("insert student code: ");
				set.add(new Student(sc.nextInt()));
			}
			System.out.println();
		}
		
		System.out.println("Total students: " + set.size());
		sc.close();

	}

}
