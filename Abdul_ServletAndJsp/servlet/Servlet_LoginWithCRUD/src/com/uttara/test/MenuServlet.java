package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MenuServlet
 */
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
        super();
        System.out.println("in MS->no arg constr");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in MS->doGet()");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in MS->doPost()");
		/*
		 * 1. get the session. if it doesnt exist, show error
		 * 2. get data from session.
		 * 3. output to response.
		 */
		PrintWriter pw = response.getWriter();
		HttpSession s = request.getSession(false);
		if(s==null || s.getAttribute("useremail")==null)
		{
			//user has not logged in...
			pw.write("<html><body><h1>Error</h1><b>Your session is invalid. Who are you? Login again. <a href = 'HomePage.html'>Click to go back to Home Page</a></b></body></html>");
		}
		else
		{
			String email = (String) s.getAttribute("useremail");
			String name = (String) s.getAttribute("username");
			
			pw.write("<html><body><h1>Menu</h1><h3>Welcome "+name+"</h3><a href = 'getDetails'>Click to edit account</a><br/><a href = 'logout'>Click to logout</a></body></html>");
		}
	}

}
