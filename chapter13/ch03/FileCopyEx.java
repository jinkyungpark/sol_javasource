package ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) {
        // ���� �� ���� ���� ��� ����
        String sourceFile = "IOStream.txt";
        String destFile = "copy.txt";

        // BufferedInputStream�� BufferedOutputStream�� ����Ͽ� ���� ����
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {
             
            byte[] buffer = new byte[1024]; // 1KB ����
            int bytesRead;

            // ���� ���Ͽ��� �����͸� �о� ���� ���Ͽ� ����
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("������ ���������� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            System.err.println("���� ���� �� ���� �߻�: " + e.getMessage());
        }
    }
}

