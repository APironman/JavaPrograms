package com.prowings.basic_programs;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
//
		Integer i = 10;
		Integer j = 11;
		Float k = 1.0f;
		String s1 = "G";
		String s2 = "H";

		TreeSet ts = new TreeSet();
		ts.add(i);
		ts.add(j);
		ts.add(k);
//		ts.add(s2);
//		ts.add(s1);

		System.out.println(ts);
	}
}
