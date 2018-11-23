package com.tharanga.polymorphism;

public class PolyMorphismOverrideDemo2 
{
	public void disp()
	   {
		System.out.println("disp() method of parent class");
	   }	   
	}
	class Demo extends PolyMorphismOverrideDemo2{
	   //Overriding method
	   
		public void disp(){
		System.out.println("disp() method of Child class");
	   }
	   public void newMethod(){
		System.out.println("new method of child class");
	   }
	   	
	public static void main(String[] args) {
		
		/* When Parent class reference refers to the parent class object  */

		   PolyMorphismOverrideDemo2 obj = new PolyMorphismOverrideDemo2();
			obj.disp();

			/* When parent class reference refers to the child class object
			 * This is called dynamic method dispatch and runtime polymorphism   */
			
			PolyMorphismOverrideDemo2 obj2 = new Demo();
			obj2.disp();
			((Demo) obj2).newMethod();  //casting

	}
	}


