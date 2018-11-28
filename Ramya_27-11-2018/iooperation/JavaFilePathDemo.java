package com.tharanga.iooperation;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaFilePathDemo {
	
	public static void main(String args[]) 
	{ 
		System.out.println("Path of the given file :"); 
		
		File child = new File("C:\\Users\\prema\\Desktop\\Tharanga tech\\Tharanga Accounts.xlsx"); 
		displayPath(child); 
		File parent = child.getParentFile(); 
		System.out.println("Path of the parent file :"); 
		displayPath(parent); 
	} 
	public static void displayPath(File testFile) 
	{ 
		System.out.println("path : " + testFile.getPath()); 
		System.out.println("absolute path : " + testFile.getAbsolutePath()); 
		
		try { 
			System.out.println("canonical path : " + testFile.getCanonicalPath()); 
			
		} catch (Exception e) { e.printStackTrace();
		
	} }

	

}
