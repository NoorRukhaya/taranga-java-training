package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable_Query {
	public static void main(String[] args) {

		try {

			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/task", "root", "root");
			System.out.println("MySql Connected");

			System.out.println("Creating table in given database...");
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE REGISTRACTION " + "(id INTEGER not NULL," + "first VARCHAR(255),"
					+ "last VARCHAR(255)," + "age INTEGER," + "PRIMARY KEY(id))";
			stmt.executeUpdate(sql);
			System.out.println("Registraction Table is created");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}