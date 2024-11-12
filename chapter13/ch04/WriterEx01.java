package ch04;

import java.io.*;

public class WriterEx01 {
    public static void main(String[] args) {
        String data = "Hello, this is a test of Writer."; // �� ������
        Writer writer = new StringWriter(); // StringWriter ��ü ����

        try {
            writer.write(data); // �����͸� Writer�� ����
            writer.flush(); // ���ۿ� �ִ� ������ ������ ���
            System.out.println(writer.toString()); // StringWriter�� ������ ���
        } catch (IOException e) {
            System.err.println("���� �� ���� �߻�: " + e.getMessage());
        } finally {
            try {
                writer.close(); // Writer �ݱ�
            } catch (IOException e) {
                System.err.println("�ݱ� �� ���� �߻�: " + e.getMessage());
            }
        }
    }
}

