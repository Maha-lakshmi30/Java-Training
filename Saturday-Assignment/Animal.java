package com.celcom.Assignment1;
import java.util.Scanner;

class Dog
{
	String name;
	String Breed;
	
	Dog(String name,String Breed)
	{
		this.name=name;
		this.Breed=Breed;
	}
	void displayDog()
	{
		System.out.println("The dog name is: "+name);
		System.out.println("It's Breed is: "+Breed);
	}
	public void setName(String name) {
		this.name=name;
		System.out.println("The new name is: "+name);
	}
	public void setBreed(String Breed) {
		this.Breed=Breed;
		System.out.println("The new name is: "+Breed);
	}
	
}
public class Animal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Dog: ");
		String name=sc.next();
		System.out.println("Enter the Breed of the Dog: ");
		String Breed=sc.next();
		
		Dog detail=new Dog(name,Breed);
		detail.displayDog();
		
		System.out.println("Enter the new name: ");
		String newname=sc.next();
		detail.setName(newname);
		
		System.out.println("Enter the new breed: ");
		String newBreed=sc.next();
		detail.setBreed(newBreed);
		
		
		
	}
}
