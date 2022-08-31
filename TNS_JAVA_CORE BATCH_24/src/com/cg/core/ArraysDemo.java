package com.cg.core;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	
		
			{
				int[] arr= {20,23,45,78,96,63,56,52,37,81,10};
				
				System.out.println("Entered Array is=");
				
				for(int num:arr)
				{
					System.out.println(num+ "  ");
				}
				Arrays.sort(arr);
				System.out.println("Sorted Array is=");
				for(int num: arr)
				{
					System.out.println(num+ "  ");
				}
					
				System.out.println(arr.length);
				System.out.println("Length of Array is=");


			}

		}


	}


