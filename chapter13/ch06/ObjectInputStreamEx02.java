package ch06;

import java.io.*;

public class ObjectInputStreamEx02 {
    public static void main(String[] args) {
        String filePath = "person.dat"; // ������ ���� ���

        // ObjectInputStream�� ����Ͽ� ��ü �б�
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Person person = (Person) ois.readObject(); // ���Ͽ��� ��ü ����
            System.out.println("���� ��ü: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
