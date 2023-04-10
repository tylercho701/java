package dbconn_mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MariaDBEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		String sql = "select * from course_tbl";
		conn = DBC.getConnection();
		ArrayList<Course_tbl> courseList = new ArrayList<>();
		try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			Course_tbl course = new Course_tbl();
			course.setId(rs.getString("id"));
			course.setName(rs.getString("name"));
			course.setCredit(rs.getInt("credit"));
			course.setLecture(rs.getString("lecturer"));
			course.setWeek(rs.getInt("week"));
			course.setStart_hour(rs.getInt("start_hour"));
			course.setEnd_end(rs.getInt("end_end"));
			courseList.add(course);
		}
		DBC.close(conn, pstmt, rs);
		} catch (SQLException e) {
			System.out.println("오류 발생");
		}
		for (Course_tbl c : courseList){
			System.out.println(c.toString());
		}
	}
}