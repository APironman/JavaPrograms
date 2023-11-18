package com.prowings.basic;

public class CheckDuplicateArray {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] num2 = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(isDuplicateArrayOrNot(num1, num2));

	}

	public static String isDuplicateArrayOrNot(int[] num1, int[] num2) {
		if (num1.length == num2.length) {
			for (int n = 0; n < num1.length; n++) {
				boolean res = num1[n] == num2[n];
				return "Array Is Duplicate";
			}
		}
		return "Array is Not Duplicate";
	}
}
