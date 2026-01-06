package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String args[]) {


		String[] s1 = new String[] { "flower","flow","flight"};
		String res = longestCommonPrefix(s1);

		System.out.print("Answer " + res + " ");
		
		int[] nums = {1,1,1,2,2,3};
		System.out.println(topKFrequent(nums,2));

	}
	
	 public static int[] topKFrequent(int[] nums, int k) {
	      List<Integer> result = new ArrayList<>();
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int maxfreq = 0;
	        
	        for (int num:nums){
	            int freq = map.getOrDefault(num,0)+1;
	            
	            map.put(num,freq);
	            maxfreq = Math.max(maxfreq,freq);
	            
	        }
	        
	         List<Integer>[] bucket = new ArrayList[maxfreq + 1];
	 
	      for(int n : map.keySet()) {
	          int freq = map.get(n);
	 
	          if(bucket[freq]==null)
	              bucket[freq] = new ArrayList<>();
	 
	              bucket[freq].add(n);
	       }
	 
	       int[] resultArr = new int[k];
	       int count = 0;
	 
	       //Pick top k elements
	       for(int i = bucket.length-1; i >= 0; i--) {
	           if(bucket[i]!=null){
	               for (int n : bucket[i]) {
	                   resultArr[count++] = n;
	 
	                   if (count == k)  
	                          return resultArr;
	         }
	      }
	 }
	 
	       return resultArr;   
	    }
	 
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs == null || strs.length == 0) return "";
		    String prefix = strs[0];

		    for (int i=1 ; i < strs.length ; i++){
		    	System.out.println(strs[i].indexOf(prefix));
		        while (strs[i].indexOf(prefix) != 0){
		            prefix = prefix.substring(0,prefix.length()-1);
		            if (prefix.isEmpty()) return "";
		        }
		    }
		    return prefix;
		    }
	 
}
