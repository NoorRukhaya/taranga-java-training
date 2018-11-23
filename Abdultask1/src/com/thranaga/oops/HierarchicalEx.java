/**
 * 
 */
package com.thranaga.oops;

/**
 * @author abdul
 *
 */
class Dog1 extends Animal{
	void bark() {
		System.out.println("bark");
	}
}
class Cat1 extends Animal{
	void weep() {
		System.out.println("weeping");
	}
}
public class HierarchicalEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat1 obj=new Cat1();
		obj.eat();
		obj.weep();
		Dog1 obj1=new Dog1();
		obj1.bark();
		obj1.eat();
		
	}

}
