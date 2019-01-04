package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the session, remove the attributes and invalidate it
		HttpSession s = request.getSession(false);
		PrintWriter pw = response.getWriter();
		if(s==null || s.getAttribute("useremail")==null)
			pw.write("<html><body><h1>Error</h1><b>Who are you? You got to login again...</b></body></html>");
		else
		{
			s.removeAttribute("useremail");
			s.removeAttribute("username");
			s.invalidate();
			pw.write("<html><body><h1>Success</h1><b>You have logged out successfully...<a href = 'HomePage.html'>Click to go back to Home Page</a></b></body></html>");
		}
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
