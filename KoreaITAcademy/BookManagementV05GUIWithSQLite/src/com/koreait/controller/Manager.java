package com.koreait.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.koreait.model.BookInfo;
import com.koreait.model.BookRentalHistoryInfo;
import com.koreait.model.UserInfo;

public class Manager {
	
	DatabaseAccessHelper databaseAccessHelper = null;
	String queryString = null;
	ArrayList<DataPack> dataPack = null;
	ResultSet resultSet = null;
	
	public Manager() {
		databaseAccessHelper = new DatabaseAccessHelper();
		dataPack = new ArrayList<DataPack>();
	}
	
	/*
	 * 사용자 정보 등록
	 */
	public boolean inserUserInfo(UserInfo userInfo) {
		boolean returnValue = false;
		
		try {
			queryString = "	INSERT INTO UserInfo"
						+ "	("
						+ "		UserID,"
						+ "		UserName,"
						+ " 	UserPhoneNum"
						+ " )"
						+ " VALUES"
						+ " ("
						+ "		?,"
						+ "		?,"
						+ "		?"
						+ " );";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, userInfo.getUserID()));
			dataPack.add(new DataPack(2, userInfo.getUserName()));
			dataPack.add(new DataPack(3, userInfo.getUserPhoneNum()));
			
			databaseAccessHelper.executeUpdate(queryString, dataPack);
			
			returnValue = true;
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return returnValue;
	}
	
	/*
	 * 사용자 정보 삭제
	 */
	public boolean deleteUserInfo(UserInfo userInfo) {
		boolean returnValue = false;
		
		try {
			queryString = "	DELETE"
						+ "	FROM UserInfo"
						+ "	WHERE UserID = ?";
			
			
			dataPack.add(new DataPack(1, userInfo.getUserID()));
			
			databaseAccessHelper.executeUpdate(queryString, dataPack);
			
			returnValue = true;
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return returnValue;
	}
		
	/*
	 * 사용자 정보 수정
	 */
	public boolean updateUserInfo(UserInfo usrInfo) {
		boolean returnValue = false;
		
		return returnValue;
	}
	
	/*
	 * 사용자 정보 조회
	 */
	public ResultSet selectUserInfo(UserInfo userInfo) {
		try {
			queryString = "	SELECT	UserID,"
						+ "			UserName,"
						+ "			UserPhoneNum "
						+ "	FROM 	UserInfo"
						+ "	WHERE	UserID = ?";
		
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, userInfo.getUserID()));
			resultSet = databaseAccessHelper.executeQuery(queryString, dataPack);
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return resultSet;
	}
	
	/*
	 * 도서 정보 등록
	 */
	public boolean insertBookInfo(BookInfo bookInfo) {
		boolean returnValue = false;
		
		return returnValue;
	}	
	
	/*
	 * 도서 정보 삭제
	 */
	public boolean deleteBookInfo(BookInfo bookInfo) {
		boolean returnValue = false;
		
		return returnValue;	
	}
		
	/*
	 * 도서 정보 수정
	 */
	public boolean updateBookInfo(BookInfo bookInfo) {
		boolean returnValue = false;
		
		return returnValue;
	}
	
	/*
	 * 도서 정보 조회
	 */
	public ResultSet selectBookInfo(BookInfo bookInfo) {
		ResultSet resultSet = null;
		
		return resultSet;
	}
	
	/*
	 * 도서 대출 등록
	 */
	public boolean insertBookRental(BookRentalHistoryInfo bookRentalHistoryInfo) {
		boolean returnValue = false;
		
		return returnValue;
	}
	
	/*
	 * 도서 반납 등록
	 */
	public boolean insertBookReturn(BookRentalHistoryInfo bookRentalHistoryInfo) {
		boolean returnValue = false;
		
		return returnValue;
	}
	
	/*
	 * 도서 대여 이력 조회
	 */
	public ResultSet selectBookRentalHistory(BookRentalHistoryInfo bookRentalHistoryInfo) {
		ResultSet resultSet = null;
		
		return resultSet;
	}
	
	/*
	 * 데이터베이스 접속 해제
	 */
	public void closeDataBaseConnection() {
		if (databaseAccessHelper != null) {
			databaseAccessHelper.close();
		}
	}
	
	/*
	 * ResultSet 해제
	 */
	public void closeResultSet() {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
