package com.celcom.day8;

public class StringExample2 {
	public static void main(String[] args)
	{
		String s1 = new String("Java");
		String s2 = new String("Java");//getting diff memory location in heap memory
		System.out.println(s1.equals(s2));//true//it checks for value
		System.out.println(s1==s2);//false//it checks for mem location
		
		String s3="Java";
		String s4="Java";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true//pointing to same mem location
		
	}

}
