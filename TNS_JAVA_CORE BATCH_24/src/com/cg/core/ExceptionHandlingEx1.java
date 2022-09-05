package com.cg.core;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
   int[] arr=new int[4]; //0 1 2 3--> index values
		
		try
		{
			
			//risky code
		
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		
			//handling code
		System.out.println("Index value Invalid, Please cheak the index value from 0 to 3.");
		}
		
		

	}

}
