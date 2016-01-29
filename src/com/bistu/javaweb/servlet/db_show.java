package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bistu.javaweb.daoImpl.DataDAOImpl;
import com.bistu.javaweb.domain.Data;
import com.bistu.javaweb.factory.DataDAOFactory;

public class db_show extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		request.setCharacterEncoding("UTF-8");
		
		
		RequestDispatcher dis = null;
		DataDAOImpl n = DataDAOFactory.getDataDAOInstance();
		
		try {
			ResultSet m = n.findAll();
//			request.setAttribute("list", m);
			
			
//			m.beforeFirst();
			while(m.next()){
				System.out.print(m.getString(1));
				System.out.print(m.getString(2));
				System.out.print(m.getString(3));
				System.out.print(m.getString(4));
				System.out.print(m.getString(5));
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		dis = request.getRequestDispatcher("main_show.jsp");
		System.out.print("hello");
		dis.forward(request, response);
		*/
		
		
		request.setCharacterEncoding("UTF-8");
		
		
		RequestDispatcher dis = null;
		DataDAOImpl n = DataDAOFactory.getDataDAOInstance();
		
		try {
			List<Data> m = n.findAll();
			request.setAttribute("list", m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		dis = request.getRequestDispatcher("main_show.jsp");
		dis.forward(request, response);	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
}
