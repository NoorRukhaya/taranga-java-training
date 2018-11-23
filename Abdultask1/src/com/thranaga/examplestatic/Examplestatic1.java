package com.thranaga.examplestatic;

public class Examplestatic1 {
		int count=0;//will get memory each time when the instance is created  
		  
		Examplestatic1(){  
		count++;//incrementing value  
		System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		//Creating objects  
			Examplestatic1 c1=new Examplestatic1();  
			Examplestatic1 c2=new Examplestatic1();  
			Examplestatic1 c3=new Examplestatic1();  
		}  
		} 

