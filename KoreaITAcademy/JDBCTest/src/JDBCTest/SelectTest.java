package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		
		Connection connection = null; //데이터베이스 연결된 상태(세션)를 저장하는 객체
		PreparedStatement preparedStatement = null; //SQL문을 나타내는 객체
		ResultSet resultSet = null; //SQL 쿼리문의 결과값을 저장하는 객체
		String queryString; //SQL 쿼리문
		
		try {
			
			queryString = "SELECT BookID, BookTitle, BookISBN FROM BookInfo";
			
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:BookManagement.db");
			preparedStatement = connection.prepareStatement(queryString);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3));
			}
					
			resultSet.close();
			connection.close();
			
			//System.out.println("연결되었습니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
