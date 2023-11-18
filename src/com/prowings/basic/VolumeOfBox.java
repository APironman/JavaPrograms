package com.prowings.basic;

import java.util.Scanner;
class VolumeOfBox
{
	public static float volume(float length, float breadth, float height )
	{
		return length*breadth*height;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		float l = sc.nextFloat();
		System.out.println("Enter Breadth");
		float b= sc.nextFloat();
		System.out.println("Enter Height");
		float h= sc.nextFloat();
		System.out.println("Volume of Box is :- "+volume(l,b,h));
	}
}