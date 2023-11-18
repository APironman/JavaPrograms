package com.prowings.basic;

import java.util.Scanner;

public class ReverseString {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Any String");
		String s = sc.nextLine();
		System.out.println("Original String :- "+s);
		System.out.println("Reverse String :- "+reverseString(s));
	}

	private static String reverseString(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}
}