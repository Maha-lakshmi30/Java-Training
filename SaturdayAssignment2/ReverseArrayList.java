package com.celcom.SaturdayAssignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter list elements");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		Collections.reverse(list);
		
		System.out.println("The sorted arrayList is "+list);
	}

}
