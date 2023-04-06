package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) {
		conn = DBConnector.getConnection();
		
		int i = 0;
		
		Member mem = new Member();
		mem.setNo("30001");
		mem.setName("조교행");
		mem.setPhone("01098765432");
		mem.setAddress("고양시 일산");
		mem.setRegdate("20230406");
		mem.setCtype("VIP");
		
		String sql = "insert into tbl_member_202201 values (member_seq.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getNo());
			pstmt.setString(2, mem.getName());
			pstmt.setString(3, mem.getPhone());
			pstmt.setString(4, mem.getAddress());
			pstmt.setString(5, mem.getRegdate());
			pstmt.setString(6, mem.getCtype());
			
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