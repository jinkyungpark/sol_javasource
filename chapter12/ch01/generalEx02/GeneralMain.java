package chapter13.ch01.generalEx02;

public class GeneralMain {

	public static void main(String[] args) {

		General general = new General();

		// ������ �迭
		Integer[] iArr = { 10, 20, 30, 40, 50 };
		general.printArr(iArr);

		Double[] dArr = { 10.1, 20.2, 30.3, 40.4, 50.5 };
		general.printArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printArr(cArr);

	}

}
