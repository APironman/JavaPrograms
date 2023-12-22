package com.prowings.basic_programs;

public class Student {

	int roll;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll) {
		super();
		this.roll = roll;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + "]";
	}
}
