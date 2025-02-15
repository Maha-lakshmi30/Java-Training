package com.celcom.SaturdayAssignment2;

import java.util.LinkedList;
import java.util.Scanner;

public class CopyLinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Enter list elements");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		LinkedList<Integer> list2 = new LinkedList<Integer>(list);
		System.out.println("The copied list is "+list2);
		
	}
}
