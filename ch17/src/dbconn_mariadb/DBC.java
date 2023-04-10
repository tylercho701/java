package dbconn_mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBC {
	
	private final static String DRIVER = "org.mariadb.jdbc.Driver";
	private final static String URL = "jdbc:mariadb://127.0.0.1:3308/company";
	private final static String ID = "root";
	private final static String PW = "1234";
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn=DriverManager.getConnection(URL, ID, PW);
			} catch (SQLException e) {
				System.out.println("DB 연결 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER 로딩 실패");
		}
		return conn;
	}
	public static void close(Connection conn, PreparedStatement pstmt){
		try {
			pstmt.close();
			try {
			conn.close();
			} catch (SQLException e) {
				System.out.println("DB 닫기 실패");
			}
		} catch (SQLException e) {
			System.out.println("DB 상태 연결 끊기 실패.");
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
		try {
			rs.close();
			try {
				pstmt.close();
				try {
				conn.close();
				} catch (SQLException e) {
					System.out.println("DB 닫기 실패");
				}
			} catch (SQLException e) {
				System.out.println("DB 상태 연결 끊기 실패.");
			}
		} catch (SQLException e) {
			System.out.println("QUERY 종료 실패.");
		}
	}
}