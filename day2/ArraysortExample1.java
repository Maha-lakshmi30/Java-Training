package com.celcom.day2;

import java.util.Arrays;

public class ArraysortExample1 {

	public static void main(String[] args)
	{
		int arr[]= {2,9,4,5,5};
		Arrays.sort(arr);
		//Ascending order
		for(int index=0;index<arr.length;index++)
		{
			System.out.print(arr[index]+" ");
		}
		System.out.println("First Minimum element "+arr[0]);
		System.out.println("Second Minimum element "+arr[1]);
		System.out.println("First Maximum value "+arr[arr.length-1]);
		System.out.println("Second Maximum value "+arr[arr.length-2]);
		
		//Descending order
		for(int index=arr.length-1;index>=0;index--)
		{
			System.out.print(arr[index]+" ");
		}
	}
}
