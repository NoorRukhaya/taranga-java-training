package com.tharanga.iopackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class BufferedInputOutputDemo {

	// public static void main(String[] args) {
		
		//BufferedOutputStream
/*		try
		{
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String s="Welcome to javaTpoint.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");
		}catch(Exception e)
		{
		System.out.println(e);
		}   
		
		 //BufferedInputStream
		 try{    
			    FileInputStream fin=new FileInputStream("D:\\testout.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}    
			    
		//SequenceInputStream
		try{    
			  
		FileInputStream input1=new FileInputStream("D:\\testin.txt");    
		   FileInputStream input2=new FileInputStream("D:\\testout.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close(); 
		}catch(Exception e){System.out.println(e);}    
		
		//Creating Four txt files
		try{ 
		FileOutputStream fout1 = new FileOutputStream("D:\\a.txt");
		FileOutputStream fout2 = new FileOutputStream("D:\\b.txt");
		FileOutputStream fout3 = new FileOutputStream("D:\\c.txt");
		FileOutputStream fout4 = new FileOutputStream("D:\\d.txt");
		
		/*
		String s1="Welcome to java";  
		String s2="Welcome to Jsp";
		String s3="Welcome to Servlet";
		String s4="Welcome to JFrame";
		
        byte b1[]=s1.getBytes();//converting string into byte array 
        byte b2[]=s2.getBytes();
        byte b3[]=s3.getBytes();
        byte b4[]=s4.getBytes();
        
        fout1.write(b1);
        fout2.write(b2);
        fout3.write(b3);
        fout4.write(b4);
         
        fout1.close();
        fout2.close();
		fout3.close();
		fout4.close();  */
		
		// reads data using enumeration
		
	public static void main(String[] args)throws IOException{ 
		
			FileInputStream fin1 = new FileInputStream("D:\\a.txt");
			FileInputStream fin2 = new FileInputStream("D:\\b.txt");
			FileInputStream fin3 = new FileInputStream("D:\\c.txt");
			FileInputStream fin4 = new FileInputStream("D:\\d.txt");
			
		
			//creating Vector object to all the stream    
			Vector v=new Vector();    
			v.add(fin1);    
			v.add(fin2);    
			v.add(fin3);    
			v.add(fin4);              
			//creating enumeration object by calling the elements method    
			Enumeration e=v.elements();      
			//passing the enumeration object in the constructor    
			SequenceInputStream bin=new SequenceInputStream(e);    
			int i=0;      
			while((i=bin.read())!=-1){    
			System.out.print((char)i);    
			}     
			bin.close();    
			fin1.close();    
			fin2.close();    
			   
		  
		
      }
		
	}



