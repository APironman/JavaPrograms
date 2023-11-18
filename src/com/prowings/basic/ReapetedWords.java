package com.prowings.basic;

import java.util.Scanner;

public class ReapetedWords {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Sentence");
		String s = sc.nextLine();
		calculateWords(s);
	}

	private static void calculateWords(String s) {
		String[] og = s.split(" ");
		String[] sar = s.split(" ");
		int count = 0;
		for (int i = 0; i < sar.length; i++) {
			for (int j = 0; j < sar.length; j++) {
				if (sar[0].equals(og[j]))
					count++;
			}
			if (count >= 3)
				break;
			System.out.println("'" + sar[0] + "'" + " is repeated " + count + " times");
		}
	}
}