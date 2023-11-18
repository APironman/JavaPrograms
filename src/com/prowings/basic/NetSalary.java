package com.prowings.basic;

import java.util.Scanner;
class NetSalary
{
	public static double totalAllowance(double salary)
	{
		double HRA = salary * 45 /100; // HRA means House Rent Allowance 
		double TA = salary * 25 /100;  // TA means Travelling Allowance
		double DA = salary * 30 /100;  // DA means Dearness Allowance
		double a = salary+HRA+TA+DA;
		System.out.println(a);
		return a;
	}
	public static double tatalDeduction(double addSalary)
	{
       double MA = addSalary * 5 /100;	// MA means Medical Allowances	
       double PF = addSalary * 25 /100;	// PF means Provident Fund	
	   double b =addSalary-(MA+PF);
	   System.out.println(b);
	   return b;
	}
	public static double netSalary(double addSalary,double deductSalary,double salary)
	{
		return addSalary+deductSalary-salary;
	}
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary ");
		double salary = sc.nextDouble();
		double addSalary = totalAllowance(salary); // 1000000
		double deductSalary = tatalDeduction(salary);
		System.out.println("Net Salary is :- "+netSalary(addSalary,deductSalary,salary));
	}
}