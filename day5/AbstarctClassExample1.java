package com.celcom.day5;

//Interface
interface VehiclePlan1{
	 void noOfEngine();
	//Interface methods all are public and abstract
	
}
interface VehiclePlan2{
	void noOfWheels();
	void brandName();
}
//since the interface is public every method should be public in Abstract and concrete class.


//Abstract class
abstract class Vehicle implements VehiclePlan1,VehiclePlan2
{
	public void noOfEngine()
	{
		System.out.println("I have one engine");
	}
	public abstract void noOfWheels();//optional
	public abstract void brandName();//optional
	
}

class Car extends Vehicle
{
	public void noOfWheels() {
		System.out.println("I have two Wheels");
	}
	public void brandName()
	{
		System.out.println("My brand name Benz");
	}
	
}
abstract public class AbstarctClassExample1 {
	public static void main(String[] args)
	{
		//VehiclePlan1 vec;
		 Car vec=new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
		
	}

}
