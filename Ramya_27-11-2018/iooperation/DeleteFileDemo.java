package com.tharanga.iooperation;

import java.io.File;
import java.io.IOException;

public class DeleteFileDemo {
	public static void main(String args[])
	{
	 try {  
         File file = new File("D://Tempervary.txt");  
         if (file.createNewFile()) {  
             System.out.println("New File is created!");  
         } else {  
             System.out.println("File already exists.");  
         }  
         
         if(file.delete())
         {
        	 System.out.println("Files Deleted");
         }
         else 
        	 System.out.println("File Tempervary.txt doesn't exists in project root directory");
     } catch (IOException e) {  
         e.printStackTrace();  
     }  

}}
