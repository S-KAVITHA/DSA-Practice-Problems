package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
	public static void main(String args[]) {
		int[] numbers;

		// initializing array after declaration
		numbers = new int[] { 1, 0, 1, 1 };

		System.out.println(containsNearbyDuplicate(numbers,1));
	}

	 public static boolean containsNearbyDuplicate(int[] nums, int k) {

		    HashMap<Integer,Integer> map = new HashMap<>();


		        for (int i=0 ;i<nums.length;i++){

		            /*if (map.containsKey(nums[i]) ) {
		            	int temp = i - map.get(nums[i]);
		            	if (temp <= k) {
		                return true;
		            	}else {
		            		map.put(nums[i],i);
		            	}*/
		        	
		        	 if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
		                 return true;
		            }else{
		                map.put(nums[i],i);
		            }
		           
		        }

		        return false;

		    }
	 
	public static boolean containsDuplicate(int[] nums) {

		//optimised below code failed 5cases
		if (nums.length == 0)
			return false;
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1])

				return true;

		}
		return false;

		/*
		 * if (nums.length == 0) return false; int j = 0; for (int i = 0; i <
		 * nums.length; i++) { for (j = i + 1; j < nums.length; j++) { if (nums[i] ==
		 * nums[j]) { System.out.print(nums[i] + " "); return true; } } } return false;
		 */

	}
}
