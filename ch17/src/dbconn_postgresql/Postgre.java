package dbconn_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Postgre {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost/sample";
	private final static String USER = "postgres";
	private final static String PASS = "1234";
	
	static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn=DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				System.out.println("DB 연걸 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER 로드 실패");
		}
		return conn;
	}
	public static void close(Connection conn, PreparedStatement pstmt){
		try {
			pstmt.close();
			try {
			conn.close();
			} catch (SQLException e) {
				System.out.println("DB 연결 종료 실패.");
			} 
		} catch (SQLException e) {
			System.out.println("DB 상태 연결 끊기 실패.");
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			try {
				pstmt.close();
				try {
					conn.close();
				} catch(SQLException e){
					System.out.println("DB 연결 종료 실패");
				}
			} catch(SQLException e) {
				System.out.println("DB 상태 연결 끊기 실패");
			}
		} catch(SQLException e) {
				System.out.println("쿼리 실행 종료 실패");
		}
	}		
}