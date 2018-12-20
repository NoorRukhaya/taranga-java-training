package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_Query {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/task", "root", "root");
			System.out.println("MySql Connected");
			System.out.println("Update statement...");
            Statement stmt = con.createStatement();
               String sql = "UPDATE REGISTRACTION " +
                   "SET age = 23 WHERE id in (001, 22)";
                 stmt.executeUpdate(sql);   
}
		catch (Exception e) {
			System.out.println(e);
		}
}
}