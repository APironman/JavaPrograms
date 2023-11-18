package com.prowings.basic;

class AreaOfTriangle
{
	public static String areaOfTriangle(float height, float base)
	{
		float res = (height*base) / 2;
		System.out.println(res);
		String s = String.valueOf(res);
		return s;
	}
	public static void main(String[] args)
	{
		String st = areaOfTriangle(4f, 5f);
		System.out.println(st instanceof String);
		double d = Double.parseDouble(st);
		System.out.println(d);
	}
}
		