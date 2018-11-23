package com.thranaga.oops;


class Dog2 extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
class Cat extends Dog2{
	void weep()
	{
		System.out.println("Weeping");
	}
}
public class MultilevelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cat obj=new Cat();
     obj.weep();
     obj.eat();
     obj.bark();
	}
}
