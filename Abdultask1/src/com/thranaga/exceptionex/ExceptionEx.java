package com.thranaga.exceptionex;

public class ExceptionEx {
		public static void main(String[] ar)
		{
			int x=10, y=0, c;

			try
			{
				c=x/y;
				System.out.println("c value="+c);
				
			
			}
			catch(Exception eobj)
			{
				System.out.println(eobj);	
			}
			try {
				int a[]=new int[5];  
				a[10]=50;
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}	
	}

