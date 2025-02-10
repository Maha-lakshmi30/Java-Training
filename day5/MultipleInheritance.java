package com.celcom.day5;

interface InterfaceOne
{
	int a=10;//By default variable all are public static and final
}
interface InterfaceTwo
{
	int a=20;//By default variable all are public static and final
}
interface InterfaceThree extends InterfaceOne,InterfaceTwo
{
	void addition();
}
class Addition implements InterfaceThree
{ 
	public void addition()
	{
		System.out.println("The sum is : "+(InterfaceOne.a+InterfaceTwo.a));
	}
	
}
public class MultipleInheritance {
	public static void main(String[] args)
	{
		InterfaceThree add =new Addition();
		add.addition();
	}
}
