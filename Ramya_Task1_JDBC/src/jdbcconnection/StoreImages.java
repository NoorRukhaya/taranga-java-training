package jdbcconnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;


public class StoreImages {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?useSSL=false","root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
			ps.setString(1,"Ramya");  
			  
			FileInputStream fin=new FileInputStream("E:\\1.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" Photos Stored");  
			          
			con.close();  
		
		}catch (Exception e) {e.printStackTrace();}
		
			
		}

		}


