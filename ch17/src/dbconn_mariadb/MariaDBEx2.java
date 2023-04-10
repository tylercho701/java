package dbconn_mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		String sql = "insert into course_tbl values (?, ?, ?, ?, ?, ?, ?)";
		Course_tbl course = new Course_tbl();
		
		course.setId("40002");
		course.setName("모바일 운영체제");
		course.setCredit(3);
		course.setLecture("3");
		course.setWeek(4);
		course.setStart_hour(1400);
		course.setEnd_end(1700);
		
		int i = 0;
		
		conn = DBC.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  course.getId());
			pstmt.setString(2, course.getName());
			pstmt.setInt(3, course.getCredit());
			pstmt.setString(4, course.getLecture());
			pstmt.setInt(5, course.getWeek());
			pstmt.setInt(6, course.getStart_hour());
			pstmt.setInt(7, course.getEnd_end());
			
			i = pstmt.executeUpdate();
			
			if(i>0){
				System.out.println("쿼리문 실행 성공");
			} else {
				System.out.println("쿼리문 실행 실패");
			}
			
		} catch (SQLException e) {
			System.out.println("DB 업데이트 실패");
		}
		
	}
}