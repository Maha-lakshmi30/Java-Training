package com.celcom.day6;

public class TryCatchExample1 {
	public static void main(String[] args)
	{
		System.out.println("Before Exception");
		try
		{
			int a=10/0;
			//int a=Integer.parseInt("ABC");
			//int arr[]=new int[-5];
			//System.out.println("Hi");//it will not executed,since the exception in previous statement itself
			//int arr[]= {10,20,30};
			//System.out.println(arr[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("A");
			try
			{
				int b=Integer.parseInt("Hello");
			}
			catch(NumberFormatException e1)
			{
				System.out.println(e1);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("B");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("C");
		}
		catch(Exception e)//global catch block it must always be at last of all exceptions
		{
			System.out.println("D");
		}
		System.out.println("After Exception");
	}

}
