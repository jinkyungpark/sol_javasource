package chapter13.ch01.genericcontainerEx03;

public class GenericContainer<T>{

	private T[] items; //int[] i;
	private int count;
	
	//�⺻������ ���� 
	
	public GenericContainer(int size) {
		items=(T[])new Object[size]; //cast
		count=0;
	}
	
	//�������� �߰��ϴ� ���׸� �޼���
	public void addItem(T item) {
		
		if(count< items.length) {
			//items[count]=item;
			//count++;
			items[count++]=item;
		}else {
			System.out.println("Container is full.");
		}	
	}//additem
	
	public void printItems() {
		for(int i=0;i<count;i++) {
			System.out.print(items[i]+" ");
		}
		System.out.println();
	}
	//Ÿ�� ������ ����Ͽ� ������ �����Ϳ� ���� �հ踦 ���� �� ����
	public <E extends Number> double sum(E[] numbers) {
		double total=0;
		for(E number:numbers) {
			total+=number.doubleValue();//��ڽ�
		}
		return total;
	}//sum

}
