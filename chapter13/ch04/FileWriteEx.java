package ch04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class FileWriteEx {
    public static void main(String[] args) {
        // ���� ��� ����
        String filePath = "output.txt";
        String data = "Hello, this is a test of FileWriter.";

        // FileWriter�� BufferedWriter�� ����Ͽ� ���Ͽ� ������ ����
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // ���ڿ� �����͸� ���Ͽ� ����
            bw.write(data);
            bw.newLine();  // �ٹٲ�
            System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            System.err.println("������ ���� ���� ���� �߻�: " + e.getMessage());
        }
    }
}

