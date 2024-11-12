package chapter13.ch02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx03 {

	public static void main(String[] args) {

		// LinkedList�� Queue�� ���
		Queue<String> queue = new LinkedList<>();

		// �� �߰�
		queue.add("Customer1");
		queue.add("Customer2");
		queue.add("Customer3");

		// ��� ���� �� ���
		System.out.println("Customers in the queue");
		for (String customer : queue) {
			System.out.println(customer);
		}
		
		//�� ����
		String servedCustomer1= queue.poll();//��⿭�� ù ��° ���� ����
		System.out.println("\nServed: "+servedCustomer1);
		
		//���� �� ��ġ �ľ�
		String servedCustomer2= queue.peek();
		System.out.println("\nServed: "+servedCustomer2);
		
		// ������ ��⿭ ���
        System.out.println("\nRemaining customers in the queue");
        for(String customer:queue) {
        	System.out.println(customer);
        }
	}
}
