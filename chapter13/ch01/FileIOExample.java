
 package ch01;

 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;

 public class FileIOExample {
     public static void main(String[] args) {
         String data = "Hello, this is a test of FileInputStream and FileOutputStream.";
         String filePath = "output.txt";

         // FileOutputStream�� ����Ͽ� ���Ͽ� ������ ����
         try (FileOutputStream fos = new FileOutputStream(filePath)) {
             fos.write(data.getBytes());
             System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
         } catch (IOException e) {
             e.printStackTrace();
         }

         // FileInputStream�� ����Ͽ� ���Ͽ��� ������ �б�
         try (FileInputStream fis = new FileInputStream(filePath)) {
             int content;
             System.out.println("���Ͽ��� ���� ������:");
             while ((content = fis.read()) != -1) {
                 System.out.print((char) content);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
      }
  }

