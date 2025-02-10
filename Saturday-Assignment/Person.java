package com.celcom.Assignment1;
import java.util.Scanner;
class Details
{
	String name;
	int age;
	
	Details(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display() {
	System.out.println("Name of the person is: "+name);
	System.out.println("Age of the person is: "+age);
	}
}

public class Person {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.next();
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		Details obj=new Details(name,age);
		
		
	}
}
