package com.bistu.javaweb.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bistu.javaweb.daoImpl.DataDAOImpl;
import com.bistu.javaweb.domain.Data;
import com.bistu.javaweb.factory.DataDAOFactory;

public class db_edit extends HttpServlet {
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
}
