package com.prowings.basic;

import java.util.Scanner;

public class StringPalindrome {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter String");
		String original = sc.next();
		System.out.println(isPalindromeOrNot(original));

	}

	public static String isPalindromeOrNot(String original) {
		String duplicate1 = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			duplicate1 += original.charAt(i);
		}
		if (original.equals(duplicate1))
			return "String is Palindrome";
		else
			return "String is Not Palindrome";
	}

}
