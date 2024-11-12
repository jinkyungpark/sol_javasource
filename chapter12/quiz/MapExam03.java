package chapter13.quiz;

import java.util.HashMap;
import java.util.Map;

public class MapExam03 {

	public static void main(String[] args) {
		// 3.���� (Map ����): HashMap�� ����Ͽ� �л��� �̸��� ������ �����ϰ�, ������ 60�� �̻��� �л��� ����ϴ� �ڵ带
		// �ۼ��ϼ���.

		HashMap<String, Integer> students = new HashMap<>();
		students.put("Alice", 85);
		students.put("Bob", 45);
		students.put("Charlie", 78);
		students.put("Dave", 59);

		// ����
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			if (entry.getValue() >= 60) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}

	}

}
