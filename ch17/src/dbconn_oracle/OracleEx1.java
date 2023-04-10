package dbconn_oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		String sql = "select * from tbl_member_202201";
		conn = DBConnector.getConnection();
		ArrayList<Member> memList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Member mem = new Member();
				mem.setSeq(rs.getInt("Member_seq"));
				mem.setNo(rs.getString("c_no"));
				mem.setName(rs.getString("c_name"));
				mem.setPhone(rs.getString("phone"));
				mem.setAddress(rs.getString("address"));
				mem.setRegdate(rs.getString("regist_date"));
				mem.setCtype(rs.getString("c_type"));
				memList.add(mem);
			}
			DBConnector.close(conn, pstmt, rs);
		} catch (SQLException e) {
		}
		for(Member m : memList){
			System.out.println(m.toString());
		}
	}
}