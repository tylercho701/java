package dbconn_mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		String sql = "insert into test2 values (?, ?, ?)";
		conn = MySQL.getConnection();
		int a = 0;
		
		Test2 test2 = new Test2();
		test2.setId("viptyler");
		test2.setPw("1111");
		test2.setName("tyler");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, test2.getId());
			pstmt.setString(2, test2.getPw());
			pstmt.setString(3, test2.getName());
			a = pstmt.executeUpdate();
			
			if(a>0){
				System.out.println("작업이 완료되었습니다.");
			} else {
				System.out.println("작업이 실패했습니다.");
			}
			
			MySQL.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("오류 발생");
		}
	}
}
