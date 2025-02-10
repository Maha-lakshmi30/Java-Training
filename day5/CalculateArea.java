package com.celcom.day5;

import java.util.Scanner;

interface Area
{
	void calculateArea();
}
interface Perimeter
{
	void calculatePerimeter();
}
abstract class Shape implements Area,Perimeter{
	int radius, length, breadth;
	float height;

	public Shape(int radius) {
		this.radius = radius;
	}

	public Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Shape(int length, float height) {
		this.length = length;
		this.height = height;
	}

	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	
}

class Circle extends Shape {
	public Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		System.out.println("The area of circle is " + (3.14 * radius * radius));
	}
	public void calculatePerimeter() {
		
		System.out.println("The area of circle is " + (2*3.14 * radius));
	}
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public void calculateArea() {
		System.out.println("The area of Rectangle is " + (length * breadth));
	}
	public void calculatePerimeter(){
		System.out.println("The perimter of Rectangle "+(2*length*breadth));
	}
}

class Traingle extends Shape {
	Traingle(int length, Float height) {
		super(length, height);
	}

	public void calculateArea() {
		System.out.println("The area of Triangle is " + (0.5 * length * height));
	}
	public void calculatePerimeter(){
		System.out.println("The perimeter of Triangle is "+(0.5));
	}
}

public class CalculateArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape;
		System.out.println("1. Circle  2.Rectangle 3.Triangle ");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			shape.calculateArea();
			shape.calculatePerimeter();
		}
		if (choice == 2) {
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Breadth");
			int breadth = sc.nextInt();
			shape = new Rectangle(length, breadth);
			shape.calculateArea();
			shape.calculatePerimeter();
		}
		if (choice == 3) {
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Height");
			Float height = sc.nextFloat();
			shape = new Traingle(length, height);
			shape.calculateArea();
			shape.calculatePerimeter();
		}
	}

}
