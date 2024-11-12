package chapter13.ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx04 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		//id:key  | value:���
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���!");
			System.out.print("���̵� : ");//Spring
			String id=scan.next();
			
			//�Է��� ���̵� ���� ����
			if(map.containsKey(id)) {
				//��й�ȣ �ޱ�
				System.out.print("��й�ȣ: ");
				String pw=scan.next();
				//��й�ȣ ��ġ ����
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� ����");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
					continue;
				}//inner id
			}else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
			}//out if		
		}//while
	}
}
