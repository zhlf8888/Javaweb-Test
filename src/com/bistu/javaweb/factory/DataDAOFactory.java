package com.bistu.javaweb.factory;

import com.bistu.javaweb.dao.DataDAO;


public class DataDAOFactory {
	public static DataDAO getDataDAOInstance() {
		return new DataDAO();
	}
}
