package com.bistu.javaweb.bean;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class DBConnection {
/*	
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String userName = "root";
	private static String userPwd = "";
	private static String dbName = "javaweb";
*/
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String userName = "rpj40dlgw2e488n4";
	private static String userPwd = "";
	private static String dbName = "rpj40dlgw2e488n4";

	public static Connection getDBConnection() {
		String url1 = "jdbc:mysql://rdsfu28pc2js13r5fz2k.mysql.rds.aliyuncs.com/" + dbName;
//		String url1 = "jdbc:mysql://SAE_MYSQL_HOST_M/" + dbName;
		String url2 = "?user=" + userName + "&password=" + userPwd;
		String url3 = "&userUnicode=true&characterEncoding=UTF-8";
		String url = url1 + url2 + url3;
		
		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url);
			return conn;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeDB(Connection conn, java.sql.PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String getDriverName() {
		return driverName;
	}
	public static void setDriverName(String driverName) {
		DBConnection.driverName = driverName;
	}
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		DBConnection.userName = userName;
	}
	public static String getUserPwd() {
		return userPwd;
	}
	public static void setUserPwd(String userPwd) {
		DBConnection.userPwd = userPwd;
	}
	public static String getDbName() {
		return dbName;
	}
	public static void setDbName(String dbName) {
		DBConnection.dbName = dbName;
	}
}
