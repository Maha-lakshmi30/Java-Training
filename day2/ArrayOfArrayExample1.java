package com.celcom.day2;

public class ArrayOfArrayExample1 {
	public static void main(String[] args)
	{
		int arr[][]= {{1,2,3,5},{4,5,6,6},{7,8,9,9}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)//nested 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
