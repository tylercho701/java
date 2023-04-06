package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	// 연결에 필요한 상수 선언
	private final static String DRIVER = "oracle.jdbc.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USERNAME = "system";
	private final static String PASSWORD = "1234";
	// connection conn = DEConnector.getConnection();
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
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