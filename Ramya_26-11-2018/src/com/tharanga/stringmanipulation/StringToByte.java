package com.tharanga.stringmanipulation;

import java.util.Arrays;

public class StringToByte {
	
	public static void main(String args[])
	{
	String str = "RAMYA";
	byte[] byteArr = str.getBytes();
	// print the byte[] elements
	System.out.println("String to byte array: " + Arrays.toString(byteArr));
	
	 byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 , 65, 69, 72};
	 String str1 = new String(byteArray1);
	 System.out.println("Byte Array to String: "+str1);
}
}
