package com.prowings.basic;

import java.util.Scanner;

public class GradeCalculator {
	static Scanner sc = new Scanner(System.in);

	public static String gradeCalculator(int[] marks) {

		int sum = 0;
		for (int m : marks) {
			System.out.println("Enter Marks Of Subject");
			m = sc.nextInt();
			if (m >= 0 && m <= 100) {
				sum += m;
			} else
				return "Invalid Marks";
		}
		System.out.println(sum);
		float avg = 0;
		avg = sum / marks.length;
		System.out.println(avg);
		if (avg > 0 && avg <= 35) {
			return "Fail";
		}
		if (avg > 35 && avg <= 60) {
			return "Pass";
		}
		if (avg > 61 && avg <= 80) {
			return "First Class";
		}
		if (avg > 81 && avg <= 100) {
			return "Distinction";
		}
		return "Invalid Grades";
	}

	public static void main(String[] args) {
		System.out.println("Enter How many Subject are there");
		int intArray = sc.nextInt();

		int[] marks = new int[intArray];

		System.out.println(gradeCalculator(marks));
	}

}
