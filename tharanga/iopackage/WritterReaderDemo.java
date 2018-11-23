package com.tharanga.iopackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WritterReaderDemo {
	public static void main(String args[])
	{
	 try { 
		 
		 Writer w = new FileWriter("D:\\output.txt");
		 String content = "I Love My Country India";
		 w.write(content);
		 w.close();
		 System.out.println("Done");
		 
	      } catch (IOException e) {  
         e.printStackTrace(); 
	 }
	 
	 try {  
         Reader reader = new FileReader("D:\\output.txt");  
         int data = reader.read();  
         while (data != -1) {  
             System.out.print((char) data);  
             data = reader.read();  
         }  
         reader.close();  
     } catch (Exception ex) {  
         System.out.println(ex.getMessage());  
     }  

}
}