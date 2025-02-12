package com.celcom.day7;

//Inner Class


interface MyInterface{
	void display();
}
public class InnerClassExample implements MyInterface {
	
	//1. Non-static Inner Class
	class InnerClass1{
		void myMethod()
		{
			System.out.println("Non-Static Inner Class");
		}
	}
	//static inner class
	static class InnerClass2{
		void myMethod()
		{
			System.out.println("Static Inner Class");
		}
	}
	void myMethod(){
		//3.Local Inner class
		class InnerClass3{
			void myMethod3(){
				System.out.println("Local Inner class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
		}


	//anonymous inner class requires a functional interface 
	
	public void display()
	{
		System.out.println("Anonymous Inner Class");
	}
	
	
	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
		InnerClass1 inner1 = obj.new InnerClass1();
		inner1.myMethod();
		
		obj.myMethod();
		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.myMethod();
		
		InnerClassExample obj1 = new InnerClassExample();
		obj1.display();
		
		
		//anonymous class obj
		MyInterface obj3 = new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		obj3.display();
		
		//Lambda Expression
		MyInterface obj4 = () -> System.out.println("Display");
		obj4.display();
	}

}
