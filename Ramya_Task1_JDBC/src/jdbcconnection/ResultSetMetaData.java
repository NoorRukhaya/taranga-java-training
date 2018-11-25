package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;

public class ResultSetMetaData {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	in = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_inventory_account?useSSL=false","root","root");
			System.out.println("Connected");
			PreparedStatement ps=in.prepareStatement("select * from company");  
			ResultSet rs=ps.executeQuery();  
			java.sql.ResultSetMetaData d =rs.getMetaData();
			
			System.out.println("Total columns: "+d.getColumnCount()); 
			System.out.println("Column Name of 1st column: "+d.getColumnName(1));  
			System.out.println("Column Name of 5th column: "+d.getColumnName(5));
			System.out.println("Column Type Name of 1st column: "+d.getColumnTypeName(1));  
			
			in.close();  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //register a driver
		//Create Connection
 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

