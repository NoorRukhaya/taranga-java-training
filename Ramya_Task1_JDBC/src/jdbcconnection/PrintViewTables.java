package jdbcconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintViewTables {

	public static void main(String[] args) throws ClassNotFoundException {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","root"); 
			System.out.println("MySql Connected");
			
			DatabaseMetaData dbmd = con.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, "%", types);  //Get All The Tables in Database
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
              //  System.out.println(rs.getString(3));
            }
        } 
            catch (SQLException e) {
            e.printStackTrace();
        }

	}

}
