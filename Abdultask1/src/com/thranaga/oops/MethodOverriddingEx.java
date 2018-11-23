/**
 * 
 */
package com.thranaga.oops;

/**
 * @author abdul
 *
 */
class Vechile{
	void run() {
		System.out.println("runing");
	}
}
class Bike extends Vechile{
	void run()
	{
		System.out.println("bike is running");
	}
}
public class MethodOverriddingEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		obj.run();
	}

}
