package com.tharanga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher
	/*	int k = (int) request.getAttribute("k"); //Fetching k value from addservlet to squareservlet   */
		
	/*	//Send Redirect
		int k = Integer.parseInt(request.getParameter("k"));  */
		
	/*	//HttpSession 
		HttpSession session = request.getSession();
		int k = (int)session.getAttribute("k");
		k = k*k;   */
		
		
		//Cookies
		int k=0;
		Cookie cookies[] = request.getCookies();
		for(Cookie c: cookies) 
		{
			if(c.getName().equals("k"))
				k= Integer.parseInt( c.getValue());
		}
		k = k*k;
		PrintWriter ps = response.getWriter();
		ps.println("Square of the Number: "+k);
	}

}
