package com.celcom.day3;


class Vehicle
{
	void noOfEngine(){
		System.out.println("I have One Engine");
	}
}
class TwoWheeler extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I have Two wheels");
	}
}
class Bike extends TwoWheeler
{
	void brandName()
	{
		System.out.println("My brand name is Honda");
	}
}
class Scooty extends TwoWheeler
{
	
	void brandName()
	{
		System.out.println("My brand name is Activa");
	}
}
public class InheritanceExample1 {
	public static void main(String[] args) 
	{
		Bike honda =new Bike();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
		
		Scooty activa =new Scooty();
		activa.noOfEngine();
		activa.noOfWheels();
		activa.brandName();
	}
}
