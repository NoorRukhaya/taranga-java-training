package com.tharanga.arrays;

public class StringArrayToString {
	public static void main(String[] args) {
		String[] strArr = new String[] {"1","2","3"};
		
		String str = strArr.toString();
		
		System.out.println("Java String array to String = "+str);
		str = convertStringArrayToString(strArr, ",");
		System.out.println("Convert Java String array to String = " + str);

	}

	private static String convertStringArrayToString(String[] strArr, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for (String str : strArr)
			sb.append(str).append(delimiter);
		return sb.substring(0, sb.length() - 1);
	}
}
