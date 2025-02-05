package com.celcom.day2;

public class InstanceVsStatic {
		int a=10;
		static int b=30;
		public static void main(String[] args)
		{
			InstanceVsStatic obj1=new InstanceVsStatic();
			InstanceVsStatic obj2=new InstanceVsStatic();
			
			System.out.println(obj1.a);//10
			System.out.println(obj2.a);//10
			
			obj1.a=20;
			
			System.out.println(obj1.a);//20
			System.out.println(obj2.a);//10
			
			obj2.b=90;
			System.out.println(obj1.b);//20
			System.out.println(obj2.b);//10
			
		}
}
