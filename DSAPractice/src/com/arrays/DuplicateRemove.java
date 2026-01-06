package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String args[]) {
		int[] numbers;

		// initializing array after declaration
		numbers = new int[] { 1, 1, 2, 3};

		System.out.println(removeDuplicates(numbers));
	}

	public static int removeDuplicates(int[] nums) {
//simple solution Remove Duplicates from Sorted Array only to  find count 

		if (nums.length == 0) // 0
			return 0;
		int j = 0;
		for (int i = 1; i < nums.length; i++) { // iterate to check the duplicate element
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}

		}
		System.out.print(Arrays.toString(nums));
		return j + 1;
	}

	/*
	 * int n = nums.length; int[] temp = new int[n];
	 * 
	 * 
	 * 
	 * int j = 0; for (int i = 0; i < n - 1; i++) { if (nums[i] != nums[i + 1]) {
	 * temp[j] = nums[i]; j++; } } temp[j] = nums[n-1];
	 * System.out.print(Arrays.toString(temp)); return j+1;
	 */

	/*
	 * Map<Integer,Integer> map = new LinkedHashMap<>(); int[] result = new
	 * int[nums.length];
	 * 
	 * for(int i=0;i<=nums.length-1;i++){
	 * map.put(nums[i],map.getOrDefault(nums[i],0)+1); } int j=0;
	 * for(Map.Entry<Integer,Integer> a: map.entrySet()){ result[j] =a.getKey();
	 * j++; } System.out.print(Arrays.toString(result)); return result;
	 */

	/*
	 * ArrayList<Integer> primes = new ArrayList<Integer>(); primes.add(2);
	 * primes.add(3); primes.add(5); primes.add(3); primes.add(5);
	 * 
	 * System.out.println("list of prime numbers : " + primes);
	 * 
	 * 
	 * Set<Integer> removeDuplicate = new LinkedHashSet<Integer>(primes);
	 * primes.clear(); primes.addAll(removeDuplicate);
	 * 
	 * System.out.println("Duplicate removal : " + removeDuplicate);
	 */
}
