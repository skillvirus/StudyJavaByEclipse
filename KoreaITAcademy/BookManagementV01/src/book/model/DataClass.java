package book.model;

import java.util.ArrayList;
import book.controler.*;

public class DataClass {

	private ArrayList<BookClass> bookList = new ArrayList<BookClass>();

	public DataClass() {
	}
	

	public void insertData(BookClass bookClass) {
		bookList.add(bookClass);
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
