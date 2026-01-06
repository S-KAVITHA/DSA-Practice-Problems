package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TwoSum {

	public static void main(String args[]) {
		int[] nums = {2,11,15,7};
		int target =9;
		int[] res = twoSum(nums,target);
		 for (int i=0;i<=res.length-1;i++){
		System.out.print("Answer " + res[i] + " ");
		 }
		
		int target1 =0;
		int[] nums1 = {6, 1, 8 ,0, 4 ,-9, -1 ,-10 ,-6, -5};
		 ArrayList<ArrayList<Integer>> res1 = twoSum3(nums1,target1);	
		 System.out.print("Answer " + res1 + " ");
		 
	}

	public static int[] twoSum1(int[] nums, int target) {
		// Optimized

		// int[] empty = new int[1];
		// empty[0] = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int numDiff = 0;
			numDiff = target - nums[i];
			if (map.containsKey(numDiff)) {

				return new int[] { map.get(numDiff), i };
			} else {
				map.put(nums[i], i);

			}
		}

		return new int[] { 0, 0 };
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] empty = new int[1];
		empty[0] = 0;

		for (int i = 0; i <= nums.length - 1; i++) {

			for (int j = i + 1; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { nums[i], nums[j] };
				}
			}
		}
		return empty;
	}

	public static ArrayList<ArrayList<Integer>> twoSum3(int[] nums, int target) {

		 ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> tempres = new ArrayList<Integer>();

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < nums.length; i++) {
				int numDiff = 0;
				numDiff = target - nums[i];
				if (map.containsKey(numDiff)) {
					tempres.add(nums[i]);
				    	tempres.add(numDiff);
	                    									
						
				} else {
					map.put(nums[i], i);

				}
				
			}
			res.add(tempres);
			return res;
			
		/*
		 * ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		 * ArrayList<Integer> tempres = new ArrayList<Integer>();
		 * 
		 * for (int i = 0; i < arr.length-1; i++) { for (int j = 1; i < arr.length; j++)
		 * { if (arr[i] + arr[j] == 0) { tempres.add(arr[i]); tempres.add(arr[j]);
		 * res.add(tempres); return res; } }
		 * 
		 * } return res;
		 */
	}

}
