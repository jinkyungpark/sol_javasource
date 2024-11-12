package chapter13.ch03;

 import java.util.ArrayDeque;
 import java.util.Deque;

 public class ArrayDequeQueueEx10 {

     public static void main(String[] args) {
         
         // ArrayDeque ��ü ����
         Deque<String> deque = new ArrayDeque<>();

         // ť ����: ������ �߰� (offer)
         deque.offer("Alice");
         deque.offer("Bob");
         deque.offer("Charlie");
         
         // ť ����: ���� �տ� �ִ� ��� Ȯ�� (peek)
         System.out.println("���� �տ� �ִ� ���: " + deque.peek()); // Alice
         
         // ť ����: ���� �տ� �ִ� ��� ������ (poll)
         System.out.println("ť���� ���� ���: " + deque.poll()); // Alice
         System.out.println("ť���� ���� ���: " + deque.poll()); // Bob
         
         // ť ����: ���� ��� Ȯ�� (peek)
         System.out.println("���� �տ� �ִ� ���: " + deque.peek()); // Charlie
         
         // ť ����: ���� ��� ��� ������ (poll)
         System.out.println("ť���� ���� ���: " + deque.poll()); // Charlie
         System.out.println("ť�� �������? " + deque.isEmpty()); // true
     }
 }

 
