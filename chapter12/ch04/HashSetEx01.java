package chapter13.ch04;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {
	
	public static void main(String[] args) {
		   
		Set<String> hashSet=new HashSet<String>();
		
		//��� �߰�
		hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        //�ߺ��� ������ ����
        hashSet.add("Apple");
        
        // ���
        System.out.println("HashSet: " + hashSet);
        
        // ��� ���� ���� Ȯ��
        if (hashSet.contains("Banana")) {
            System.out.println("Banana is in the HashSet");
        }
        
        // ��� ����
        hashSet.remove("Orange");
        System.out.println("After removal: " + hashSet);

	}
}
