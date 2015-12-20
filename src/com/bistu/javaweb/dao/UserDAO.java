package com.bistu.javaweb.dao;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bistu.javaweb.bean.DBConnection;
import com.bistu.javaweb.daoImpl.UserDAOImpl;
import com.bistu.javaweb.domain.User;

public class UserDAO implements UserDAOImpl{
	
	private static String[] hexDigits = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
		
	public User find(User u) throws Exception {
		User n = new User();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = DBConnection.getDBConnection();
		pstmt = conn.prepareStatement("select * from user where name='"+u.getName()+"';");
		rs = pstmt.executeQuery();
		
		if(rs!=null) {
			while(rs.next()) {
				n.setName(rs.getString(1));
				n.setPassword(rs.getString(2));
				n.setMail(rs.getString(3));
			}
		}

		DBConnection.closeDB(conn, pstmt, rs);

		return n;
	}
	
	public User find_mail(String m) throws Exception {
		User u = new User();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = DBConnection.getDBConnection();
		pstmt = conn.prepareStatement("select * from user where mail='"+u.getMail()+"';");
		rs = pstmt.executeQuery();
		
		if(rs!=null) {
			while(rs.next()) {
				u.setName(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setMail(rs.getString(3));
			}
		}

		DBConnection.closeDB(conn, pstmt, rs);
		
		return u; 
	}
	
	public int updata(User u) throws Exception {
		int u2 = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		conn = DBConnection.getDBConnection();
		pstmt = conn.prepareStatement("update user set name=?,password=?,mail=? where name=?");
		pstmt.setString(1, u.getName());
		pstmt.setString(2, u.getPassword());
		pstmt.setString(3, u.getMail());
		pstmt.setString(4, u.getName());
		u2 = pstmt.executeUpdate();
			
		DBConnection.closeDB(conn, pstmt, rs);

		return u2;
	}
	
	public static String md5(String old) throws Exception {
		if(old!=null) {
			try {
				MessageDigest md5 = MessageDigest.getInstance("MD5");
				byte[] rs = md5.digest(old.getBytes());
				String rsString = bts(rs);
				return rsString.toUpperCase();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private static String bts(byte[] b) {
		StringBuffer resultsb = new StringBuffer();  
		int i=0;  
		for(i=0;i<b.length;i++) {
			resultsb.append(bts(b[i]));  
		}  
		return resultsb.toString();
	}
	
	private static String bts(byte b) {
		int n=b;  
		if(n<0) {  
		    n = 256 + n;  
		}  
		int d1 = n / 16;  
		int d2 = n /16;  
		return hexDigits[d1]+hexDigits[d2];  
	}
}

/*
public User find(User u) throws Exception {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	User u2 = null;
	
	try {
		conn = DBConnection.getDBConnection();
		pstmt = conn.prepareStatement(SELECT_SQL);
		pstmt.setString(1, u.getName());
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			u2 = new User();
			u2.setName(rs.getString(1));
			u2.setPassword(rs.getString(2));
		} 
	}catch(Exception e) {
	} finally {
		DBConnection.closeDB(conn, pstmt, rs);
	}
	return u2;
}
*/
