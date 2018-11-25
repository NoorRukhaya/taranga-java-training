package com.tharanga.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("db.properties");  
	      
	/*    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  */
	    
	    Properties p=new Properties();  
	    p.setProperty("name","Sonoo Jaiswal");  
	    p.setProperty("email","sonoojaiswal@javatpoint.com");  
	      
	    p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
	}  
}
