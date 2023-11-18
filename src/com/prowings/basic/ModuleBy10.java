package com.prowings.basic;

import java.util.Scanner;
class ModuleBy10
{
	public static int module10(int a)
	{
		int res = a % 10;
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		System.out.println("Any Num is Module By 10 :- "+module10(f));
	}
}