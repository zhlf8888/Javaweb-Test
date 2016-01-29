package com.bistu.javaweb.servlet;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class filter extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession s = req.getSession();
		String path = req.getRequestURI();
		if(req.getRequestURI().indexOf("css") != -1 || req.getRequestURI().indexOf("fonts") != -1) {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			chain.doFilter(request, response);
			return;
		}
		if(s.getAttribute("userName") != null) {
			chain.doFilter(request, response);
		} else {
			req.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
}
