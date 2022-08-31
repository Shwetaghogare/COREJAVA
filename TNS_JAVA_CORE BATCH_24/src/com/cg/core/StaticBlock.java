package com.cg.core;

public class StaticBlock {

	public static void main(String[] args) 
	{
		System.out.println("I am main method");


	}
	static 
	{
		System.out.println("I am static 1");
		

	}
	static
	{
		System.out.println("I am static 2");
	dummy();
	
	}
	
	static void dummy()
	{
		System.out.println("I am one dummy method"); 

	}

}
