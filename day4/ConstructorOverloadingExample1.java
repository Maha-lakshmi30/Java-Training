package com.celcom.day4;

public class ConstructorOverloadingExample1 {

	ConstructorOverloadingExample1(int a,int b)
	{
		this("hi","maha");
		System.out.println("Integer addition is: "+(a+b));
	}
	ConstructorOverloadingExample1(String a,String b)
	{
		this(29f,45f);
		System.out.println("String concatenation: "+a+b);
	}
	ConstructorOverloadingExample1(float a,float b)
	{
		System.out.println("float addition: "+(a+b));
	}
	
	public static void main(String[] args)
	{
		ConstructorOverloadingExample1 obj1 =new ConstructorOverloadingExample1(10,20);
		
		//ConstructorOverloadingExample1 obj2 =new ConstructorOverloadingExample1("Hi","helo");
		
		//ConstructorOverloadingExample1 obj3 =new ConstructorOverloadingExample1(19f,9f);
				
	}
}
