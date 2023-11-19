package com.prowings.stringAssignments;

import java.util.Scanner;

public class CountVowels {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Word");
		String word = sc.next();
		word = word.toLowerCase();
		System.out.println("There are " + countVowels(word) + 
				" Vowels in above Word");
	}

	private static int countVowels(String word) {
		int count = 0;
		for(int i =0;i<word.length();i++)
		switch(word.charAt(i)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
		}
		return count;
	}

}
