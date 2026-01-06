package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CountFreq {
	static int countFreq(int[] arr, int target) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {

			// If the current element is equal to
			// target, increment the result
			if (arr[i] == target)
				res++;
		}

		return res;
	}

	static int countFreqMap(int[] arr, int target) {
		int res = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getKey() == target) {
				res = entry.getValue();
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		
		int[] arr = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int target = 2;
		Arrays.sort(arr);
		System.out.println(countFreq(arr, target));

		System.out.println(countFreqMap(arr, target));
	}
}