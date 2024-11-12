
 package ch02;

 import java.io.*;

 public class BufferedReaderWriterExample {
     public static void main(String[] args) {
         String filePath = "buffered_output.txt";
         String[] data = {"Hello, world!", "This is a test.", "Java I/O is interesting!"};

         // BufferedWriter�� ����Ͽ� ���Ͽ� �� ������ ������ ����
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
             for (String line : data) {
                 bw.write(line);
                 bw.newLine();  // �ٹٲ�
             }
             System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
         } catch (IOException e) {
             e.printStackTrace();
         }

         // BufferedReader�� ����Ͽ� ���Ͽ��� ������ �б�
         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
             String line;
             System.out.println("���Ͽ��� ���� ������:");
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
  }
 
 
