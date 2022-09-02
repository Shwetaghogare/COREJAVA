package com.cg.core;

public class SingleInheritEx1 
{
public static void main(String[] args)
{
	B obj=new B();
	obj.a=10;
	obj.b=20;
	obj.c=30;
	obj.show();
}


}
//Parent class or Base class
class A
{
int a,b;
void display()
{
  System.out.println("From class A"+a+"  "+b);
}
}

class B extends A
{
	int c;
	void show()
	{
		System.out.println("From classA and B both "+b+"  "+c);
	}
	}