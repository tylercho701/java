package dbconn_mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		Course_tbl c = new Course_tbl();
		
		c.setId("40002");
		
		String sql = "delete from course_tbl where id = ?";
		
		conn = DBC.getConnection();
		int i = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getId());;
			
			i = pstmt.executeUpdate();
			DBC.close(conn, pstmt);
			
			if(i>0){
				System.out.println("작업이 완료 되었습니다.");
			} else {
				System.out.println("작업 실패");
			}
			
		} catch (SQLException e) {
		System.out.println("문제가 발생했습니다.");	
		}
		
	}
}