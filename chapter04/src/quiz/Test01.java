package quiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + "�� ¦���Դϴ�.");
		}else {
			System.out.println(n + "�� Ȧ���Դϴ�.");			
		}
	}
}