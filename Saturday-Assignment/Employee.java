package com.celcom.Assignment1;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	Employee(String name,String jobTitle,double salary)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Initial Salary is: "+salary);
	}
	public double calculateSalary(double HRA,double DA,double tax)
	{
		return (HRA+DA+tax);
	}
	public void updatedSalary(double bonus,double csalary,double salary)
	{
		System.out.println("updated salary: "+(bonus+csalary+salary));
	}
	public static void main(String args[])
	{
		Employee sal=new Employee("Maha","Trainee",20000.49);
		sal.display();
		double csalary= sal.calculateSalary(1490.8, 384.90, 137.80);
		sal.updatedSalary(5000.90, csalary,20000.49);
		
	}

}
