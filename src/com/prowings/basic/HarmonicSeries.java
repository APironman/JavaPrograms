package com.prowings.basic;

public class HarmonicSeries {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(harmonicSeries(num));
	}

	private static double harmonicSeries(int num) {
		double sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += 1.0 / i;
		}
		return sum;
	}
}