package book.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import book.controler.Book;
import book.controler.BookInOut;
import book.controler.UserGeneral;

public class DataHelper {

	public DataHelper() {
	}
	
	public void insertData(Book book) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;
		
		try {
			queryString = "	INSERT INTO BookInfo"
						+ "	("
						+ "		BookID,"
						+ "		BookTitle,"
						+ " 	BookISBN"
						+ " )"
						+ " VALUES"
						+ " ("
						+ "		?,"
						+ "		?,"
						+ "		?"
						+ " );";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, book.getBookID()));
			dataPack.add(new DataPack(2, book.getBookTitle()));
			dataPack.add(new DataPack(3, book.getBookISBN()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			System.out.println();
		

			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertData(UserGeneral user) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;

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
			dataPack.add(new DataPack(1, user.getUserID()));
			dataPack.add(new DataPack(2, user.getUserName()));
			dataPack.add(new DataPack(3, user.getUserPhoneNum()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			System.out.println();

			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void insertData(BookInOut bookInOut) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;

		try {
			queryString = "	INSERT INTO BookInOut"
						+ "	("
						+ "		UserID,"
						+ "		UserName,"
						+ " 	BookID,"
						+ " 	BookTitle,"
						+ " 	InOutType,"
						+ " 	InOutDate"
						+ " )"
						+ " VALUES"
						+ " ("
						+ "		?,"
						+ "		?,"
						+ "		?,"
						+ "		?,"
						+ "		?,"
						+ "		?"
						+ " );";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, bookInOut.getUserID()));
			dataPack.add(new DataPack(2, bookInOut.getUserName()));
			dataPack.add(new DataPack(3, bookInOut.getBookID()));
			dataPack.add(new DataPack(4, bookInOut.getBookName()));
			dataPack.add(new DataPack(5, bookInOut.getInOutType()));
			dataPack.add(new DataPack(6, bookInOut.getInOutDate()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			System.out.println();

			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectData(Book book) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		String queryString;
		
		try {
			queryString = "	SELECT	BookID,"
						+ "			BookTitle,"
						+ "			BookISBN "
						+ "	FROM 	BookInfo"
						+ "	WHERE	BookID = ?";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, book.getBookID()));
			
			resultSet = databaseAccessHelper.executeQuery(queryString, dataPack);
			
			System.out.println();
		
			System.out.println("도서ID" + " | " + "도서제목" + " | " + "도서ISBN"); //제목
			while(resultSet.next()) {
				System.out.println(resultSet.getString("BookID") + " | " 
								 + resultSet.getString("BookTitle") + " | " 
								 + resultSet.getString("BookISBN"));
			}
			
			databaseAccessHelper.Close();
			resultSet.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectData(UserGeneral user) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		String queryString;
		
		try {
			queryString = "	SELECT	UserID,"
						+ "			UserName,"
						+ "			UserPhoneNum "
						+ "	FROM 	UserInfo"
						+ "	WHERE	UserID = ?";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, user.getUserID()));
			
			resultSet = databaseAccessHelper.executeQuery(queryString, dataPack);
			
			System.out.println();
			
		
			System.out.println("사용자ID" + " | " + "성명" + " | " + "전화번호"); //제목
			while(resultSet.next()) {
				System.out.println(resultSet.getString("UserID") + " | " 
								 + resultSet.getString("UserName") + " | " 
								 + resultSet.getString("UserPhoneNum"));
			}
			
			databaseAccessHelper.Close();
			resultSet.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectData(BookInOut bookInOut) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		String queryString;
		
		try {
			queryString = "	SELECT	UserID,"
						+ "			UserName,"
						+ "			BookID,"
						+ "			BookTtile,"
						+ "			InOutType,"
						+ "			InOutDate"
						+ "	FROM 	BookInOut"
						+ "	WHERE	UserID = ?";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, bookInOut.getUserID()));
			
			resultSet = databaseAccessHelper.executeQuery(queryString, dataPack);
			
			System.out.println();
			
			System.out.println("사용자ID" + " | " + "성명" + " | " + "도서ID" + " | " + "도서제목" + " | " + "입출고구분" + " | " + "일자"); //제목
			while(resultSet.next()) {
				System.out.println(resultSet.getString("UserID") + " | " 
						 		 + resultSet.getString("UserName") + " | " 
								 + resultSet.getString("BookID") + " | "
								 + resultSet.getString("BookTitle") + " | "
								 + resultSet.getString("InOutType") + " | "
								 + resultSet.getString("InOutDate"));
			}
			
			databaseAccessHelper.Close();
			resultSet.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectAllData(Book book) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		String queryString;
		
		try {
			queryString = "	SELECT	BookID,"
						+ "			BookTitle,"
						+ "			BookISBN "
						+ "	FROM 	BookInfo";
			
			resultSet = databaseAccessHelper.executeQuery(queryString);
	
			System.out.println();

			System.out.println("도서ID" + " | " + "도서제목" + " | " + "도서ISBN"); //제목
			while(resultSet.next()) {
				System.out.println(resultSet.getString("BookID") + " | " 
								 + resultSet.getString("BookTitle") + " | " 
								 + resultSet.getString("BookISBN"));
			}
			
			databaseAccessHelper.Close();
			resultSet.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectAllData(UserGeneral user) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		String queryString;
		
		try {
			queryString = "	SELECT	UserID,"
						+ "			UserName,"
						+ "			UserPhoneNum "
						+ "	FROM 	UserInfo";
			
			resultSet = databaseAccessHelper.executeQuery(queryString);
	
			System.out.println();
			
			System.out.println("사용자ID" + " | " + "성명" + " | " + "전화번호"); //제목
			while(resultSet.next()) {
				System.out.println(resultSet.getString("UserID") + " | " + resultSet.getString("UserName") + " | " + resultSet.getString("UserPhoneNum"));
			}
			
			databaseAccessHelper.Close();
			resultSet.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectAllData(BookInOut bookInOut) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		String queryString;
		
		try {
			queryString = "	SELECT	UserID,"
						+ "			UserName,"
						+ "			BookID,"
						+ "			BookTitle,"
						+ "			InOutType,"
						+ "			InOutDate"
						+ "	FROM 	BookInOut";
			
			resultSet = databaseAccessHelper.executeQuery(queryString);
	
			System.out.println();

			System.out.println("사용자ID" + " | " + "성명" + " | " + "도서ID" + " | " + "도서제목" + " | " + "입출고구분" + " | " + "일자"); //제목
			while(resultSet.next()) {
				System.out.println(resultSet.getString("UserID") + " | " 
						 		 + resultSet.getString("UserName") + " | " 
								 + resultSet.getString("BookID") + " | "
								 + resultSet.getString("BookTitle") + " | "
								 + resultSet.getString("InOutType") + " | "
								 + resultSet.getString("InOutDate"));
			}
			
			databaseAccessHelper.Close();
			resultSet.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData(Book book) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;
		
		try {
			queryString = "	DELETE "
						+ " FROM 	BookInfo"
						+ "	WHERE	BookID = ?;";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, book.getBookID()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			System.out.println();
			
			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData(UserGeneral user) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;
		
		try {
			queryString = "	DELETE "
						+ " FROM 	UserInfo"
						+ "	WHERE	UserID = ?;";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, user.getUserID()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			System.out.println();
			
			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateData(Book book, Book updatedBook) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;
		
		try {
			queryString = "	UPDATE	BookInfo "
						+ " SET 	BookTitle = ?,"
						+ "			BookISBN = ?"
						+ "	WHERE	BookID = ?;";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, updatedBook.getBookTitle()));
			dataPack.add(new DataPack(2, updatedBook.getBookISBN()));
			dataPack.add(new DataPack(3, book.getBookID()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateData(UserGeneral user, UserGeneral updatedUser) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		String queryString;
		
		try {
			queryString = "	UPDATE	UserInfo "
						+ " SET 	UserName = ?,"
						+ "			UserPhoneNum = ?"
						+ "	WHERE	UserID = ?;";
			
			ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
			dataPack.add(new DataPack(1, updatedUser.getUserName()));
			dataPack.add(new DataPack(2, updatedUser.getUserPhoneNum()));
			dataPack.add(new DataPack(3, user.getUserID()));
			
			databaseAccessHelper.executeNonQuery(queryString, dataPack);
			
			databaseAccessHelper.Close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
