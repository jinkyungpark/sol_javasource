package chapter13.ch03.bookEx03;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {

	// ArrayList booklist
	private ArrayList<Book> bookList;

	public BookArrayList() {
		bookList = new ArrayList<Book>();
	}

	// å �߰� �޼���
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// å ���� �޼���
	  public boolean removeBook(int bookId) {
	     Iterator<Book> it = bookList.iterator();
	     
	     while(it.hasNext()) {
	    	 Book book=it.next();
	    	 int tempId=book.bookId();
	    	 if(tempId == bookId) {
	    		 bookList.remove(book);
	    		 System.out.println("ID "+bookId+"�� å�� �����Ǿ����ϴ�.");
	    		 return true;
	    	 }
	     }//while
	     	System.out.println("ID "+ bookId+"�� å�� �������� �ʽ��ϴ�.");
	     	return false;
	  }//removeBook
	  
	// ��� å ���� ��� �޼���
	  public void showAllBooks() {
		  
		  for(Book book:bookList) {
			  System.out.println(book);
		  }
		  System.out.println();
	  }
}




