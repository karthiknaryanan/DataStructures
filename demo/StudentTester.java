package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentTester {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Ron", 101, 1));
		students.add(new Student("Angela", 102, 9));
		students.add(new Student("Hazel", 103, 5));
		students.add(new Student("David", 104, 3));
		students.add(new Student("Alan", 105, 4));
		students.add(new Student("Hazel", 103, 5));
		students.add(new Student("Ron", 101, 1));

		Set<Student> uniqueStudents = new TreeSet<>();
		uniqueStudents.addAll(students);
		System.out.println("List of students who applied for re-evaluation:");
		for (Student s : uniqueStudents) {
			System.out.println("Student Id: " + s.getStudentId());
			System.out.println("Student Name: " + s.getStudentName());
			System.out.println("Student Semester: " + s.getStudentSemester());
			System.out.println();
		}
		System.out.println("List of students who applied for re-evaluation in more than one subject:\n");

		Set<Student> duplicateReEvaluationList = new TreeSet<>();

		for (Student s : students) {

			if (!duplicateReEvaluationList.add(s))

				System.out.println("Student Name: " + s.getStudentName() + "\n");

		}
	}

}
