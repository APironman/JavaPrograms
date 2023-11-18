package com.prowings.basic;

import java.util.Arrays;

public class FilterEvenOrOddNumbers {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 6 };
		int[] even = arrayOfEven(nums);
		System.out.println("Even Numbers : " + Arrays.toString(even));
		int[] odd = arrayOfOdd(nums);
		System.out.println("Odd Numbers : " + Arrays.toString(odd));
	}

	public static int[] arrayOfOdd(int[] nums) {
		int count = 0;
		int i = 0;
		int[] result = new int[nums.length];
		for (i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			if (nums[i] % 2 != 0) {
				result[count] = nums[i];
				count++;
			}
		}
		return result;
	}

	public static int[] arrayOfEven(int[] nums) {
		int count = 0;
		int i = 0;
		int[] result = new int[nums.length];
		for (i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			if (nums[i] % 2 == 0) {
				result[count] = nums[i];
				count++;
			}
		}
		return result;
	}
}
