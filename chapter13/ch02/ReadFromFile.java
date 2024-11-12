package ch02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
			String line;
			System.out.println("���� ����:");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println("������ �д� ���� ���� �߻�: " + e.getMessage());
		}
	}
}
