package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
static Connection in=null;
	
	public Connection connect()
	{
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); //register a driver
		
		//Create Connection
		in = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo?useSSL=false","root","root");
		System.out.println(" JDBC Connected");
		
		Statement st = in.createStatement(); //creating statement
		ResultSet rs = st.executeQuery("select * from emp"); //execute query
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		in.close(); //close connection
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return in;
	}
	
	public static void main(String[] args) throws SQLException 
	{
		Connection in = null;
		JDBCDemo1 jdbc = new JDBCDemo1();
		in = jdbc.connect();
		

	}


}
