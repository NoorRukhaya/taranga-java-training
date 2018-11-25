package com.tharanga.iopackage;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStreamDemo {
	
	// ByteArrayInputStream
	
/*	public static void main(String[] args) throws IOException {  
	    byte[] buf = { 35, 36, 37, 38 };  
	    // Create the new byte array input stream  
	    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
	    int k = 0;  
	    while ((k = byt.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }  
	  }   */
	
	// ByteArrayOutputStream
	
		public static void main(String[] args) throws IOException {  
			FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	    }  
		}

