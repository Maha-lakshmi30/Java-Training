package com.celcom.day3;

public class ThisAndConstructor {
	
	String name;
	
	ThisAndConstructor()
	{ 
		this("maha");
	}
	ThisAndConstructor(String name)
	{
		this.name=name;
		this.greeting();
	}
	void greeting()
	{
		System.out.println("Welcome "+name);
	}
	public static void main(String args[])
	{
		ThisAndConstructor obj=new ThisAndConstructor();
	}
	

}
