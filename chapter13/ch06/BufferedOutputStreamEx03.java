package ch06;

import java.io.*;

class Book implements Serializable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "����: " + title + ", ����: " + author;
    }
}

public class BufferedOutputStreamEx03{
    public static void main(String[] args) {
        String filePath = "books.dat"; // ������ ���� ���

        // BufferedOutputStream�� ObjectOutputStream�� �Բ� ����Ͽ� ��ü ����
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            Book book = new Book("�ڹ� ���α׷���", "ȫ�浿");
            oos.writeObject(book); // ��ü�� ����ȭ�Ͽ� ���Ͽ� ����
            System.out.println("��ü�� ���������� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
