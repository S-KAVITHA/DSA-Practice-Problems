package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
		 /*
		  Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
		  */
		 
		 
	      Map<Integer,Integer> map = new LinkedHashMap<>();
	        
	        for (int i=0;i<=nums.length-1;i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }
	         int Key = 0;
	        int checkValue = (nums.length / 2);
	        for(Map.Entry<Integer,Integer> m: map.entrySet()){
	            Key = m.getKey();
	            int Value = m.getValue();
	            if (Value > checkValue){
	                return Key;
	            }
	        }
	        return Key;
	    }
	 
}
