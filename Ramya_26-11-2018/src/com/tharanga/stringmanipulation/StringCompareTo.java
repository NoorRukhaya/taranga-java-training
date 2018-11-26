package com.tharanga.stringmanipulation;

public class StringCompareTo {
	
	/* when “ABC” is compared to “DEF”, the character at first index is compared. 
	 * Since they are different and ‘A’ comes before ‘D’ lexicographically, 
	 * it returns a negative integer with the difference between them, hence output is -3.
	 */
	
	public static void main(String[] args) {
        String str = "ABC";
        System.out.println(str.compareTo("DEF"));
        System.out.println(str.compareToIgnoreCase("abc"));
    }
}
