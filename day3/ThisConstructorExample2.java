package com.celcom.day3;

public class ThisConstructorExample2 {
	
	ThisConstructorExample2()
	{
		this("maha");
		System.out.println("A");
	}
	ThisConstructorExample2(String name)
	{
		this(10);
		System.out.println("B");
	}
	ThisConstructorExample2(int n)
	{
		System.out.println("C");
	}
	
	public static void main(String[] args)
	{
		ThisConstructorExample2 obj1=new ThisConstructorExample2();
	}

}
