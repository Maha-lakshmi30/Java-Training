package com.celcom.day4;


class Animal1
{
	int a=10;
	void move()
	{
		System.out.println("Can not define");
	}
}
class Cat1 extends Animal1
{
	int a=20;
	void move()
	{
		System.out.println("By Walking");
	}
	void eat()
	{
		System.out.println("Fish");
	}
}
public class OverridingExample3 {

	public static void main(String args[])
	{
		Animal1 animal=new Cat1();
		animal.move();
		System.out.println(animal.a);
	}
}
