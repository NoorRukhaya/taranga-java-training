package jdbcconnection;
import java.sql.*;

public class ResultSetScrolableDemo {

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo?useSSL=false", "root", "root");
		System.out.println("Connected");
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from emp");
		rs.absolute(3); //Fetch 3rd row in database
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		  
		con.close();  
		
	}

}
