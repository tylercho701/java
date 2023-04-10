package dbconn_mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		String sql = "update test2 set pw=?, name=? where id=?";
		conn = MySQL.getConnection();
		int a = 0;
		
		Test2 test2 = new Test2();
		test2.setId("viptyler");
		test2.setPw("9876");
		test2.setName("unknown");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, test2.getPw());
			pstmt.setString(2, test2.getName());
			pstmt.setString(3, test2.getId());
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
