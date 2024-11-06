package ch04;

import java.io.*;

public class ReaderEx01 {
    public static void main(String[] args) {
        String text = "Hello, this is a test string.";
        Reader reader = new StringReader(text); // ���ڿ��� �б� ���� Reader ����

        try {
            int data;
            while ((data = reader.read()) != -1) { // �� ���ھ� �б�
                System.out.print((char) data); // ���� ���ڸ� ���
            }
        } catch (IOException e) {
            System.err.println("�б� �� ���� �߻�: " + e.getMessage());
        } finally {
            try {
                reader.close(); // Reader �ݱ�
            } catch (IOException e) {
                System.err.println("�ݱ� �� ���� �߻�: " + e.getMessage());
            }
        }
    }
}

