package com.prowings.basic;

import java.util.Arrays;

public class AdditionOfArray {

	public AdditionOfArray() {
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int[] nums1 = { 4, 5, 6, 7 };

		int[] result = additionOfArray(nums, nums1);
		for (int n : result)
			System.out.print(n + " ");
	}

	static int[] mergeArray(int[] additionOfArray, int[] nums, int nums1[], int size) {
		int[] mergedArray = additionOfArray;
		for (int i = nums.length; i < size; i++) {
			mergedArray[i] = nums1[i];
		}

		return mergedArray;
	}

	private static int[] additionOfArray(int[] nums, int[] nums1) {
        int size = 0;
		if (nums.length > nums1.length)
			size = nums.length;
		else
			size = nums1.length;

		int[] additionOfArray = new int[size];
		System.out.println(Arrays.toString(additionOfArray));
		for (int i = 0; i < additionOfArray.length; i++) {
			int num1 = i < nums.length ? nums[i] : 0;
			int num2 = i < nums1.length ? nums1[i] : 0;
			additionOfArray[i] = num1 + num2;
		}
		return additionOfArray;
	}

}