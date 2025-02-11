package com.celcom.day6;

public class ExceptionExample1 {
	public static void main(String[] args)
	{
		System.out.println("Before Exception");
		//int a=10/0;
		//int arr[]=new int[-5];
		//int arr[]= {10,20,30};
		//System.out.println(arr[3]);
		
		//int a=Integer.parseInt("ABC");
		//System.out.println(a);
		//Object o =new ExceptionExample1();
		ExceptionExample1 o =(ExceptionExample1) new Object();//class Cast Exception
		System.out.println("After Exception");
	}
	

}
