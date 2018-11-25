package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo1 {
	
	public static void main(String a[]){  
		
        List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");  
        System.out.println("Initial collection value:"+list);  
        Collections.addAll(list, "Servlet","JSP");  
        System.out.println("After adding elements collection value:"+list);  
        String[] strArr = {"C#", ".Net"};  
        Collections.addAll(list, strArr);  
        System.out.println("After adding array collection value:"+list);  
        
        //sort String
        Collections.sort(list);  
    //    Collections.sort(list,Collections.reverseOrder());  reverese order
        Iterator itr=list.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
         }  
        
        List<Integer> list1 = new ArrayList<Integer>();  
        list1.add(46);  
        list1.add(67);  
        list1.add(24); 
        System.out.println(list1);
        System.out.println("Value of maximum element from the collection: "+Collections.max(list1));
        System.out.println("Value of minimum element from the collection: "+Collections.min(list1));  
    }  
}
