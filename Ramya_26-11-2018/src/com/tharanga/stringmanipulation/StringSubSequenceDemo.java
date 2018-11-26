package com.tharanga.stringmanipulation;

public class StringSubSequenceDemo {
	
	public static void main(String[] args) {
		String str = "www.tharangatechnlogies.com";
		System.out.println("Last 4 char String: " + str.subSequence(str.length() - 4, str.length()));
		System.out.println("First 4 char String: " + str.subSequence(0, 4));
		System.out.println("website name: " + str.subSequence(4, 22));
		// substring vs subSequence
		//There is no benefit in using subSequence method, ideally you should always use String substring method.
		System.out.println("substring == subSequence ? " + (str.substring(4, 22) == str.subSequence(4, 22)));
		System.out.println("substring equals subSequence ? " + (str.substring(4, 14).equals(str.subSequence(4, 14))));
	}

}
