package com.cg.core;

import java.util.Arrays;

public class Main {

	public static void main(String[] args)
	{
	int intArr[]= {10,20,30,15,26};
	System.out.println("Integer Array: "+Arrays.toString(intArr) );
	
	System.out.println("/nNew Array by copyof Range:/n");
	
	System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOfRange(intArr,1,3)) );
	
	
	}

}
