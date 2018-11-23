package com.tharanga.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String args[])
	{
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1001, "Divya");
		map.put(1005, "Bhavya");
		map.put(1000, "Manasa");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(1001,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(1001,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(1001, false, 1005, true));
	}
}
