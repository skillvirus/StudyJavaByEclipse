package com.koreait.model;

import com.koreait.controller.DataHelper;

public class UserAdmin {

	DataHelper dataHelper = new DataHelper();
	
	public UserAdmin() {
	}
	
	public void insertBookInfo(Book book) {
		dataHelper.insertData(book);
	}
	
//	public void selectBookInfo() {
//		dataHelper.selectData();
//	}
}
