/**
 * 
 */
package com.thranaga.oops;

/**
 * @author abdul
 *
 */
class Sum
{
	void adding(int a, int b)
	{
		System.out.println(a+b);
	}
	void adding(double a,double b)
	{
		System.out.println(a+b);
	}
}
public class MethodOverloadEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum obj=new Sum();
		obj.adding(10, 20);
		obj.adding(10, 15);
	}

}
