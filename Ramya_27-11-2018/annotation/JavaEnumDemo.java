package com.tharanga.annotation;



public class JavaEnumDemo {
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}  
	public static void main(String args[]){  
	Day day=Day.SATURDAY;  
	  
	switch(day){  
	  
	case MONDAY:   
	 System.out.println("monday");  
	 break;  
	case TUESDAY:   
		 System.out.println("tuesday");  
		 break;  
	case WEDNESDAY:   
		 System.out.println("wednesday");  
		 break;  
	case THURSDAY:   
		 System.out.println("thursday");  
		 break;  
	case FRIDAY:   
		 System.out.println("friday");  
		 break;  
	default:  
	System.out.println("WeekOff(Saturday or Sunday)");  
	}  
	}
}
