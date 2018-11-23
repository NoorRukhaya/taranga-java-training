package com.thranaga.examplestatic;

public class Examplestatic 
	{
	int roll_no;
	String name;
	static String College_Name="CIT";
	
	public static void main(String args[])
	{
	Examplestatic s1=new Examplestatic();
	s1.roll_no=100;
	s1.name="abdul";
	System.out.println(s1.roll_no);
	System.out.println(s1.name);
	System.out.println(Examplestatic.College_Name); 
	Examplestatic  s2=new  Examplestatic();
	s2.roll_no=200;
	s2.name="zabeer";
	System.out.println(s2.roll_no);
	System.out.println(s2.name);
	System.out.println(Examplestatic.College_Name); 
	}
	}