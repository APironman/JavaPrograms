package com.prowings.basic;

import java.util.Scanner;
class NetAmountCalculator
{
	public static double calculatGST(int ogAmount)
	{
		return ogAmount*18 / 100;
	}
	public static double netAmount(int ogAmount,double GSTAmount)
	{
		return ogAmount+GSTAmount;
	}
	public static void main(String[] arsgs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int ogAmount = sc.nextInt();
		double GSTAmount = calculatGST(ogAmount);
        System.out.println("GST Amount :- "+GSTAmount);
        System.out.println("Net Amount :- "+netAmount(ogAmount,GSTAmount));
	}
}