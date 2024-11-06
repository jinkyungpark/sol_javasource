package chapter13.ch01.genericcontainerEx03;

public class GenericContainerMainEx04 {

	public static void main(String[] args) {

		// ���ڿ� �����͸� �����ϴ� Container
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);

		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		System.out.print("String Container: ");
		stringContainer.printItems();

		// Ÿ���������� String �������� ����
		// String[] StringArray= {"1","2","3","4","5"};
		// stringContainer.sum(StringArray);

		// ���� �����͸� �����ϴ� Container
		GenericContainer<Integer> integerContainer = new GenericContainer<>(5);
		integerContainer.addItem(10);
		integerContainer.addItem(20);
		integerContainer.addItem(30);
		System.out.print("Integer Container: ");
		integerContainer.printItems();
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + integerContainer.sum(intArray));

		// �Ǽ� �����͸� �����ϰ� �հ踦 ����ϴ� ����
		GenericContainer<Double> doubleContainer = new GenericContainer<>(4);
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4};
		System.out.println("Sum of double array: " + doubleContainer.sum(doubleArray));
	}

}
