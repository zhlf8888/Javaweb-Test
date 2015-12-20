package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bistu.javaweb.bean.DBUtil;
import com.bistu.javaweb.dao.UserDAO;

import java.security.MessageDigest;
import com.bistu.javaweb.mail.*;

public class db_register extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public db_register() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("userName");
		String passwordold = request.getParameter("userPwd");
		String password2 = request.getParameter("userPwd2");
		String mail = request.getParameter("userMail");
		

		
		
		if(passwordold.equals(password2)) {
			
			try {
				String password = (String)UserDAO.md5(passwordold);
				String sql1 = "Insert into user(name,password,mail)";
				String sql2 = "values('"+name+"','"+password+"','"+mail+"')";
				String sql = sql1 + sql2;
			
				DBUtil run = new DBUtil();
				int n = run.updateSQL(sql);
			
				if(name!="" && name!=null && n>=1) {
					Mail_isMail ism = new Mail_isMail();
					boolean ismrs = ism.isMail(mail);
					if(ismrs) {
						request.getRequestDispatcher("register_success.jsp").forward(request, response);
					} else {
						request.setAttribute("error", "请输入正确的邮箱！");
						request.getRequestDispatcher("register.jsp").forward(request, response);
					}
				} else {
					request.setAttribute("error", "非法注册！");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		} else {
			request.setAttribute("error", "请检查您的密码！");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} 
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
