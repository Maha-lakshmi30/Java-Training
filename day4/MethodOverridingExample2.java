package com.celcom.day4;


class Animal{
	void move() {
		System.out.println("Can not define");
	}
	void eat() {
		System.out.println("Can not define");
	}
}
class Cat extends Animal{
	void move()
	{
		System.out.println("Cat will move by walk");
	}
	void eat()
	{
		System.out.println("Cat will eat Rat");
	}
}
class Parrot extends Animal{
	void move()
	{
		System.out.println("Parrot will fly");
	}
	void eat()
	{
		System.out.println("Parrot will eat fruits");
	}
}
class Fish extends Animal{
	void move()
	{
		System.out.println("Fish will swim");
	}
	void eat()
	{
		System.out.println("Fish will eat worms");
	}
}
public class MethodOverridingExample2 {
	
	public static void main(String args[])
	{
		Animal animal;//ref for superclass
		animal=new Cat();
		animal.move();
		animal.eat();
		
		animal=new Parrot();
		animal.move();
		animal.eat();
		
		animal=new Fish();
		animal.move();
		animal.eat();
		
		animal=new Animal();
		animal.move();
		
	}

}
