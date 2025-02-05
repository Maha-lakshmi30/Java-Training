package com.celcom.day2;

 class Employee
{
	//variable Declaration 
	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employee(int eid,String ename,double esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	
	void display()
	{
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee salary: "+esalary);
	}
}

public class ClassAndObjectExample1 {

	public static void main(String args[])
	{
		Employee maha=new Employee(101,"maha",2000);
		maha.display();
		
		Employee sneha=new Employee(102,"sneha",3004);
		sneha.display();
	}
}
