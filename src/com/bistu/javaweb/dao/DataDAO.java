package com.bistu.javaweb.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bistu.javaweb.bean.DBConnection;
import com.bistu.javaweb.daoImpl.DataDAOImpl;
import com.bistu.javaweb.domain.Data;

public class DataDAO implements DataDAOImpl {
	protected static final String FIELDS_INSERT ="name,sex,relation,mobile,wechat";
	protected static String INSERT_SQL = "insert into data("+FIELDS_INSERT+")"+"values(?,?,?,?,?)";
	protected static String SELECT_SQL = "select"+FIELDS_INSERT+" from data where name=?";
	protected static String UPDATE_SQL = "update data set sex=?,relation=?,mobile=?,wechat=? where name=?";
	protected static String DELETE_SQL = "delete form data where name=?";
	
	public Data creat(Data d) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if(d.getName()==null){
			return d;
		}
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(INSERT_SQL);
			pstmt.setString(1, d.getName());
			pstmt.setString(2, d.getSex());
			pstmt.setString(3, d.getRelation());
			pstmt.setString(4, d.getMobile());
			pstmt.setString(5, d.getWechat());
			pstmt.executeUpdate();
		} catch(Exception e) {
		} finally {
			DBConnection.closeDB(conn, pstmt, rs);
		}
		return d;
	}
	public Data find(String d) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Data d2 = null;
		
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement("select * from data where name=?;");
			pstmt.setString(1, d);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				d2 = new Data();
				d2.setName(rs.getString(1));
				d2.setSex(rs.getString(2));
				d2.setRelation(rs.getString(3));
				d2.setMobile(rs.getString(4));
				d2.setWechat(rs.getString(5));
			} 
		}catch(Exception e) {
		} finally {
			DBConnection.closeDB(conn, pstmt, rs);
		}
		return d2;
	}
	public List<Data> findAll() throws Exception {
		/*
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBConnection.getDBConnection();
		pstmt = conn.prepareStatement("select * from data;");
		rs = pstmt.executeQuery();
		
		conn.close();
		pstmt.close();
//		DBConnection.closeDB(conn, pstmt, rs);
		return rs;
		*/
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Data> data = new ArrayList<Data>();
		conn = DBConnection.getDBConnection();
		pstmt = conn.prepareStatement("select * from data;");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Data d2 = new Data();
			d2.setName(rs.getString(1));
			d2.setSex(rs.getString(2));
			d2.setRelation(rs.getString(3));
			d2.setMobile(rs.getString(4));
			d2.setWechat(rs.getString(5));
			data.add(d2);
		}
		DBConnection.closeDB(conn, pstmt, rs);
		return data;
		 
	}
	public int remove(Data d) throws Exception {
		int d2 = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.getDBConnection();
			Statement stmt = conn.createStatement();
    		d2 = stmt.executeUpdate("delete from data where name='"+d.getName()+"';");		
		} catch(Exception e) {
		} finally {
			DBConnection.closeDB(conn, pstmt, rs);
		}
		return d2;
	}
	public int update(Data d) throws Exception {
		int d2 = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(UPDATE_SQL);
			pstmt.setString(1, d.getSex());
			pstmt.setString(2, d.getRelation());
			pstmt.setString(3, d.getMobile());
			pstmt.setString(4, d.getWechat());
			pstmt.setString(5, d.getName());
			d2 = pstmt.executeUpdate();
			
		} catch(Exception e) {
		} finally {
			DBConnection.closeDB(conn, pstmt, rs);
		}
		return d2;
	}
}
