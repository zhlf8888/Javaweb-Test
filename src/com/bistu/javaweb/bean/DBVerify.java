package com.bistu.javaweb.bean;

import java.sql.*;

public class DBVerify {
	private String userName = null;
	private String userPwd = null;
	
	public boolean verify(String name, String password) throws SQLException, ClassNotFoundException {
		boolean v = false;
		
		DBConnection  dbc = new DBConnection();
		Connection conn = dbc.getDBConnection();
		
		String sql = "select * from user where(name=? and password=?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next())
			v = true;
		else
			v = false;
		
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
		
		return v;
	}
	
	public DBVerify(){}
	public DBVerify(String a, String b){
		userName = a;
		userPwd = b;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}
