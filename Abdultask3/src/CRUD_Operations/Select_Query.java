package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Query {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/task", "root", "root");
			System.out.println("MySql Connected");
			System.out.println("select statement...");
			 Statement st = con.createStatement(); //creating statement
		  		ResultSet rs = st.executeQuery("select * from REGISTRACTION"); //execute query
		  		
		  		while(rs.next())
		  		{
		  			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		  		}
		  		con.close(); 
		} catch (Exception e) {

		}
	}
}