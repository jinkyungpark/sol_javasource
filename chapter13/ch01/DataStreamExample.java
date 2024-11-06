
 package ch01;

 import java.io.DataInputStream;
 import java.io.DataOutputStream;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;

 public class DataStreamExample {
     public static void main(String[] args) {
         String filePath = "datastream_output.dat";

         // DataOutputStream�� ����Ͽ� �⺻�� �����͸� ���Ͽ� ����
         try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
             dos.writeUTF("Hello, DataOutputStream!");
             dos.writeInt(123);
             dos.writeDouble(45.67);
             System.out.println("�����Ͱ� ���Ͽ� ���������� ����Ǿ����ϴ�.");
         } catch (IOException e) {
             e.printStackTrace();
         }

         // DataInputStream�� ����Ͽ� ���Ͽ��� �⺻�� ������ �б�
         try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
             String message = dis.readUTF();
             int number = dis.readInt();
             double decimal = dis.readDouble();
             System.out.println("���Ͽ��� ���� ������:");
             System.out.println("Message: " + message);
             System.out.println("Number: " + number);
             System.out.println("Decimal: " + decimal);
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
 
 

