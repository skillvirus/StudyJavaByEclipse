package com.koreait.model;

public class BookInfo {
	private String bookID; //도서ID
	private String bookTitle; //도서제목
	private String bookISBN; //도서ISBN
	
	public String getBookID() {
		return bookID;
	}
	
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookISBN() {
		return bookISBN;
	}
	
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
}
