package com.celcom.Assignment1;


class Shape
{
	void getArea()
	{
		System.out.println("Area of Shapes");
	}
}
class Rectangle1 extends Shape
{
	int len;
	int breadth;
	Rectangle1(int len,int breadth)
	{
		this.len=len;
		this.breadth=breadth;
	}
	void getArea()
	{
		System.out.println("Area of Rectangle is: "+(len*breadth));
	}
}
public class Overriding2 {
	public static void main(String[] args)
	{
		Shape area = new Rectangle1(10,20);
		area.getArea();
	}

}
