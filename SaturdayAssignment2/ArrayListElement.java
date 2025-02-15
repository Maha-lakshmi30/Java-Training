package com.celcom.SaturdayAssignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter the arraylist elements");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println("Enter the element to be searched");
		int searchElement = sc.nextInt();
		
		if(list.contains(searchElement))
		{
			System.out.println("The element " + searchElement + " is present in the list at index " +list.indexOf(searchElement));
		}
		else
		{
			System.out.println("The element is not found in the list");
		}
		
		
	}

}
