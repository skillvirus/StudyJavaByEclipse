package com.koreait.model;

public class BookRentalHistoryInfo {
	private String userID; //사용자ID
	private String userName; //사용자성명
	private String bookID; //도서ID
	private String bookName; //도서제목
	private String rentalReturnType; //대출반납 타입
	private String rentalReturnDate; //대출반납 일자
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getBookID() {
		return bookID;
	}
	
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getRentalReturnType() {
		return rentalReturnType;
	}
	
	public void setRentalReturnType(String rentalReturnType) {
		this.rentalReturnType = rentalReturnType;
	}
	
	public String getRentalReturnDate() {
		return rentalReturnDate;
	}
	
	public void setRentalReturnDate(String rentalReturnDate) {
		this.rentalReturnDate = rentalReturnDate;
	}
}
