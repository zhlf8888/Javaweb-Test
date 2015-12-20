package com.bistu.javaweb.daoImpl;

import com.bistu.javaweb.domain.User;

public interface UserDAOImpl {
	public abstract User find(User u) throws Exception;
	public abstract User find_mail(String m) throws Exception;
	public abstract int updata(User u) throws Exception;
}
