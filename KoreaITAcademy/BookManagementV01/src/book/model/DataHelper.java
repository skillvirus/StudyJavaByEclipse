package book.model;

import java.util.ArrayList;
import book.controler.*;

public class DataHelper {

	private ArrayList<Book> bookList = new ArrayList<Book>();
	private ArrayList<UserGeneral> userList = new ArrayList<UserGeneral>();

	public DataHelper() {
	}
	
	public void insertData(Book book) {
		bookList.add(book);
	}
	
	public void insertData(UserGeneral user) {
		userList.add(user);
	}
	
	public void selectBookData() {
		for (int loopCount = 0; loopCount < bookList.size(); loopCount++) {
			System.out.print(bookList.get(loopCount).getBookNo());
			System.out.print(" ");
			System.out.print(bookList.get(loopCount).getBookTitle());
			System.out.println();
		}
	}
	
	public void selectUserData() {
		for (int loopCount = 0; loopCount < userList.size(); loopCount++) {
			System.out.print(userList.get(loopCount).getUserID());
			System.out.print(" ");
			System.out.print(userList.get(loopCount).getUserName());
			System.out.println();
		}
	}
}
