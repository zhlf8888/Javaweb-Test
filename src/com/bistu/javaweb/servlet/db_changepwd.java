package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bistu.javaweb.dao.UserDAO;
import com.bistu.javaweb.daoImpl.UserDAOImpl;
import com.bistu.javaweb.domain.User;
import com.bistu.javaweb.factory.UserDAOFactory;

public class db_changepwd extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String old = request.getParameter("old");
		String password = request.getParameter("userPwd");
		String password2 = request.getParameter("userPwd2");
		
		System.out.print(old);
		System.out.print(name);
		RequestDispatcher dis = null;

		if(password.equals(password2)) {
			
			
			User u = new User();
			u.setName(name);
			u.setPassword(old);

			try {
				UserDAOImpl n = UserDAOFactory.getUserDAOInstance();
				User m = n.find(u);
				if(m.getPassword().equals(old)) {
					System.out.print("Hello");
					String passwordmd5 = (String)UserDAO.md5(password);
					m.setPassword(passwordmd5);
					int rs = n.updata(m);
					System.out.print(m.getPassword());
					if(rs!=0) {
						request.getRequestDispatcher("lost_changed.jsp").forward(request, response);	
					} else {
						request.getRequestDispatcher("index.jsp").forward(request, response);	
					}
				} else {
					request.getRequestDispatcher("index.jsp").forward(request, response);	
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			request.setAttribute("error", "Çë¼ì²éÄúµÄÃÜÂë£¡");
			request.getRequestDispatcher("lost_change.jsp").forward(request, response);
		} 
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
}
