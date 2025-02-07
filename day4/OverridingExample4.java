package com.celcom.day4;

class Animals
{
	String msg=getMessage();
	
	String getMessage()
	{
		return "A";
	}
}
class Cats extends Animals
{
	String getMessage()
	{
		return "B";
	}
}

public class OverridingExample4 {
	
	public static void main(String[] args)
	{
		Animals animal=new Cats();
		System.out.println(animal.msg);
	}

}
