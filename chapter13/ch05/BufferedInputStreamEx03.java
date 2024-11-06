package ch05;

import java.io.*;

public class BufferedInputStreamEx03 {
    public static void main(String[] args) {
        String filePath = "buffered_input.dat"; // ������ ���� ���

        // BufferedOutputStream�� ����Ͽ� ������ ����
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bos.write("Hello, Buffered!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // BufferedInputStream�� ����Ͽ� ������ �б�
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] buffer = new byte[1024];
            int bytesRead = bis.read(buffer);
            String message = new String(buffer, 0, bytesRead);

            System.out.println("���� ������: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
