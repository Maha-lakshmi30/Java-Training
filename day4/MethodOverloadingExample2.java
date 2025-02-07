package com.celcom.day4;

public class MethodOverloadingExample2 {
	
	void addition(int a,int b)
	{
		System.out.println("Integer addition: "+(a+b));
	}
	
	void addition(double a,double b)
	{
		System.out.println("Double addition: "+(a+b));
	}
	void addition(long a,long b)
	{
		System.out.println("long addition: "+(a+b));
	}
	
	public static void main(String[] args)
	{
		MethodOverloadingExample2 obj =new MethodOverloadingExample2();
		obj.addition(10.5,30.4);
		obj.addition(3,8);
		obj.addition(30L, 40L);
	}

}
