package collection_example;

import java.util.TreeSet;

public class Setdemo2 {
	public static void main(String arg[])
	{
		TreeSet hashSet=new TreeSet();
		
		hashSet.add("Sudhir");
		hashSet.add("Vinod");
		hashSet.add("Fareed");
		hashSet.add("Mohit");
	
		hashSet.add("Fareed"); //Duplicate Values
		
		System.out.println(hashSet);
		
		
	}
}
