package com.tharanga.iopackage;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
	public static void main(String args[])
	{
	
		try
		{
			FileInputStream fin  = new FileInputStream("D:\\Welcome.txt");
			int j = fin.read();
			System.out.print((char)j);  //read only one char
			
			 int i=0;    
	            while((i=fin.read())!=-1){    //read all the characters
	             System.out.print((char)i);    
	            }    
			fin.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}
