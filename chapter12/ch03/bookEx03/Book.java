package chapter13.ch03.bookEx03;

public record Book(int bookId, String bookTitle) {
	
    // toString �޼���� �⺻������ �ڵ� ����������, �ʿ��ϸ� Ŀ���͸���¡�� �� �ִ�.
    @Override
    public String toString() {
        return "å����: " + bookTitle + " (ID: " + bookId + ")";
    }
}