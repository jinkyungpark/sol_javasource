
 package ch02;

 import java.util.Scanner;

 public class AverageCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;

		System.out.println("���ڸ� �Է��ϼ��� (�����Ϸ��� -1 �Է�): ");
		while (true) {
			int num = scanner.nextInt();
			if (num == -1) {
				break; // -1 �Է� �� ����
			}
			sum += num;
			count++;
		}
		if (count > 0) {
			double average = (double) sum / count;
			System.out.println("�Է��� ������ �����: " + Math.round(average));
		} else {
			System.out.println("���ڰ� �Էµ��� �ʾҽ��ϴ�.");
		}
		scanner.close();
	 }
 }
 
 

 