package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FourSum {
	
	public static void main(String args[]) {
		int[] nums1 = {1,2};
		int[] nums2 = {-2,-2};
		int[] nums3 = {-1,2};
		int[] nums4 = {0,2};
		
		
		int res = fourSumCount(nums1,nums2,nums3,nums4);
	System.out.print("Answer " + res + " ");
		 
	}
	 public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
	      
	        Map<Integer,Integer> map = new HashMap<>();
	        
	        for (int i=0;i<nums1.length;i++){
	            for (int j=0;j<nums2.length;j++){
	                int sumAB = nums1[i] + nums2[j];
	                map.put(sumAB, map.getOrDefault(sumAB,0)+1);
	            }
	        }
	        int count = 0;
	             for (int i=0;i<nums3.length;i++){
	            for (int j=0;j<nums4.length;j++){
	                int sumCD = nums3[i] + nums4[j];
	                int sumAB = -sumCD;

	                 if (map.containsKey(sumAB)){
	                	 System.out.println( sumAB + " "+ map.get(sumAB)); 
	                	 System.out.println( ); 
	                    count += map.get(sumAB);
	                }
	            }
	        }
	         
	        return count;
	    }
	}