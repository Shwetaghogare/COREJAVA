package com.cg.core;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection {

	public static void main(String[] args) {
		
			 
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Shweta");//Adding object in arraylist  
			list.add("Ayush");  
			list.add("Omkar");  
			list.add("Rohan");  
			list.add("Suyog");  
			
			//Traversing list through Iterator  
			Iterator itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			}  
			

	}

