package com.tharanga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
	/*	
	 Printing the Output of sum
		PrintWriter out = response.getWriter();
		out.println("Result: "+k);   */
	/*	
	 RequestDispatch Method
		request.setAttribute("k", k);  //sending the value to another servlet
		
		RequestDispatcher rd = request.getRequestDispatcher("sq");   //Forward both response and request
		rd.forward(request, response);     */
		
		/*
		//Send RedirectMethod URL rewriting
		response.sendRedirect("sq?k="+k); //it recieve the request from client and send request from add to square servlet  */
		
		/* //Http Session for improving SendRedirect
		HttpSession session = request.getSession();
		session.setAttribute("k", k);
		response.sendRedirect("sq");  */
		
		//Cookies
		Cookie cookie = new Cookie("k",k+"");
		response.addCookie(cookie);
		
		response.sendRedirect("sq");
		
	}

}
