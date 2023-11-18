package com.prowings.basic;

import java.util.Arrays;

public class GeometricAverage {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		calculateGemoetricAverage(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Gemotric Average Of Above Array :- "+'\n' + calculateGemoetricAverage(array));
	}

	private static double calculateGemoetricAverage(int[] array) {
		double sum = 1.0;
		for (double i : array)
			sum *= i;
		System.out.println(sum);
		double result = Math.pow(sum, (1.0 / array.length));
		return result;
	}
}