package com.celcom.day3;


class Vehicle1
{
	String name ="I'm super class Variable";
	Vehicle1()
	{
		System.out.println("I'm Super class Constructor");
	}
	void noOfEngine(){
		System.out.println("I have One Engine");
	}
}
class TwoWheelers extends Vehicle1
{
	TwoWheelers()
	{
		super();
	}
	void noOfWheels()
	{
		System.out.println("I have Two wheels");
		super.noOfEngine();
		System.out.println(super.name);
	}
}

public class SuperKeyword {
	public static void main(String[] args) 
	{
		TwoWheelers two=new TwoWheelers();
		two.noOfWheels();
	}
}
