package com.cg.core;

public class StaticDemo 
{
	String name; // object bound
	int roll; // object bound
	static String coll="Pune University"; // class bound not object bound
	
	
	void display()
	{
		System.out.println(name+ "  "+ roll+ "  "+coll);
	}
	// static methods
	static void modify()
	{
		coll="Pune Mahavidyalaya";
	}
	public StaticDemo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[]args)
	{
		modify(); //method call --->no need of objects
		StaticDemo s1= new StaticDemo ("SHWETA",1);
		s1.display();//method call
		
		StaticDemo s2= new StaticDemo("AYUSH",2);
		s2.display();
		

	}

}
