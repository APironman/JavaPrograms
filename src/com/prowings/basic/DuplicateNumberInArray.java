package com.prowings.basic;

import java.util.Arrays;

public class DuplicateNumberInArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 4, 5, 4, 6 };
		System.out.println(Arrays.toString(a));
		System.out.println("Duplicates Number Are :- ");

		findDuplicates(a);
	}

	public static int[] findDuplicates(int[] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println(a[i] + " ");

				}
			}
		}
		return a;
	}
}
