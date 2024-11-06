package ch05;

import java.io.*;

public class DataOutputStreamEx02 {
    public static void main(String[] args) {
        String filePath = "output.dat"; // ������ ���� ���

        // DataOutputStream�� ����Ͽ� ������ ����
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(123);
            dos.writeDouble(456.78);
            dos.writeUTF("Output Example");
        } catch (IOException e) {
            e.printStackTrace();
        }      
        System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
    }
}

