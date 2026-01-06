package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaxPopulationYr {

	public int maximumPopulation(int[][] logs) {

		int result = 0;
// leetcode 1854. Maximum Population Year
		// [[2006,2007],[2037,2038],[1971,1972],[1973,1974],[2001,2002],[1987,1988]]
		// Hashmap doesnot maitain insertion order . So the answer in this case : 2001
		// Treemap stores in key ascending order . ans = 1971
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int[] arr : logs) {

			// run for loop for all years from birth to death -1;

			for (int j = arr[0]; j < arr[1]; j++) {
				int y = 0;
				if (map.containsKey(j)) {
					y = map.get(j) + 1;
					map.put(j, y);
					System.out.println(y);
					result = Math.max(y, result);
				} else
					y = 1;
				map.put(j, y);
				result = Math.max(y, result);
			}

		}
		System.out.println(result);
		int max = 0, year = 0;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == result) {
				year = m.getKey();
				break;
			}
		}
		return year;

		// ==================================--------

		//solution 2:

		int[] map1 = new int[101];
		for (int[] arr : logs) {

			// run for loop for all years from birth to death -1;

			for (int j = arr[0]; j < arr[1]; j++) {
				map1[j - 1950]++;

			}

		}
		
		int max1 = 0, year1 = 0;
		for (int i = 0; i < 101; i++) {
			if (map1[i] > max1) {
				year1 = i + 1950;
				max1 = map1[i];
			}

		}
		return year1;

	}
}
