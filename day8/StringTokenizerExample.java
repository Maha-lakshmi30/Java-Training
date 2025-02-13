package com.celcom.day8;
import java.util.StringTokenizer;


public class StringTokenizerExample {

	public static void main(String[] args) {
		String s1 = "Welcome to java Programming";
		StringTokenizer st = new StringTokenizer(s1," ");
		System.out.println(st.countTokens());//4
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
