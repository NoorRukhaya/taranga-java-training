package com.tharanga.oopsconcepts;

public class InheritanceDemo {
	public static void main(String[] args) {
		Dog dog = new Dog(false, "chicken", 4, "white");

		System.out.println("Dog is Vegetarian?" + dog.isVegetarian());
		System.out.println("Dog eats " + dog.getEats());
		System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");
		System.out.println("Dog color is " + dog.getColor());
}
}
