package com.prowings.basic_programs;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		Student s = new Student(10);
		Object[] obj = { 123, "abc", 'a', 0.0, s };
		System.out.println(Arrays.toString(obj));
	}
}
