package com.celcom.day3;


class A1
{
	A1()
	{
		System.out.println("A");
	}
	A1(int n)
	{
		System.out.println("A 1");
	}
}
class B1 extends A1
{
	B1()
	{
		this(108);
		// JVM will add only super of keyword for empty constructor if we not given
		System.out.println("B");
	}
	B1(int a)
	{
		super(100);
		System.out.println("B 1");
	}
}
public class ConstructorExample2 {
	public static void main(String[] args)
	{
		B1 b=new B1();
	}

}
