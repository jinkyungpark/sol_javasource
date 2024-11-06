package ch05;

import java.io.*;

public class BufferedOutputStreamEx04 {
    public static void main(String[] args) {
        String filePath = "buffered_output.dat"; // ������ ���� ���

        // BufferedOutputStream�� ����Ͽ� ������ ����
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bos.write("Buffered Output Example".getBytes());
            bos.flush(); // ������ ������ ������ ���
        } catch (IOException e) {
            e.printStackTrace();
        }       
        System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
    }
}

