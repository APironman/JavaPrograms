package com.prowings.basic;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		System.out.println("Before Merging");
    int[] one = {3,2,3,4};
    System.out.println(Arrays.toString(one));
    int[] two = {100,333,444,5,555,7777};
    System.out.println(Arrays.toString(two));
    
    System.out.println("After Merging");
    System.out.println(Arrays.toString(mergeArray(one,two)));
	}

	public static int[] mergeArray(int[] one, int[] two) {
       int[] mergeArray = new int[one.length+two.length];
       for(int i =0; i< one.length;i++)
       {
    	   mergeArray[i] = one[i];
       }
       int count = 0;
       for(int j =one.length; j< mergeArray.length;j++)
       {
		mergeArray[j] = two[count++];
       }
       return mergeArray;
	}

}
