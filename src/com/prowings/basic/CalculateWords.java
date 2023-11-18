package com.prowings.basic;

import java.util.Scanner;

public class CalculateWords {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Sentence");
		String s = sc.nextLine();
		calculateWords(s);
	}
	private static void calculateWords(String s) {
		String[] sar = s.split(" ");
		int count =0;
		for(String i : sar)
			count++;
		System.out.println("Total Words in Above Sentence : -"+'\n'+count);
	}
}