package dbconn_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {
	private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/sample?serverTimezone=Asia/Seoul";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				System.out.println("DB 연결 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER 로딩 실패");
		}
		return conn;
	}
	// Connection, [Prepared]Statement, ResultSet(select문)
	public static void close(Connection conn, PreparedStatement pstmt){
		try {
			pstmt.close();
			try {
			conn.close();
			} catch (Exception e){
				System.out.println("데이터베이스 닫기 실패");
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스의 상태 연결 끊기 실패.");
		}
	}
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
		try {
			rs.close();
			try {
				pstmt.close();
				try {
				conn.close();
				} catch(SQLException e){
					System.out.println("데이터베이스 닫기 실패");
				}
			} catch (SQLException e){
				System.out.println("데이터베이스의 상태 연결 끊기 실패");
			}
		} catch (SQLException e) {
			System.out.println("쿼리 종료 실패");
		}
	}
}
