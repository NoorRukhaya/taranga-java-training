package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        System.out.println("in LS no-arg constr");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in LS->doGet()");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in LS->doPost()");
				
		StringBuilder sb = new StringBuilder();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		System.out.println("email = "+email+" pass = "+pass);
	
		if(email==null || email.isEmpty())
			sb.append("Email input is mandatory. You loser! <br/>");
		if(pass==null || pass.isEmpty())
			sb.append("Password is mandatory. How to allow you inside later fella! <br/>");
	
		String msg = sb.toString();
		PrintWriter pw = response.getWriter();
		
		if(!msg.equals(""))
			pw.write("<html><body><h1>Error</h1><b>"+msg+"</b></body></html>");
		else
		{
			//now do business validation...
			System.out.println("LS->doPost()=>input validation succeeded...");
		
			Connection con = null;
			PreparedStatement ps_sel=null;
			ResultSet rs = null;
			
			try
			{
				con = JDBCHelper.getConnection();
				if(con==null)
				{
					pw.write("<html><body><h1>Error</h1><b>Error establishing connection...contact Admin, if you are admin, go to temple!</b></body></html>");
					return;
				}
				else
				{
					ps_sel = con.prepareStatement("select * from reg_users where email = ? and pass = ?");
					ps_sel.setString(1, email);
					ps_sel.setString(2, pass);
					ps_sel.execute();
					rs = ps_sel.getResultSet();
					
					if(rs.next()) //means there is 1 row which means the user is valid
					{
						
						String name = rs.getString("name"); // get user name from selected result
						//create session, store user data
						//forward to MenuServlet
						HttpSession s = request.getSession(true);
						s.setAttribute("useremail", email);
						s.setAttribute("username", name);
						
						RequestDispatcher rd = request.getRequestDispatcher("/menu");
						rd.forward(request, response);
					}
					else
					{			
						pw.write("<html><body><h1>Error</h1><b>Your email/password combination is wrong. Try again. <a href = 'HomePage.html'>Click to go back to Home Page</a></b></body></html>");
					}
					
				}
				
			}
			catch(SQLException  e)
			{
				e.printStackTrace();
				pw.write("<html><body><h1>Error</h1><b>Oops something bad happened..."+e.getMessage()+"</b></body></html>");
			}
			finally
			{
				JDBCHelper.close(rs);
				JDBCHelper.close(ps_sel);
				JDBCHelper.close(con);
				
			}
		}
	}

}
