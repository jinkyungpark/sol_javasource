package ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadEx {
    public static void main(String[] args) {
        // ���� ��� ����
        String filePath = "output.txt";

        // FileInputStream�� ����Ͽ� ���Ͽ��� ������ �б�
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            System.out.println("���� ����:");

            // ���Ͽ��� �����͸� �� ����Ʈ�� �б�
            while ((byteData = fis.read()) != -1) {
                // ���� ����Ʈ �����͸� ���
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.err.println("������ �д� ���� ���� �߻�: " + e.getMessage());
        }
    }
}

