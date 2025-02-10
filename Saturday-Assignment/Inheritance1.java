package com.celcom.Assignment1;

class Animal1
{
	void makeSound()
	{
		System.out.println("Animal sound");
	}
}
class Cat extends Animal1
{
	void makeSound()
	{
		System.out.println("It Barks");
	}
}
public class Inheritance1 {
	public static void main(String[] args)
	{
		Animal1 sound=new Cat();
		sound.makeSound();
	}

}
