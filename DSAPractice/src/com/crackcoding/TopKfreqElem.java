package com.crackcoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKfreqElem {
	// 347. Top K Frequent Elements

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 2, 2, 3 };
		System.out.println(topKFrequent(nums, 2));

	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int maxfreq = 0;

		for (int num : nums) {
			int freq = map.getOrDefault(num, 0) + 1;

			map.put(num, freq);
			maxfreq = Math.max(maxfreq, freq);

		}

		List<Integer> bucket[] = new ArrayList[maxfreq + 1];

		for (int n : map.keySet()) {
			int freq = map.get(n);

			if (bucket[freq] == null)
				bucket[freq] = new ArrayList<>();

			bucket[freq].add(n);
		}

		int[] resultArr = new int[k];
		int count = 0;

		System.out.println(bucket[3]);
		// Pick top k elements
		for (int i = bucket.length - 1; i >= 0; i--) {
			if (bucket[i] != null) {
				for (int n : bucket[i]) {

					resultArr[count++] = n;

					if (count == k)
						return resultArr;
				}
			}
		}

		return resultArr;
	}
}
