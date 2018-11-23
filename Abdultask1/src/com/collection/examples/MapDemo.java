package com.collection.examples;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String arg[])
	{
		
		HashMap<String,String> hashMap=new HashMap<String,String>();
		
		hashMap.put("record1", "E1001,Sunil,Delhi");
		hashMap.put("record2", "E1002,Vinod,Mumbai");
		hashMap.put("record3", "E1003,Raghu,Kolkata");
		hashMap.put("record4", "E1004,Wasim,Chennai");
		
		//To get all the keys of HashMap collection we need to use the keySet() method
		Set<String> allKeys=hashMap.keySet();
		
		for(String str:allKeys)
		{
			System.out.println(str);
			System.out.println("++++++++++++++++++++");
			
			String recordValue=hashMap.get(str);
			String eachValue[]=recordValue.split(",");
			
			System.out.println("Employee ID:"+eachValue[0]);
			System.out.println("Employee Name:"+eachValue[1]);
			System.out.println("Employee Address:"+eachValue[2]);
		}
	}
}
