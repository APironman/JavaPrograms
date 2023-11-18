package com.prowings.basic;

import java.util.Scanner;
class CompoundIntrest
{
	public static double NetLoanAmount(double actualAmount, float rate, float year)
	{
	 double netAmount = actualAmount*(Math.pow(1+rate/100,year));
	 return netAmount;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Actual Amount");
		double actualAmount = sc.nextDouble();
		System.out.println("Enter Rate");
		float rate = sc.nextFloat();
		System.out.println("Enter Year");
		float year = sc.nextFloat();
		System.out.println("Actual Amount Per Annual :- "+NetLoanAmount(actualAmount,rate,year));
	}
}
