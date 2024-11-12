package ch06;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "�̸�: " + name + ", ����: " + age;
    }
}

public class ObjectOutputStreamEx01 {
    public static void main(String[] args) {
        String filePath = "person.dat"; // ������ ���� ���

        // ObjectOutputStream�� ����Ͽ� ��ü ����
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            Person person = new Person("ȫ�浿", 30);
            oos.writeObject(person); // ��ü�� ����ȭ�Ͽ� ���Ͽ� ����
            System.out.println("��ü�� ���������� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

