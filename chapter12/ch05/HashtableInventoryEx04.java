package chapter13.ch05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableInventoryEx04 {

	public static void main(String[] args) {
		// Hashtable ��ü ����
		Hashtable<String, Integer> inventory = new Hashtable<>();

		// ��ǰ��� ��� ������ Ű�� ������ Hashtable�� �߰�
		inventory.put("Apple", 50);
		inventory.put("Banana", 30);
		inventory.put("Orange", 20);
		inventory.put("Mango", 10);

		// ��ǰ ��� ���
		System.out.println("== ��ǰ ��� ��� ==");
		for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + "��");
		}

		// Ư�� ��ǰ�� ��� Ȯ��
		Scanner scan = new Scanner(System.in);
		System.out.print("\n��� Ȯ���� ��ǰ���� �Է��ϼ���: ");
		String product = scan.nextLine(); // key

		if (inventory.containsKey(product)) {
			System.out.println(product + "�� ���� " + inventory.get(product) + "���Դϴ�.");
		} else {
			System.out.println("�ش� ��ǰ�� ��� �����ϴ�.");
		}

		// ��ǰ�� ��� ������Ʈ
		System.out.print("\n��� ������Ʈ�� ��ǰ���� �Է��ϼ���: ");
		String updateProduct = scan.nextLine();// key

		if (inventory.containsKey(updateProduct)) {
			System.out.print("�߰��� ������ �Է��ϼ���: ");
			int addQuantity = scan.nextInt();// value
			inventory.put(updateProduct, inventory.get(updateProduct) + addQuantity);
			System.out.println(updateProduct + "�� ���� ���� " + inventory.get(updateProduct) + "���Դϴ�.");
		} else {
			System.out.println("�ش� ��ǰ�� ��� �����ϴ�.");
		}
	}
}
