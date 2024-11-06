package chapter13.ch03.notificationEx12;

import java.util.LinkedList;
import java.util.Queue;

public class NotificationMain {

	public static void main(String[] args) {
		//LinkedList�� ť�� ���  notificationQueue
		Queue<Notification> notificationQueue = new LinkedList<>();
		
		//ť�� ������ �߰�(offer)
		notificationQueue.offer(new Notification("email", "Alex"));
		notificationQueue.offer(new Notification("sms", "Brian"));
        notificationQueue.offer(new Notification("chat", "Charlie"));
		
		//ť���� ������ ������ (poll)
		while(!notificationQueue.isEmpty()) {
			Notification notification=notificationQueue.poll();
			
			switch(notification.action) {
			case "chat":
				System.out.println(notification.name+"�Կ��� ä�� �޼����� �����ϴ�.");
			    break;
			case "email":
				System.out.println(notification.name+"�Կ��� �̸����� �����ϴ�.");
			    break;
			case "sms":
				System.out.println(notification.name+"�Կ��� SMS�� �����ϴ�.");
			    break;
			}		
		}
	}
}
