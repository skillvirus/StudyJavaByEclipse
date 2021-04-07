package controler;

import model.DataHelper;

public class UserGeneral {
	
	private String userID; //사용자 ID
	private String userName; //사용자 성명
	private String userPhoneNum; //사용자 전화번호
	
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

	public String getUserPhoneNum() {
		return userPhoneNum;
	}

	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	
	DataHelper dataHelper = new DataHelper();
	
	public void insertUserInfo(UserGeneral user) {
		dataHelper.insertData(user);
	}
	
	public void selectUserInfo(UserGeneral user) {
		dataHelper.selectData(user);
	}
	
	public void selectUserAllInfo(UserGeneral user) {
		dataHelper.selectAllData(user);
	}
	
	public void deleteUserInfo(UserGeneral user) {
		dataHelper.deleteData(user);
	}
	
	public void updateUserInfo(UserGeneral user, UserGeneral updatedUser) {
		dataHelper.updateData(user, updatedUser);
	}
}
