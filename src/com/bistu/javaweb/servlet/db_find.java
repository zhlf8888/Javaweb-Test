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

public class db_find extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		
		RequestDispatcher dis = null;
		DataDAOImpl n = DataDAOFactory.getDataDAOInstance();
		System.out.print("hello");
		
		try {
			Data d= n.find(name);
			request.setAttribute("rs", d);
			if(d.getName().equals(name)) {
				request.setAttribute("error", "�ҵ�һ����¼��");
			} else {
				request.setAttribute("error", "δ�ҵ���¼��");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		dis = request.getRequestDispatcher("main_find.jsp");
		dis.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
}
