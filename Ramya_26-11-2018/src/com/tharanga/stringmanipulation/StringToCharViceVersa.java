package com.tharanga.stringmanipulation;

import java.util.Arrays;

public class StringToCharViceVersa {

	public static void main(String[] args) {
		
		String str = "RamyaChaitra";
		
		char[] charArr = str.toCharArray();
		// print the char[] elements
		System.out.println("String converted to char array: " 
							+ Arrays.toString(charArr));
		
		
		
       char[] charArray = {'P','A','N','K','A','J'};
		
		String str1 = new String(charArray);
		
		System.out.println("Char Array to String: "+str1);
	}
		
	}

