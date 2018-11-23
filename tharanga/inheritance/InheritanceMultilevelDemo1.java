package com.tharanga.inheritance;
	
    class Animal
      {
	void eat()
	    {
		System.out.println("Inside Animal");
		}  
	  }  
    
	class Dog extends Animal
	  {  
	void run()
	    {
		System.out.println("Inside Dog");
		}  
	  }  
	
	class Cat extends Dog
	{  
	void meaw()
	  {
		System.out.println("Inside Cat");
	  }  
	}  
	
	public class InheritanceMultilevelDemo1 {

	public static void main(String[] args) {
		Cat d = new Cat();  
		d.eat(); 
		d.run();  
		d.meaw(); 
		} 
	}		
			
			




