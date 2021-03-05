package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	public static void main(String[] args) {
		
		Connection connection = null; //데이터베이스 연결된 상태(세션)를 저장하는 객체
		PreparedStatement preparedStatement = null; //SQL문을 나타내는 객체
		String queryString; //SQL 쿼리문
		
		try {
			
			queryString = "INSERT INTO BookInfo(BookID, BookTitle, BookISBN) VALUES (?,?,?)";
			
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:BookManagement.db");
			preparedStatement = connection.prepareStatement(queryString);
			
			preparedStatement.setString(1, "6");
			preparedStatement.setString(2, "책제목");
			preparedStatement.setString(3, "1111111111111");
			
			preparedStatement.executeUpdate();
			System.out.println("저장되었습니다.");
					
			connection.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
