package com.cg.core;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try 
		{
         System.out.println(5+5);
         System.out.println(2/0); // exception
         System.out.println(3);
	    }
		
		finally// privilliged block
		{
			System.out.println("I am finally block");
		}
		System.out.println(" am remaining code");
     }
}
		
