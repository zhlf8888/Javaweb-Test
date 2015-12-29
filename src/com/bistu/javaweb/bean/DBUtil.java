package com.bistu.javaweb.bean;
import java.sql.*;

public class DBUtil {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int updateSQL(String sql) {
		int n = -1;
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		DBConnection.closeDB(conn, pstmt, rs);
		return n;
	}
	public ResultSet QuerySQL(String sql){
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			return rs;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
