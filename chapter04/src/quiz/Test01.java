package quiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + "�� ¦���Դϴ�.");
		} else {
			System.out.println(number + "�� Ȧ���Դϴ�.");
		}
		scanner.close();
	}
}