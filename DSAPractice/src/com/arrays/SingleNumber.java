package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumber {
/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
*/
	 public int singleNumber(int[] nums) {
         Map<Integer,Integer> map = new LinkedHashMap<>();
	        
	        for (int i=0;i<=nums.length-1;i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }
	         int Key = 0;
	        
	        for(Map.Entry<Integer,Integer> m: map.entrySet()){
	            Key = m.getKey();
	            int Value = m.getValue();
	            if (Value == 1){
	                return Key;
	            }
	        }
	        return Key;
    }	
	
}
