
package com.crackcoding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "picture perfect picture perfect bad good picture perfect bad good";
		int[] freq = new int[str.length()];
		int i, j;
		String[] words = str.split(" ");

		int[] nums = { 1, 2, 0, 1 };
		containsNearbyDuplicate(nums, 3);

		// Converts given string into character array
		// char string[] = str.toCharArray();
		// System.out.println(string);
		/*
		 * HashMap<String, Integer> map = new LinkedHashMap<>(); for (i = 0; i <
		 * words.length; i++) {
		 * 
		 * // if(map.containsKey(string[i])) { // int count = map.get(string[i]);
		 * 
		 * map.put(words[i], map.getOrDefault(words[i], 0) + 1);
		 * 
		 * // } else // map.put(string[i], 1);
		 * 
		 * }
		 * 
		 * // Displays the each character and their corresponding frequency
		 * System.out.println("Characters and their corresponding frequencies"); for
		 * (Entry<String, Integer> m : map.entrySet()) {
		 * 
		 * System.out.println(m.getKey() + "-" + m.getValue()); }
		 */
	}

	private static void containsNearbyDuplicate(int[] nums, int k , t) {
		boolean flag = false;
		
		 HashMap<Integer,Integer> map = new HashMap<>();
	        
	        for (int i1 = 0; i1 < nums.length ; i1++) {
				 if (map.containsKey(nums[i1])) {
	                 
	                if((nums[i1] - map.get(nums[i1]) <= t  && (i1 - map.get(nums[i1])) <= k))
	                	System.out.println("tt");
	            
	            }else
	            map.put(nums[i1],i1);
	            
			}
	        
	       
	        
	       
	    }
	

	}
}