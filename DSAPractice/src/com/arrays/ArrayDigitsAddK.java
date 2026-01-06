package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDigitsAddK {
/* The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
*/
	public static void main(String args[]) {
		int[] numbers;

		// initializing array after declaration
		numbers = new int[] { 1, 2, 9 };
		ArrayList<Integer> list = new ArrayList<>();
		list = (ArrayList<Integer>) plusK(numbers, 5);
		//System.out.println(Arrays.toString(sol));
	}

	public static List<Integer> plusK(int[] digits, int k) {

		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;
		for (int i = digits.length-1; i >= 0; i--) {
			digits[i] = digits[i] + (k % 10) + carry ;
			list.add(digits[i] % 10);
			carry = digits[i] / 10;
			k = k /10;
		}
		// 574 + 781 = 1355 so below code need to show 1355 else 355 will be returned
		k = k + carry ; // carry for last no shd be added in the front..
		while (k != 0) {
			list.add(k%10);
			k/=10;
		}
	
		Collections.reverse(list);
		
		return list;
	}
}
