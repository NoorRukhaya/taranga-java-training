package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static void main(String args[]) {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/task", "root",
					"root");
			System.out.println("MySql Connected");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
