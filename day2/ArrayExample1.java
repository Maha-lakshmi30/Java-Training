package com.celcom.day2;

public class ArrayExample1 {
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		int sum=0; 
		System.out.println("Array length is "+arr.length);
		for(int index=0; index<arr.length; index++)
		{
			System.out.println(arr[index]);
			sum+=arr[index];
		}
		System.out.println(sum);
		
		for(int value:arr) {
			System.out.println(value);
		}
	}

}
