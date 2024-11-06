package ch03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyEx02 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // ������ ���� ���� ���
        String destFilePathWithoutBuffer = "dest_without_buffer.txt"; // ���� ���� ������ ���� ���
        String destFilePathWithBuffer = "dest_with_buffer.txt"; // ���۸� ����Ͽ� ������ ���� ���

        // ���� ���� ���� (����: 10MB�� ������ ����)
        createTestFile(sourceFilePath, 10 * 1024 * 1024); // 10MB ���� ����

        // ���۸� ������� �ʰ� ���� ����
        long startTime = System.nanoTime();
        copyWithoutBuffer(sourceFilePath, destFilePathWithoutBuffer);
        long endTime = System.nanoTime();
        long durationWithoutBuffer = endTime - startTime;
        System.out.println("���� ���� ���� �ҿ� �ð�: " + durationWithoutBuffer / 1_000_000 + " ms");

        // ���۸� ����Ͽ� ���� ����
        startTime = System.nanoTime();
        copyWithBuffer(sourceFilePath, destFilePathWithBuffer);
        endTime = System.nanoTime();
        long durationWithBuffer = endTime - startTime;
        System.out.println("���� ����Ͽ� ���� �ҿ� �ð�: " + durationWithBuffer / 1_000_000 + " ms");
    }

    // ���� ���� ���� �޼ҵ�
    private static void createTestFile(String filePath, int sizeInBytes) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            byte[] data = new byte[sizeInBytes];
            bos.write(data);
        } catch (IOException e) {
            System.err.println("���� ���� �� ���� �߻�: " + e.getMessage());
        }
    }

    // ���� ���� ���� ����
    private static void copyWithoutBuffer(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.err.println("���� ���� �� ���� �߻�: " + e.getMessage());
        }
    }

    // ���۸� ����Ͽ� ���� ����
    private static void copyWithBuffer(String source, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[1024]; // 1KB ����
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("���� ���� �� ���� �߻�: " + e.getMessage());
        }
    }
}
