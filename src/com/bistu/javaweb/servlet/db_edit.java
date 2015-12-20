package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bistu.javaweb.daoImpl.DataDAOImpl;
import com.bistu.javaweb.domain.Data;
import com.bistu.javaweb.factory.DataDAOFactory;

public class db_edit extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public db_edit() {
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

		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String relation = request.getParameter("relation");
		String mobile = request.getParameter("mobile");
		String wechat = request.getParameter("wechat");
		
		Data d = new Data();
		d.setName(name);
		d.setSex(sex);
		d.setRelation(relation);
		d.setMobile(mobile);
		d.setWechat(wechat);
		
		RequestDispatcher dis = null;
		DataDAOImpl n = DataDAOFactory.getDataDAOInstance();
		
		try {
			int m = n.update(d);
			if(m!=0) {
				request.setAttribute("error", "修改成功！");	
			} else {
				request.setAttribute("error", "修改失败！未找相关记录！");	
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		dis = request.getRequestDispatcher("main_edit.jsp");
		dis.forward(request, response);
		
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
