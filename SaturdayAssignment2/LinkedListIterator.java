package com.celcom.SaturdayAssignment2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIterator {
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
	
	Iterator<Integer> it = list.iterator();
	while(it.hasNext())
	{
		System.out.print( it.next()+"->");
	}

}
}
