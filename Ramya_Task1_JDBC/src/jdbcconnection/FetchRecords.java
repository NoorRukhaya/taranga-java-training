package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecords {
	static Connection in=null;
	public static void main(String args[])throws Exception{
     Class.forName("com.mysql.cj.jdbc.Driver"); //register a driver
		
		//Create Connection
		in = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo?useSSL=false","root","root");
		System.out.println(" JDBC Connected");
		
		Statement st = in.createStatement(); //creating statement
		int result=st.executeUpdate("delete from emp where id=33");  
		System.out.println(result+" records affected");  
		in.close();  
		  
}
}
