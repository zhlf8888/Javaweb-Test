package com.bistu.javaweb.factory;

import com.bistu.javaweb.dao.UserDAO;

public class UserDAOFactory {
	public static UserDAO getUserDAOInstance() {
		return new UserDAO();
	}
}
