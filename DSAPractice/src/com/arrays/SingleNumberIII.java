package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		/*
		 * Given an integer array nums, in which exactly two elements appear only once
		 * and all the other elements appear exactly twice. Find the two elements that
		 * appear only once. You can return the answer in any order.
		 * 
		 * You must write an algorithm that runs in linear runtime complexity and uses
		 * only constant extra space.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [1,2,1,3,2,5] Output: [3,5] Explanation: [5, 3] is also a valid
		 * answer.
		 */

		Map<Integer, Integer> map = new LinkedHashMap<>();
		int[] list = new int[2];

		for (int i = 0; i <= nums.length - 1; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int Key = 0;
		int j = 0;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			Key = m.getKey();
			int Value = m.getValue();
			if (Value == 1) {
				list[j] = Key;
				j++;
			}
		}
		return list;
	}

}
