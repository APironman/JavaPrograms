package com.prowings.basic;

import java.util.Scanner;
class AreaOfRectangle
{
	public static int area(int side1, int side2 )
	{
		return side1*side2;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Side");
		int s1= sc.nextInt();
		System.out.println("Enter Second Side");
		int s2= sc.nextInt();
		System.out.println("Area of Rectangle :- "+area(s1,s2));
	}
}