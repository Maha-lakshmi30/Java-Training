package com.celcom.Assignment1;
import java.util.Scanner;

class Calculate
{
	void areaOfCircle(double radius)
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle is: "+area);
	}
	void circumferenceOfCircle(double radius)
	{
		double cicumference= 2*(3.14)*radius;
		System.out.println("Circumference of circle is: "+cicumference );
	}
}
public class Circle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double radius=sc.nextDouble();
		
		Calculate circle =new Calculate();
		circle.areaOfCircle(radius);
		circle.circumferenceOfCircle(radius);
		
	}

}
