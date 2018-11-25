package jdbcconnection;

import java.io.*;  
import java.sql.*;  

public class StoreFileInDataBase {
	 
	public static void main(String[] args) {  
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?useSSL=false","root","root");
	              
	PreparedStatement ps=con.prepareStatement("insert into filetable values(?,?)");  
	              
	File f=new File("d:\\abc.txt");  
	FileReader fr=new FileReader(f);  
	              
	ps.setInt(1,500);  
	ps.setCharacterStream(2,fr,(int)f.length());  
	int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  
	              
	con.close();  
	              
	}catch (Exception e) {e.printStackTrace();}  
	}  
	}  





