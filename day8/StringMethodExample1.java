package com.celcom.day8;

public class StringMethodExample1 {
	public static void main(String[] args) {
		String s1="Java";
		
		System.out.println(s1.length());//4
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.toLowerCase());//java
		System.out.println(s1.toUpperCase());//Java
		System.out.println(s1.concat("Program")); //JavaProgram
		System.out.println(s1.replace('a', 'o'));//Jovo
		System.out.println(s1.equals("java"));//false
		System.out.println(s1.equalsIgnoreCase("java"));//true
		System.out.println(s1.contains("ava"));//true
		System.out.println(s1.startsWith("Ja"));//true
		System.out.println(s1.endsWith("va"));//true
		
		String s2="Java World";
		System.out.println(s2.substring(2,7));//end value = (end-1)=>va Wo
		System.out.println(s2.substring(2));//va World
		
	}

}
