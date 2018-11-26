package com.tharanga.interfaceabstractclass;

interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank{  
public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
public float rateOfInterest(){return 9.7f;}  
}  

 
public class InterfaceDemo {
	public static void main(String[] args){  
		Bank b=new SBI();  
		System.out.println("SBI ROI: "+b.rateOfInterest());  
		
		Bank b1=new PNB();  
		System.out.println("PNB ROI: "+b1.rateOfInterest()); 
		}
	} 

