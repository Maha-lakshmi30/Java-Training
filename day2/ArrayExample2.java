package com.celcom.day2;
import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println("Initial values of the array");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 values");
		
		for(int index=0;index<arr.length;index++)
		{
			arr[index]=sc.nextInt();
		}
		int sum=0,evenCount=0,oddCount=0;
		
		for(int index=0;index<arr.length;index++)
		{
			sum= sum+arr[index];
			if(arr[index]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Array sum is "+sum);
		System.out.println("evenCount :"+evenCount);
		System.out.println("oddCount :"+oddCount);
	}

}
