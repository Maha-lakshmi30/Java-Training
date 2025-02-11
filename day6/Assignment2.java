package com.celcom.day6;
import java.util.Arrays;
import java.util.Scanner;

class DuplicateException extends Exception
{
	public DuplicateException(String message)
	{
		super(message);
	}
}

public class Assignment2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array numbers");
		int arr[]=new int[10];
		for(int index=0;index<10;index++)
		{
			arr[index]=sc.nextInt();
		}
		try
		{
			isDuplicate(arr);
			System.out.println("No duplicates found");
		}
		catch(DuplicateException e)
		{
			System.out.println(e.getMessage());
		}
	}
		public static void isDuplicate(int[] arr)throws DuplicateException{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						throw new DuplicateException("Duplictes present: "+arr[i]);
					}
				}
			}
		}

}
