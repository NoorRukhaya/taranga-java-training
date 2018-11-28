package com.tharanga.annotation;

 class BaseClass {
    
    public void run(String str){
        System.out.println("Super Class implementation:"+str);
    }
    
}
 class ChildClass extends BaseClass{

	  // @Override
	   public void run(String str){
	       System.out.println("Child Class implementation:"+str);
	   }

	}
public class OverrideAnnotation {
	public static void main(String[] args) {
        BaseClass bc = new ChildClass();
        bc.run("override method");
    }
}
