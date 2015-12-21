package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

import com.bistu.javaweb.bean.ServletUtils;

public class main_dl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String filepath = "d:/";
		String filename = "Data.txt";
		String guessCharset = "gbk";
		try {
			String isofilename = new String(filename.getBytes(guessCharset),"iso-8859-1");
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Dispositon", "attachment);filename="+isofilename);
			ServletOutputStream out = null;
			out = response.getOutputStream();
			ServletUtils s = new ServletUtils();
			s.returnFile(filepath+filename, out);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
}
