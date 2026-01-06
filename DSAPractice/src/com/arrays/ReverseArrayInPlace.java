package com.arrays;

import java.util.Arrays;

public class ReverseArrayInPlace {
	public static void main(String args[]) {
		String[] names = { "John", "Jammy", "Luke" ,"Loosy"};
		System.out.println("original array: " + Arrays.toString(names));
		// reversing array with three elements 
		reverse(names);
		System.out.println("reversed array: " + Arrays.toString(names));
		
		String[] names1 = { "John", "Jammy", "Luke" ,"Loosy", "Ravi"};
		System.out.println("original array: " + Arrays.toString(names1));
		// reversing array with three elements 
		reverse(names1);
		System.out.println("reversed array: " + Arrays.toString(names1));
		
		
		String[] test = { "John" };
		System.out.println("original array: " + Arrays.toString(test));
		// testing reverse array function with array of just one element reverse(test);
		System.out.println("reversed array: " + Arrays.toString(test));
	}

	public static void reverse(String[] array) {
		if (array == null || array.length < 2) {
			return;
		}
		int l = 0 , r = array.length -1;
		while (l < r) {
			String temp = array[l];
			array[l] = array[r]; 
			array[r] = temp;
			l++;
			r--;
		}
		/*
		 * for (int i = 0; i < array.length / 2; i++) { String temp = array[i]; array[i]
		 * = array[array.length - 1 - i]; array[array.length - 1 - i] = temp; }
		 */
	}
}
