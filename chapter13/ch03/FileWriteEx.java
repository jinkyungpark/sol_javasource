package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) {
        // ���� ��� ����
        String filePath = "output.txt";
        String data = "Hello, this is a test of FileOutputStream.";

        // FileOutputStream�� ����Ͽ� ���Ͽ� ������ ����
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // ���ڿ� �����͸� ����Ʈ �迭�� ��ȯ�Ͽ� ���Ͽ� ����
            fos.write(data.getBytes());
            System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            System.err.println("������ ���� ���� ���� �߻�: " + e.getMessage());
        }
    }
}

