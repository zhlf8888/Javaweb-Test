package com.bistu.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bistu.javaweb.daoImpl.UserDAOImpl;
import com.bistu.javaweb.domain.User;
import com.bistu.javaweb.factory.UserDAOFactory;
import com.bistu.javaweb.mail.*;

public class main_mail extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public main_mail() {
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
		RequestDispatcher dis = null;
		
//		Mail_isMail ism = new Mail_isMail();
//		boolean ismrs = ism.isMail(mail);
		
//		if(ismrs) {
			
		UserDAOImpl n = UserDAOFactory.getUserDAOInstance();
		try {
//			User m = n.find_mail(mail);
			User m = new User();
			m.setName(name);
			User mm = n.find(m);
			
			System.out.print(m.getName()+mm.getName());
			
			if(mm.getName() != "" && mm.getName() != null && mm.getPassword() != "" && mm.getPassword() != null && mm.getMail() != "" && mm.getMail() != null) {
					
//				Mail mmm = new Mail();
//				mmm.setRqname(name);
				Mail_Test mt = new Mail_Test();
				boolean ms = mt.test(mm.getMail(),mm.getName(),mm.getPassword());

				System.out.print(mm.getMail());
				System.out.print(mm.getName());
				System.out.print(mm.getPassword());
				
				if(ms) {		
					Mail_Abb  abb = new Mail_Abb();
					String abbrs = Mail_Abb.getAbb(mm.getMail());
					request.setAttribute("error", "发送成功！");
					request.setAttribute("mailabb", abbrs);
					request.setAttribute("mailuser", mm.getName());
					dis = request.getRequestDispatcher("lost_success.jsp");
						
				} else {
						
					request.setAttribute("error", "发送失败！");
					dis = request.getRequestDispatcher("lost.jsp");
				}
			} else {
				request.setAttribute("error", "没有此用户的信息！");
				dis = request.getRequestDispatcher("lost.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
/*		} else {
			
			request.setAttribute("error", "请填写正确的邮箱！");
			dis = request.getRequestDispatcher("lost.jsp");
		}
*/
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
