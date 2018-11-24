package jdbcconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbmdDemo {
	
	public static void main(String args[])
	{  
	  
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/smart_inventory_account?useSSL=false","root","root");  
		System.out.println("connected");
		DatabaseMetaData dbmd=con.getMetaData();  
		
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} 
catch (SQLException e) {
		
		e.printStackTrace();
	}

}
}
