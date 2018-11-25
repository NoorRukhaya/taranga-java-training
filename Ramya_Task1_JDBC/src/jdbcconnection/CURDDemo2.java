package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CURDDemo2 {
	 
	public static void main(String[] args) {  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","root"); 
			System.out.println("MySql Connected");
			
		/*	// Creating Registraction Table
			System.out.println("Creating table in given database...");
		      Statement stmt = con.createStatement();
		      String sql = "CREATE TABLE REGISTRACTION " + "(id INTEGER not NULL,"+
		      "first VARCHAR(255)," + "last VARCHAR(255)," + "age INTEGER," + "PRIMARY KEY(id))";
		      stmt.executeUpdate(sql);
		      System.out.println("Registraction Table is created");  
		      
			
			// Inserting records to the Table
			System.out.println("Inserting records into the table...");
			Statement stmt = con.createStatement();
		      
		      String sql = "INSERT INTO Registration " +
		                   "VALUES (100, 'Ramya', 'G R', 18)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES (101, 'Chaitra', 'G R', 25)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES (102, 'Akash', 'G S', 30)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES(103, 'Suhas', 'S P', 28)";
		      stmt.executeUpdate(sql);
		      System.out.println("Inserted records into the table...");  
			
			 	//Read the Records in the Table
			String sql = "SELECT id, first, last, age FROM Registration";
			Statement stmt = con.createStatement();
		      ResultSet rs = stmt.executeQuery(sql);
		         //STEP 5: Extract data from result set
		      while(rs.next()){
		        //Retrieve by column name
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String first = rs.getString("first");
		         String last = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last); 
		          }
		      rs.close(); 
		      
		      Statement st = con.createStatement(); //creating statement
		  		ResultSet rs = st.executeQuery("select * from registration"); //execute query
		  		
		  		while(rs.next())
		  		{
		  			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		  		}
		  		con.close(); //close connection    
		      
		      
		      // Updating the Records
		      System.out.println("Creating statement...");
            Statement stmt = con.createStatement();
               String sql = "UPDATE Registration " +
                   "SET age = 30 WHERE id in (100, 101)";
                 stmt.executeUpdate(sql);   */
                 
                 //for Deleting records
                 String sql = "DELETE FROM Registration " +
                         "WHERE id = 101";
                 Statement stmt = con.createStatement();
                      stmt.executeUpdate(sql);
                                                 
         	 /* 
		  	//Deleting Registraction Table
			      System.out.println("Deleting table in given database...");
			      Statement stmt = con.createStatement();
			      String sql = "DROP TABLE REGISTRATION ";
			      stmt.executeUpdate(sql);
			      System.out.println("Table  deleted in given database...");  */
		     
			
		}catch (Exception e) {e.printStackTrace();  }  
	} 
	
	}

