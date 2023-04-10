package dbconn_mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		Course_tbl c = new Course_tbl();
		
		c.setWeek(3);
		c.setStart_hour(1000);
		c.setEnd_end(1800);
		c.setId("40002");
		
		String sql = "update course_tbl set week = ?, start_hour = ?, end_end = ? where id = ?";
		
		int i = 0;
		conn = DBC.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, c.getWeek());
			pstmt.setInt(2, c.getStart_hour());
			pstmt.setInt(3, c.getEnd_end());
			pstmt.setString(4, c.getId());
			
			i = pstmt.executeUpdate();
			
			if(i>0){
				System.out.println("정보 수정이 완료되었습니다.");
			} else {
				System.out.println("정보 수정 실패.");
			}
			DBC.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("작동 실패.");
		}
	}
}