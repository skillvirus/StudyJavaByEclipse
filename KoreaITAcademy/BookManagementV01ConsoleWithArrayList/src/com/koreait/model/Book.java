package com.koreait.model;

import com.koreait.controller.DataHelper;

public class Book {

	private String bookID; //책ID
	private String bookTitle; //제목
	private String bookISBN; //ISBN
	
//	private String bookAuthor; //저자
//	private String bookTranslator; //번역자
//	private String bookPublisher; //출판사
//	private String bookRegDate; //등록일
	
	/*
	 * Constructor
	*/
	public Book() {
	}
	
	/*
	 * Get bookNo
	 */
	public String getBookID() {
		return bookID;
	}
	
	/*
	 * Set bookNo
	 */
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	/*
	 * Get bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/*
	 * Set bookTitle
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	/*
	 * Get bookISBN
	 */
	public String getBookISBN() {
		return bookISBN;
	}

	/*
	 * Set bookISBN
	 */
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	DataHelper dataHelper = new DataHelper();
	
	public void insertBookInfo(Book book) {
		dataHelper.insertData(book);
	}
	
	public void selectBookInfo(Book book) {
		dataHelper.selectData(book);
	}
	
	public void selectBookAllInfo(Book book) {
		dataHelper.selectAllData(book);
	}
	
	public void deleteBookInfo(Book book) {
		dataHelper.deleteData(book);
	}
	
	public void updateBookInfo(Book book, Book updatedbook) {
		dataHelper.updateData(book, updatedbook);
	}
}
