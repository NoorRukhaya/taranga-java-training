package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Query {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/task", "root", "root");
			System.out.println("MySql Connected");
			System.out.println("delete statement...");
			String sql = "DELETE FROM REGISTRACTION " + "WHERE id = 002";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}