package book.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
//		Viewer viewer = new Viewer();
//		viewer.start();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
				
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:./././Resources/Database/BookManagement.db");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT ID, BookName, BookISBN FROM Book");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("ID") + " | " + resultSet.getString("BookName") + " | " + resultSet.getString("BookISBN"));
			}
			
			resultSet.close();
			connection.close();
			
			//System.out.println("연결되었습니다.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			
		}
	}
}
