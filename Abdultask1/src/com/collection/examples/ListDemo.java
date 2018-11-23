package com.collection.examples;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String arg[])
	{
	
		ArrayList list=new ArrayList();
		
		list.add("Suraj"); //Adding String objects
		list.add("Kiran");
		list.add("Gagan");
		list.add(890);  //=> 890= new Integer(890)
		list.add(788);
		
		System.out.println("Size of Collection:"+list.size());
		
		System.out.println(list);
		
		list.add(2,"Pranith"); //Adding element by using index at middle
		
		System.out.println(list);
		
		list.remove(4);//Delete 4th index object
		
		System.out.println(list);
		
		list.add("Suraj"); //Adding Duplicate elements
		
		System.out.println(list);
		
		Object atIndex=list.get(5); //Getting an object from a particular index
		
		if(atIndex instanceof String)
		{
			String str=(String)atIndex;
			System.out.println("At 5th Index String Object:"+str);
		}
		else
		{
			Integer intr=(Integer)atIndex;
			System.out.println("At 5th Index Integer Object:"+intr);
		}
	}

}
