package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

import com.bistu.javaweb.bean.*;
import com.bistu.javaweb.dao.UserDAO;
import com.bistu.javaweb.daoImpl.UserDAOImpl;
import com.bistu.javaweb.domain.Data;
import com.bistu.javaweb.domain.User;
import com.bistu.javaweb.factory.UserDAOFactory;



public class db_verify extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String userPwdold = request.getParameter("userPwd");
		try {
			String userPwd = (String)UserDAO.md5(userPwdold);

		
		RequestDispatcher dis = null;
		User u = new User();
		u.setName(userName);
		u.setPassword(userPwd);

		UserDAOImpl n = UserDAOFactory.getUserDAOInstance();
		User m = null;

			m = n.find(u);

		
		if(userName!="" && userName!=null && userPwd!="" & userPwd!=null) {
			if(userName.equals(m.getName())&&userPwd.equals(m.getPassword())) {
				dis = request.getRequestDispatcher("login_success.jsp");
				} else {
					request.setAttribute("error", "用户名或密码错误！");
					dis = request.getRequestDispatcher("index.jsp");
				}
		} else {
			request.setAttribute("error", "非法登录！");
			dis = request.getRequestDispatcher("index.jsp");
		}
		
		dis.forward(request, response); 
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}


/*		try{

if(userName == null || "".equals(userName)) {
	request.setAttribute("error", "请输入用户名");
	dis = request.getRequestDispatcher("/index.jsp");
} else {
	if(userPwd == null || "".equals(userPwd)) {
		request.setAttribute("error", "请输入系统口令！");
		dis = request.getRequestDispatcher("/index.jsp");
	} else {
		UserDAOImpl n = UserDAOFactory.getUserDAOInstance();
		try {
			User m = n.find(userName);
		
		if(userName == null) {
			request.setAttribute("error", "不存在这个用户");
			dis = request.getRequestDispatcher("/index.jsp");
		} else {
			if(userPwd.equals(m.getPassword())) {
				request.getSession().setAttribute("user", m);
				response.sendRedirect("/main.jsp");
			} else {
				request.setAttribute("error", "密码错误");
				dis = request.getRequestDispatcher("/index.jsp");
			}
		}
		dis.forward(request, response);
	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
*/

/*
try {
	if(v.verify(v.getUserName(), v.getUserPwd()))
		dis = request.getRequestDispatcher("main_insert.jsp");
	else
		dis = request.getRequestDispatcher("login_error.jsp");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
dis.forward(request, response);
}
*/