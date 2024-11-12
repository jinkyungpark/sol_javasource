package chapter13.ch05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDifferenceEx05 {
    public static void main(String[] args) {
        // HashMap ��ü ���� �� ������ �߰�
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "red");
        hashMap.put("banana", "yellow");
        hashMap.put("grape", "purple");
        hashMap.put("orange", "orange");

        // LinkedHashMap ��ü ���� �� ������ �߰�
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", "red");
        linkedHashMap.put("banana", "yellow");
        linkedHashMap.put("grape", "purple");
        linkedHashMap.put("orange", "orange");

        // HashMap ��� (���� ������� ����)
        System.out.println("\n== HashMap ��� (���� ������) ==");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // LinkedHashMap ��� (�Է� ���� ����)
        System.out.println("\n== LinkedHashMap ��� (�Էµ� ����) ==");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
