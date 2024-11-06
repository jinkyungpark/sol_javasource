package ch04;

import java.io.*;

public class FileReaderEx01 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // ���� ���� ���

        try (FileReader fr = new FileReader(filePath); // FileReader ����
             BufferedReader br = new BufferedReader(fr)) { // BufferedReader�� ���α�
            String line;
            while ((line = br.readLine()) != null) { // ���Ͽ��� �� �پ� �б�
                System.out.println(line); // ���� �� ���
            }
        } catch (IOException e) {
            System.err.println("���� �б� �� ���� �߻�: " + e.getMessage());
        }
    }
}

