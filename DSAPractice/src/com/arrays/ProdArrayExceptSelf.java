package com.arrays;

public class ProdArrayExceptSelf {
//238. Product of Array Except Self

	public static void main(String[] args) {

		int[] nums = { 1, 1 };
		int[] res = (productExceptSelf(nums));
		for (int c : res)
		System.out.println(c);

	}

	public static int[] productExceptSelf(int[] nums) {

		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int resultmul = 1;
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					
					resultmul *= nums[j];
					result[i] = resultmul;
				}
			}
		}

		return result;

		/*
		 * int left[]= new int[nums.length]; int right[]= new int[nums.length]; int
		 * prod[]= new int[nums.length]; left[0]=nums[0];
		 * 
		 * right[nums.length-1]=nums[nums.length-1];
		 * 
		 * for(int i=1;i<nums.length;i++) { left[i]=left[i-1]*nums[i]; }
		 * 
		 * for(int i=nums.length-2;i>=0;i--) { right[i]=right[i+1]*nums[i]; }
		 * prod[0]=right[1]; prod[nums.length-1]=left[nums.length-2]; for(int
		 * i=1;i<nums.length-1;i++) {
		 * 
		 * prod[i]=left[i-1]*right[i+1]; } return prod; }
		 */
	}
}
