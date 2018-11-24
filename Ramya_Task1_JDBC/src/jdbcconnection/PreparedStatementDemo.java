package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo {
	
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?useSSL=false", "root", "root");
		System.out.println("connected");
		
		PreparedStatement stmt=con.prepareStatement("insert into emp1 values(?,?)");  
		stmt.setString(1,"Ramya"); 
		stmt.setInt(2,105);//1 specifies the first parameter in the query  
		stmt.execute();  
		
		PreparedStatement st=con.prepareStatement("update emp1 set name=? where id=?");
		stmt.setString(1,"Bhanu"); 
		stmt.setInt(2,105);//1 specifies the first parameter in the query  
		stmt.execute();   
		
		
		PreparedStatement st1=con.prepareStatement("delete from emp1 where id=?");
		stmt.setInt(1,202);  
		int i=stmt.executeUpdate();
		System.out.println(i+" records inserted");  
		 
		//retrieve statement
		PreparedStatement stmt1=con.prepareStatement("select * from emp1");  
		ResultSet rs=stmt1.executeQuery();  
		while(rs.next()){  
		System.out.println(rs.getString(1)+" "+rs.getInt(2));  
		}  
		con.close();    

	}

}
