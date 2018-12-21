package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String sql = "select * from login where uname=? and pass=?";
	public boolean check(String uname, String pass)
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo?useSSL=false", "root", "root");
		
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, "uname");
		ps.setString(2, "pass");
		
		ResultSet rs= ps.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
				
		}catch(Exception e) {
			System.out.println("Error");
		}
		return false;
	}
}
