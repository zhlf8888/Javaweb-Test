package com.bistu.javaweb.daoImpl;

import java.util.List;
import java.sql.*;

import com.bistu.javaweb.domain.Data;

public interface DataDAOImpl {
/*
	public abstract Data creat(Data d) throws Exception;
	public abstract int remove(Data d) throws Exception;
	public abstract Data find(String d) throws Exception;
	public abstract ResultSet findAll() throws Exception;
	public abstract int update(Data d) throws Exception;
}
*/
public abstract Data creat(Data d) throws Exception;
public abstract int remove(Data d) throws Exception;
public abstract Data find(String d) throws Exception;
public abstract List<Data> findAll() throws Exception;
public abstract int update(Data d) throws Exception;
}
