package com.prowings.basic_programs;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 50, 30, 40, 20, 10 };
		sortArray(array);
	}

	private static void sortArray(int[] array) {
		int[] dp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] >= array[j])
					continue;
				else
					dp[i] = array[i];
			}
		}
		System.out.println(Arrays.toString(dp));
	}
}