package com.celcom.day4;

final class Animal2{
	String msg=getMessage();
	String getMessage()
	{
		return "A";
	}
}
public class FinalKeyworkExample1 {

	public static void main(String[] args)
	{
		Animal2 animal=new Animal2();
		System.out.println(animal.msg);
		
		
	}
}
