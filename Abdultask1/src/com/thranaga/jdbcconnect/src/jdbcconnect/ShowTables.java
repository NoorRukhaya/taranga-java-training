package jdbcconnect;
import java.sql.*;
public class ShowTables {
public static void main(String args[]) {
	try
	{
		Class.forName("org.h2.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/thranaga","root","root");
		
		Statement statement=conn.createStatement();
		
		ResultSet resultset=statement.executeQuery("select * from Employee");
		
		while(resultset.next())
		{
			System.out.print(resultset.getInt(1)+"       ");
			System.out.print(resultset.getString(2)+"       ");
			System.out.print(resultset.getString(3)+"       ");
			System.out.println(resultset.getInt(4));
		}
		
		statement.close();
		conn.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised:"+e);
	}
	
}
}