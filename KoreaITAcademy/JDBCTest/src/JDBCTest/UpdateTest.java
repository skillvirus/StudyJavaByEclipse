package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {
	public static void main(String[] args) {
		
		Connection connection = null; //데이터베이스 연결된 상태(세션)를 저장하는 객체
		PreparedStatement preparedStatement = null; //SQL문을 나타내는 객체
		String queryString; //SQL 쿼리문
		
		try {
			
			queryString = "UPDATE BookInfo SET BookTitle = ?, BookISBN = ? WHERE BookID = ?";
			
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:BookManagement.db");
			preparedStatement = connection.prepareStatement(queryString);
			
			preparedStatement.setString(1, "책제목");
			preparedStatement.setString(2, "0000000000001");
			preparedStatement.setString(3, "6");
			
			preparedStatement.executeUpdate();
			System.out.println("저장되었습니다.");
					
			connection.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
