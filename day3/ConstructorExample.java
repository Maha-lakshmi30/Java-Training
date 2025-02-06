package com.celcom.day3;


class A
{
	A()
	{
		System.out.println("A");
	}
}
class B extends A
{
	B()
	{//even if we use super keyword here it will print the same as "A" and "B"
	 // otherwise JVM will add only super of keyword for empty constructor
		System.out.println("B");
	}
}
public class ConstructorExample {
	public static void main(String[] args)
	{
		B b=new B();
	}

}
