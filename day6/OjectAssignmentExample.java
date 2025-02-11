package com.celcom.day6;

public class OjectAssignmentExample {
	
	public static void main(String[] args)
	{
		OjectAssignmentExample obj1=new OjectAssignmentExample();
		System.out.println(obj1.hashCode());
		
		OjectAssignmentExample obj2=obj1;//Object Assignment
		
		System.out.println(obj2.hashCode());
	}

}
