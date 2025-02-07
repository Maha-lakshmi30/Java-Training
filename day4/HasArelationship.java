package com.celcom.day4;

class Vehicle3{
	void engine()
	{
		System.out.println("All vehicle has a engine");
	}
	void wheels()
	{
		System.out.println("All vehicle has a Wheel");
	}
}
class Wheels
{
	void WheelModel()
	{
		System.out.println("Wheel Model is MRF ");
	}
	void noOfWheels(String vehicleType)
	{
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have Two wheels");
		}
		else if(vehicleType.equals("Four Wheeler")) {
			System.out.println("I have Four Wheels");
		}
	}
}
class Engine
{
	void engineModel()
	{
		System.out.println("Engine Model is XYZ ");
	}
	
}
class Car extends Vehicle3{//is - a relationship
	Wheels wheel = new Wheels();//HAS-A
	Engine engine=new Engine();//HAS-A
	
	void engineModel() {
		engine.engineModel();
	}
	void wheelModel(){
		wheel.WheelModel();
		}
	void noOfWheels(){
		wheel.noOfWheels("Four Wheele");
	}
}
public class HasArelationship {

	public static void main(String[] args)
	{
		
		Car car=new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
	}
}
