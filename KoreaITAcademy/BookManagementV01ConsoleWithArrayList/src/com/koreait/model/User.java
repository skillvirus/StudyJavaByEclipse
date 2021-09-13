package com.koreait.model;

import com.koreait.controller.DataHelper;

public class User {
	
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
	
	public void insertUserInfo(User user) {
		dataHelper.insertData(user);
	}
	
	public void selectUserInfo(User user) {
		dataHelper.selectData(user);
	}
	
	public void selectUserAllInfo(User user) {
		dataHelper.selectAllData(user);
	}
	
	public void deleteUserInfo(User user) {
		dataHelper.deleteData(user);
	}
	
	public void updateUserInfo(User user, User updatedUser) {
		dataHelper.updateData(user, updatedUser);
	}
}
