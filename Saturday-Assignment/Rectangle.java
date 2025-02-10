package com.celcom.Assignment1;


class Calculation
{
	void areaOfRectangle(int length,int breadth)
	{
		System.out.println("Area of Rectangle is: "+(length*breadth));
	}
	void perimeterOfRectangle(int length,int breadth)
	{
		System.out.println("Perimeter of Rectangle is: "+(2*(length+breadth)));
	}
}
public class Rectangle {

	public static void main(String args[])
	{
		Calculation rectangle=new Calculation();
		rectangle.areaOfRectangle(8, 9);
		rectangle.perimeterOfRectangle(8, 9);
	}
}
