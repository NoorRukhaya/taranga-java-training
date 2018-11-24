package jdbcconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseMetaData {
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	in = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?useSSL=false","root","root");
			System.out.println("Connected");
	/*		
			DatabaseMetaData dbmd=in.getMetaData();  
			String table[]={"TABLE"};  
			ResultSet rs=dbmd.getTables(null,null,null,table);  
			  
			while(rs.next()){  
			System.out.println(rs.getString(3));  
			}    */
			
			DatabaseMetaData dbmd=in.getMetaData();  
			String table[]={"VIEW"};  
			ResultSet rs=dbmd.getTables(null,null,null,table);  
			  
			while(rs.next()){  
			System.out.println(rs.getString(3));  
			}  
			
			in.close();  
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
 catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}
}
