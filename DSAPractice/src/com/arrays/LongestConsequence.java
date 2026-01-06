package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsequence {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0, 1 };
		int res = (longestConsecutive(nums));

		System.out.println(res);

	}

	public static int longestConsecutive1(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		int currentCount = 1, lonCount = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				if (nums[i] == nums[i - 1] + 1) {
					currentCount++;
				} else {
					lonCount = Math.max(lonCount, currentCount);
					currentCount = 1;
				}
			}
		}

		return Math.max(currentCount, lonCount);
	}

	public static int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		HashSet<Integer> set = new HashSet<>();

		for (int n : nums) {
			set.add(n);
		}
		int longCount = 0;

		for (int res : set) {
			//if (!set.contains(res - 1)) {
				int currentCount = 1;
				int currentNum = res;

				while (set.contains(currentNum + 1)) {
					currentCount++;
					currentNum++;
				}
				longCount = Math.max(currentCount, longCount);
			//}
		}
		return longCount;
	}
}
