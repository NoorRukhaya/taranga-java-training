package com.tharanga.servletrequest;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

public class ServletRequestDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        
		String name=request.getParameter("name");//will return value  
		out.println("Welcome "+name);  
		  
		out.close();  
		

}
}
