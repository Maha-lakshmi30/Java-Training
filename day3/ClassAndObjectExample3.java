package com.celcom.day3;

class Scooty {

	String color;
	int speed;
	int price;

	Scooty(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Price of scooty is: "+price);
		System.out.println("Speed is: "+speed+"km");
	    System.out.println("color is: "+color);
	}

}

public class ClassAndObjectExample3 {
	public static void main(String[] args) {
		
		Scooty activa=new Scooty("Black",40,50000);
		activa.display();

	}
}
