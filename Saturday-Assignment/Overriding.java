package com.celcom.Assignment1;

class Vehicle
{
	void driveVehicle()
	{
		System.out.println("Driving vehicle");
	}
}
class Car extends Vehicle
{
	void driveVehicle()
	{
		System.out.println("Repairing a car");
	}
}
public class Overriding {
	public static void main(String[] args)
	{
		Vehicle car = new Car();
		car.driveVehicle();
	}
	

}
