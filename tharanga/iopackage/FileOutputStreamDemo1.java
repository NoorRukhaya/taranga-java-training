package com.tharanga.iopackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {

	public static void main(String[] args) {

		try {
		//	FileOutputStream fout = new FileOutputStream("D:\\Welcome.txt");  //it stores in text format
		//	FileOutputStream fout = new FileOutputStream("D:\\Documents.docs"); //it stores in msword
			FileOutputStream fout = new FileOutputStream("D:\\list.xlsx"); //it stores in Excel
			fout.write(600);
			String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array  
            fout.write(b);
			fout.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
