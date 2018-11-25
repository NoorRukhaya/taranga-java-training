package com.tharanga.datatypes;

import java.util.Scanner;

public class IntDemo1 {
	public static void main(String args[])
	{
	         //Integer to binary 4 bytes
	int n, m;
    String x = "";
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the Decimal Number:");
    n = s.nextInt();
    while(n > 0)
    {
        int a = n % 2;
        x = a + x;
        n = n / 2;
    }
    System.out.println(x);
           
    //convert Integer to string
	int a = 200;
	String c = Integer.toString(a);
	String d = String.valueOf(a);
	System.out.println(c);

	}
}
