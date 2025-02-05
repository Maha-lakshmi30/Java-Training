package com.celcom.day2;

public class ArrayOfArrayExample2 {

	public static void main(String[] args)
	{
		int arr[][]=new int[3][];
		int a1[]= {7,8,9};
		arr[0]=new int[] {1,2};
		arr[1]=new int[] {3,4,5,6};
		arr[2]=a1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
