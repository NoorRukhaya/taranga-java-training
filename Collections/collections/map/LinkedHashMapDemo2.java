package com.tharanga.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

class Book {    
int id;    
String name,author;    
  
public Book(int id, String name, String author) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
       
}    
}    
public class LinkedHashMapDemo2 {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book> map=new LinkedHashMap<Integer,Book>();    
    //Creating Books    
    Book b1=new Book(101,"Java","Ramya");    
    Book b2=new Book(102,"Data Communications & Networking","Suhas");    
    Book b3=new Book(103,"Operating System","Galvin");    
    //Adding Books to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author);   
    }    
}    
}
