package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CURDDemo {
	
	public static void main(String[] args) {  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","root"); 
			System.out.println("MySql Connected");
				
			// Creating Database
			System.out.println("Creating database...");
		     Statement stmt = con.createStatement();
		     String sql = "CREATE DATABASE STUDENT";
		     stmt.executeUpdate(sql);
		      System.out.println("Database created successfully...");   
			
		     	//Delete DataBase
			Statement stmt1 = con.createStatement();
			String sql1 = "DROP DATABASE STUDENT";
		      stmt1.executeUpdate(sql);
		      System.out.println("Database deleted successfully...");  
			
		}catch (Exception e) {e.printStackTrace();  }  
	}  
}
