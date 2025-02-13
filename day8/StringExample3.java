package com.celcom.day8;


//String are immutable object like array
//to overcome this we have stringBuffers and StringBuilder are mutable object
public class StringExample3 {
	public static void main(String[] args) {
		
		String s1 = "Java";
		s1=s1.concat(" World");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.capacity());//default capacity(16) + num of characters(4)
		sb.append(" World");
		System.out.println(sb);//Java World
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append(" World");
		System.out.println(sb1);
		
	}

}
