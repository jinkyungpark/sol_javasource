package chapter13.ch02;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {

		// ArrayList ����
		// ArrayList<String> student=new ArrayList<String>();
		List<String> students = new ArrayList<String>();

		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Diana");

		// �л� ���
		System.out.println("Student in the list");
		for (String student : students) {
			System.out.println(student);
		}

		// Ư�� �л��� ����
		students.remove("Bob");

		// �л� ���
		System.out.println("\nAfter removing Bob");
		for (String student : students) {
			System.out.println(student);
		}
	}
}
