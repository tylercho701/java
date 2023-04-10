package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface DBC {
	public Connection getConnection();
	public void close(Connection conn, PreparedStatement pstmt);
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs);
}