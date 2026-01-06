package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeating {
	public static int firstNonRepeating(int[] arr) {
		int res = 0;

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				res = entry.getKey();
				break;
			}

		}

		return res;
	}

	public static void main(String args[]) {

		int[] nums1 = { 4, -8, 1, -4, -3, -8, -3, -10, 3, -3, 10 };
		System.out.print(firstNonRepeating(nums1));
	}
}
