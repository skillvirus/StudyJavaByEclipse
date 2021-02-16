package book.model;

import java.util.ArrayList;
import book.controler.*;

public class DataHelper {

	private ArrayList<Book> bookList = new ArrayList<Book>();

	public DataHelper() {
	}
	
	public void insertData(Book book) {
		bookList.add(book);
	}
	
	public void selectData() {
		for (int loopCount = 0; loopCount < bookList.size(); loopCount++) {
			System.out.print(bookList.get(loopCount).getBookNo());
			System.out.print(" ");
			System.out.print(bookList.get(loopCount).getBookTitle());
			System.out.println();
		}
	}
}
