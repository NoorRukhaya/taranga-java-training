package com.tharanga.datatypes;

import java.util.Scanner;

public class BooleanDemo1 {
	 
	public static void main(String[] args) {
	
		//	In Boolean only two possible values: true and false
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a and b is: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		boolean c=(a>b)?true:false;
		{
			System.out.println("a is greterthan b "+c);
		}
		
	}

}

