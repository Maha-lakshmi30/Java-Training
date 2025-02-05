package com.celcom.day2;

class Example
{
	int Add(int m,int n)
	{
		return m+n;
	}
}


public class MethodExample {
public static void main(String[] args)
{
	int a=10;
	int b=30;
	Example e=new Example();
	int result=e.Add(a, b);
	System.out.println(result);
}
}
