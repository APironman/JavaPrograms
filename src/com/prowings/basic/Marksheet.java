package com.prowings.basic;

import java.util.Scanner;
class Marksheet
{
	public static float marks(int sub1, int sub2,int sub3, int sub4,int sub5)
	{
		int res = sub1+sub2+sub3+sub4+sub5;
		float avg = res/5f;
		return avg;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int e= sc.nextInt();
		System.out.println(marks(a,b,c,d,e)+"  Marks out of 100 ");
	}
}