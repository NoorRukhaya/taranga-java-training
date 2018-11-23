/**
 * 
 */
package com.thranaga.oops;

/**
 * @author abdul
 *
 */
class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal 
{
	void bark() {
		System.out.println("barking");
	}
}
public class InhertinaceEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog ob=new Dog();
		ob.bark();
		ob.eat();
	}

}
