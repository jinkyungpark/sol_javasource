package ch02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("���Ͽ� ������ ������ �Է��ϼ���: ");
        String content = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(content);
            System.out.println("������ ���Ͽ� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            System.err.println("������ ���� ���� ���� �߻�: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

