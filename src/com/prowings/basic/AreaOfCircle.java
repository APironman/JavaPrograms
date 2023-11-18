package com.prowings.basic;

import java.util.Scanner;
class AreaOfCircle
{
	public static double area(float radius)
	{
		double j = Math.PI * Math.pow(radius, 2);
	    return j;
	}
	public static double circumference(float radius)
	{
	  double f = 2 * Math.PI * radius;
      return f;	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		float radius = sc.nextFloat();
		System.out.println("Area Of Circle :- "+area(radius));
		System.out.println("Circumference Of Circle :- "+circumference(radius));
	}
}