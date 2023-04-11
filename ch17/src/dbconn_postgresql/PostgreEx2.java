package dbconn_postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PostgreEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args){
		String sql = "select into tbl_tmp_202108 values (?, ?, ?, ?, ?, ?, ?)";
		
		Emp e = new Emp();
		e.setEmpno("1008");
		e.setEmpname("최사원");
		e.setTel1("010");
		e.setTel2("1234");
		e.setTel3(8888);
		e.setDeptcode("30");
		e.setPosition("4");
		
		int i = 0;
		
	}
}
