package com.celcom.day4;

public class MethodOverloadingExample4 {
    
	void conCat(int a,int b)
	{
		System.out.println(a+""+b);
	}
	void conCat(String a,String b)
	{
		System.out.println(a+b);
	}
	void conCat(double a, double b)
	{
		System.out.println(a+""+b);
	}
	public static void main(String[] args)
	{
		MethodOverloadingExample4 obj=new MethodOverloadingExample4();
		obj.conCat(10,30);
		obj.conCat(48.9,20.34);
		obj.conCat("Hi","Welcome");
	}
}
