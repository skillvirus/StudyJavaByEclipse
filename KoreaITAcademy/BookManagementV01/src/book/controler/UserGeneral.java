package book.controler;

import book.model.DataHelper;

public class UserGeneral {
	
	private String userID; //사용자 ID
	private String userName; //사용자 성명
	
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
	
	DataHelper dataHelper = new DataHelper();
	
	public void insertUserInfo(UserGeneral user) {
		dataHelper.insertData(user);
	}
	
	public void selectUserInfo() {
		dataHelper.selectUserData();
	}
}
