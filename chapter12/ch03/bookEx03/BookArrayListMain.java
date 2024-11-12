package chapter13.ch03.bookEx03;

public class BookArrayListMain {

	public static void main(String[] args) {

		// BookArrayListEx02 ��ü ����
		BookArrayList bookArrayList = new BookArrayList();

		// å����
		Book book1 = new Book(1001, "�ڹ��� ����");
		Book book2 = new Book(1002, "SolDesk Python");
		Book book3 = new Book(1003, "SolDesk Java");
		Book book4 = new Book(1004, "Ŭ�� �ڵ�");

		// å�߰�
		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);

		// ��� å ���� ���
		System.out.println("===��ü å ���===");
		bookArrayList.showAllBooks();

		// å����
		System.out.println("===Ŭ���ڵ� å ����===");
		bookArrayList.removeBook(book4.bookId());

		// ���� �� å����
		bookArrayList.showAllBooks();
	}
}
