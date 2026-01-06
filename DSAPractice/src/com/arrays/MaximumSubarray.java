package com.arrays;

public class MaximumSubarray {
	// 53. find longest sub array with largest sum and return sum

	public static void main(String args[]) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.print(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE, currentSum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;

		/*
		 * int res = nums[0]; int total = 0;
		 * 
		 * for (int n : nums) { if (total < 0) { total = 0; }
		 * 
		 * total += n; res = Math.max(res, total); } return res;
		 */
	}
}

  int maxSum = Integer.MIN_VALUE, currentSum = 0; 
  for (int i = 0; i <
  nums.length; i++) { 
	  currentSum = currentSum + nums[i]; 
	  maxSum =  Math.max(maxSum, currentSum); 
	  if (currentSum < 0)currentSum = 0; 
	  } 
  return  maxSum;
 

// Given an array containing N integers and an integer K., Your task is to find
// the length of the longest Sub-Array with the sum of the elements equal to the
// given value K.
