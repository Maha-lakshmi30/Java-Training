package com.celcom.day4;

public class MethodOverloadingExample1 {

	
	void myMethod(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
	void myMethod(int a,int b)
	{
		System.out.println("Sum of the two numbers is: "+ (a+b));
	}
	void myMethod(String name)
	{
		System.out.println("Welcome "+name);
	}
	
	public static void main(String[] args)
	{
		MethodOverloadingExample1 obj=new MethodOverloadingExample1();
		obj.myMethod(10);
		obj.myMethod(20,30);
		obj.myMethod("maha");
	}
}
