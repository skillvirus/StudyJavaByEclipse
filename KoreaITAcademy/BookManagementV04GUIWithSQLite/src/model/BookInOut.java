package model;


public class BookInOut extends BookManagementBaseClass {

	private String userID;
	private String UserName;
	private String bookID;
	private String bookName;
	private String inOutType;
	private String inOutDate;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
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
	
	public String getInOutType() {
		return inOutType;
	}
	
	public void setInOutType(String inOutType) {
		this.inOutType = inOutType;
	}
	
	public String getInOutDate() {
		return inOutDate;
	}
	
	public void setInOutDate(String inOutDate) {
		this.inOutDate = inOutDate;
	}
}
