 package com.cg.core;

public class Array2 {

	public static void main(String[] args) {
		byte[] a=new byte[4];
		System.out.println(a.getClass().getName());
		
		int[][] x= new int[2][4];
		System.out.println(x);// address
		
		System.out.println(x[0]);//adress
		
		System.out.println(x[0][0]);
		
		System.out.println(x[0][1]);  
		
	int [][][] b = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
	
	System.out.println(b);
	
	System.out.println(b[0][1][2]);
	
	System.out.println(b[1][0][1]);
	
	System.out.println(b[1][2][0]);
	
	System.out.println(b[1][1][1]);
	
	System.out.println(b[2][1][0]);
	
	
	
	}

}
