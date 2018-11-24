package jdbcconnection;

import java.sql.*;  
import java.io.*;  
public class RetrievingImage {
	
public static void main(String[] args) {  
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?useSSL=false","root","root");
	PreparedStatement ps=con.prepareStatement("select * from imgtable");  
	ResultSet rs=ps.executeQuery();  
	if(rs.next()){//now on 1st row  
	              
	Blob b=rs.getBlob(2);//2 means 2nd column data  
	byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
	              
	FileOutputStream fout=new FileOutputStream("d:\\Ramya.jpg");  
	fout.write(barr);  
	              
	fout.close();  
	}//end of if  
	System.out.println("Ramya.jpg image is created in D folder");  
	              
	con.close();  
	}catch (Exception e) {e.printStackTrace();  }  
	}  
	}  



	
