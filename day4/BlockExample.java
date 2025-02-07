package com.celcom.day4;



public class BlockExample {
	{
		System.out.println("Instance Block");
	}
	BlockExample()
	{
		System.out.println("Constructor");
	}
	@Override
	public String toString(){
		return "To String";
	}
	static
	{
		System.out.println("Static Block ");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method Block");
		BlockExample b=new BlockExample();
		System.out.println(b);
	}
}
