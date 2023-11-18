package com.prowings.basic;

import java.util.Scanner;
class SolveExpression
{
	public static double expression(int X, int Y )
	{
		double res = (4*Math.pow(X,2)+5*Math.pow(Y,3)) / (2*X*Y);
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a= sc.nextInt();
		System.out.println("Enter Second Number");
		int b= sc.nextInt();
		System.out.println("Expression :- (4X^2+5Y^3)/2XY");
		System.out.println("The value of above expression is :- "+ expression(a,b));
	}
}