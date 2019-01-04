package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        System.out.println("in no-arg constr of RS");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet() of RS");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost() of RS");
		/*
		 * 1. access user inputs
		 * 2. input validate
		 * 3. business validate
		 * 4. business logic (store into db)
		 * 5. respond with proper msg to client
		 */
		
		StringBuilder sb = new StringBuilder();
		
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String rpass = request.getParameter("rpass");
		
		System.out.println("name = "+name+" email = "+email+" pass = "+pass+" rpass = "+rpass);
	
		if(name==null || name.isEmpty())
			sb.append("Your parents did not name you or what? <br/>");
		if(email==null || email.isEmpty())
			sb.append("Email input is mandatory. You loser! <br/>");
		if(pass==null || pass.isEmpty())
			sb.append("Password is mandatory. How to allow you inside later fella! <br/>");
		if(rpass==null || rpass.isEmpty())
			sb.append("Repeat Password is mandatory!<br/>");
		else
			if(!rpass.equals(pass))
				sb.append("If you cannot even type your own pass and repeat pass, what will you do in life? <br/>");
		
		String msg = sb.toString();
		PrintWriter pw = response.getWriter();
		
		if(!msg.equals(""))
			pw.write("<html><body><h1>Error</h1><b>"+msg+"</b></body></html>");
		else
		{
			//now do business validation...
			System.out.println("RS->doPost()=>input validation succeeded...");
		
			Connection con = null;
			PreparedStatement ps_ins = null,ps_sel=null;
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
					ps_sel = con.prepareStatement("select * from reg_users where email = ?");
					ps_sel.setString(1, email);
					ps_sel.execute();
					rs = ps_sel.getResultSet();
					
					if(rs.next())
					{
						pw.write("<html><body><h1>Error</h1><b>Your email id is already taken...you duplicate!</b></body></html>");
						return;
					}
					else
					{
						ps_ins = con.prepareStatement("insert into reg_users(name,email,pass) values(?,?,?)");
						ps_ins.setString(1, name);
						ps_ins.setString(2,email);
						ps_ins.setString(3,pass);
						ps_ins.execute();
						
						pw.write("<html><body><h1>Success</h1><b>Yippie, hoorray...your registration succeeded...<a href = 'HomePage.html'>Click to go back to Home Page</a></b></body></html>");
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
				JDBCHelper.close(ps_ins);
				JDBCHelper.close(ps_sel);
				JDBCHelper.close(con);
				
			}
		}
		
	
	}

}





