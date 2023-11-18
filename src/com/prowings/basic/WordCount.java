package com.prowings.basic;

import java.util.Arrays;

public class WordCount {

	public WordCount() {
	}

	public static void main(String[] args) {

		String s1 = "A warm welcome to you all. I am here to deliver a speech on India. "
				+ "India is one of the ancient civilizations in the world and is also the "
				+ "7th largest country in the world. India is one of the best countries "
				+ "in the world for many reasons, acceptance of people of other religions, "
				+ "the closely bonded family culture, the biggest democratic nation, and "
				+ "the fastest-growing economy.    ";

		wordCounter(s1);
	}

	public static void wordCounter(String s1) {

		System.out.println(s1);
		String s = s1.trim().replaceAll("[-,.]", "");
		System.out.println(s);

		String[] words = s.split(" ");

		System.out.println(Arrays.toString(words));

		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];
			if (!currentWord.isBlank()) {
				int count = 1;
				for (int j = i + 1; j < words.length; j++) {
					if (currentWord.equalsIgnoreCase(words[j])) {
						count++;
						words[j] = "";
					}
				}
				System.out.println(currentWord + " : " + count);
			}
		}
	}
}