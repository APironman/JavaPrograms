package com.prowings.basic;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = sc.nextInt();
		System.out.println(perfectNumber(num));
	}

	private static String perfectNumber(int num) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		int counter = 0;
		int[] factor = new int[count];
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				factor[counter++] = i;
		}
		System.out.println("Factors of "+num+" is :-"+'\n'+Arrays.toString(factor));
		int sum = 0;
		for (int n : factor)
			sum += n;
		System.out.println("Addition of Factors :- "+sum);
		return num == sum ? "Number Is Perfect" : "Number Is Not Perfect";
	}
}
