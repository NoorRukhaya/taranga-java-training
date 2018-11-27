package string_example;

import java.util.Arrays;

public class StringToByte {
	public static void main(String args[]) {
		  String str = "Example String";
		  byte[] b = str.getBytes();
		  System.out.println("Array " + b);
		  System.out.println("Array as String" + Arrays.toString(b));
		 }
}
