package model;

import java.util.ArrayList;

import controler.*;

public class DataHelper {

	private static ArrayList<Book> bookList = new ArrayList<Book>();
	private static ArrayList<UserGeneral> userList = new ArrayList<UserGeneral>();
	private static ArrayList<BookInOut> bookInOutList = new ArrayList<BookInOut>();

	public DataHelper() {
	}
	
	public void insertData(Book book) {
		bookList.add(book);
	}
	
	public void insertData(UserGeneral user) {
		userList.add(user);
	}

	public void insertData(BookInOut bookInOut) {
		bookInOutList.add(bookInOut);
	}
	
	public void selectData(Book book) {
		System.out.println();
		for (int loopCount = 0; loopCount < bookList.size(); loopCount++) {
			if (book.getBookID().equals(bookList.get(loopCount).getBookID()))
			{
				System.out.print(bookList.get(loopCount).getBookID());
				System.out.print(" ");
				System.out.print(bookList.get(loopCount).getBookTitle());
				System.out.print(" ");
				System.out.print(bookList.get(loopCount).getBookISBN());
				System.out.println();
			}
		}
	}
	
	public void selectData(UserGeneral user) {
		System.out.println();
		for (int loopCount = 0; loopCount < userList.size(); loopCount++) {
			if (user.getUserID().equals(userList.get(loopCount).getUserID()))
			{
				System.out.print(userList.get(loopCount).getUserID());
				System.out.print(" ");
				System.out.print(userList.get(loopCount).getUserName());
				System.out.print(" ");
				System.out.print(userList.get(loopCount).getUserPhoneNum());
				System.out.println();
			}
		}
	}
	
	public void selectData(BookInOut bookInOut) {
		System.out.println();
		for (int loopCount = 0; loopCount < bookInOutList.size(); loopCount++) {
			if (bookInOut.getUserID().equals(bookInOutList.get(loopCount).getUserID()))
			{
				System.out.print(bookInOutList.get(loopCount).getUserID());
				System.out.print(" ");
				System.out.print(bookInOutList.get(loopCount).getUserName());
				System.out.print(" ");
				System.out.print(bookInOutList.get(loopCount).getBookID());
				System.out.print(" ");
				System.out.print(bookInOutList.get(loopCount).getBookName());
				System.out.print(" ");
				System.out.print(bookInOutList.get(loopCount).getInOutType());
				System.out.println();
			}
		}
	}
	
	public void selectAllData(Book book) {
		System.out.println();
		for (int loopCount = 0; loopCount < bookList.size(); loopCount++) {
			System.out.print(bookList.get(loopCount).getBookID());
			System.out.print(" ");
			System.out.print(bookList.get(loopCount).getBookTitle());
			System.out.print(" ");
			System.out.print(bookList.get(loopCount).getBookISBN());
			System.out.println();
		}
	}
	
	public void selectAllData(UserGeneral user) {
		System.out.println();
		for (int loopCount = 0; loopCount < userList.size(); loopCount++) {
			System.out.print(userList.get(loopCount).getUserID());
			System.out.print(" ");
			System.out.print(userList.get(loopCount).getUserName());
			System.out.print(" ");
			System.out.print(userList.get(loopCount).getUserPhoneNum());
			System.out.println();
		}
	}
	
	public void selectAllData(BookInOut bookInOut) {
		System.out.println();
		for (int loopCount = 0; loopCount < bookInOutList.size(); loopCount++) {
			System.out.print(bookInOutList.get(loopCount).getUserID());
			System.out.print(" ");
			System.out.print(bookInOutList.get(loopCount).getUserName());
			System.out.print(" ");
			System.out.print(bookInOutList.get(loopCount).getBookID());
			System.out.print(" ");
			System.out.print(bookInOutList.get(loopCount).getBookName());
			System.out.print(" ");
			System.out.print(bookInOutList.get(loopCount).getInOutType());
			System.out.print(" ");
			System.out.print(bookInOutList.get(loopCount).getInOutDate());
			System.out.println();
		}
	}
	
	public void deleteData(Book book) {
		for (int loopCount = 0; loopCount < bookList.size(); loopCount++) {
			if (book.getBookID().equals(bookList.get(loopCount).getBookID()))
			{
				bookList.remove(loopCount);
			}
		}
	}
	
	public void deleteData(UserGeneral user) {
		for (int loopCount = 0; loopCount < userList.size(); loopCount++) {
			if (user.getUserID().equals(userList.get(loopCount).getUserID()))
			{
				userList.remove(loopCount);
			}
		}
	}
	
	public void updateData(Book book, Book updatedBook) {
		for (int loopCount = 0; loopCount < bookList.size(); loopCount++) {
			if (book.getBookID().equals(bookList.get(loopCount).getBookID()))
			{
				bookList.get(loopCount).setBookTitle(updatedBook.getBookTitle());
				bookList.get(loopCount).setBookISBN(updatedBook.getBookISBN());
			}
		}
	}
	
	public void updateData(UserGeneral user, UserGeneral updatedUser) {
		for (int loopCount = 0; loopCount < userList.size(); loopCount++) {
			if (user.getUserID().equals(userList.get(loopCount).getUserID()))
			{
				userList.get(loopCount).setUserName(updatedUser.getUserName());
				userList.get(loopCount).setUserPhoneNum(updatedUser.getUserPhoneNum());
			}
		}
	}
}
