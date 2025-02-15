package com.celcom.SaturdayAssignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementsPosition {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter the arraylist elements");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("The element at index "+i+" is "+list.get(i));
		}
		
	}
}
