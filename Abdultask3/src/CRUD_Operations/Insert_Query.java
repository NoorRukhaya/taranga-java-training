package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Query {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/task", "root", "root");
			System.out.println("MySql Connected");

			// Inserting records to the Table
			System.out.println("Inserting records into the table...");
			Statement stmt = con.createStatement();

			String sql = "INSERT INTO  REGISTRACTION " + "VALUES (001, 'Abdul', 'Zabeer H', 22)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO  REGISTRACTION " + "VALUES (002, 'Salman', ' Khan', 49)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO  REGISTRACTION " + "VALUES (003, 'Akshay', 'kumar', 45)";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
