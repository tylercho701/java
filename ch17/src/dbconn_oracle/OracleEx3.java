package dbconn_oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) {
		conn = DBConnector.getConnection();
		
		int i = 0;
		
		Member mem = new Member();
		mem.setNo("10002");
		
		String sql = "delete from tbl_member_202201 where c_no=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getNo());
			
			i = pstmt.executeUpdate();
			
			if(i>0){
				System.out.println("작업이 성공했습니다.");
			} else {
				System.out.println("작업이 실패했습니다.");
			}
				
			DBConnector.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("DB 불러오기에 실패했습니다.");
		}
	}
}