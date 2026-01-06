package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	public static void main(String[] args) {

		int[] nums = { 2,3,8,9,10 };
		int res = (threeSumClosest(nums,16));

		System.out.println(res);

	}
	
	 public static int threeSumClosest(int[] nums, int target) {

		 int minDifference = Integer.MAX_VALUE;
		    int resultSum =nums[0] + nums[1] + nums[2];;
		    int n = nums.length;
		    Arrays.sort(nums);
		    	  	  
		    for (int i = 0; i < n -2; i++) {
		        int l = i + 1; 
		        int r = n - 1; 

		        while (l < r) {
		            int curr_sum = nums[i] + nums[l] + nums[r];
		                if (curr_sum == target) {
		                	return curr_sum ;
		                }
		                else if (curr_sum < target) {
		                    l++;
		                }
		                else { 
		                    r--;
		                }				
						int diffToTarget =  Math.abs(curr_sum - target);
		                if ( diffToTarget < minDifference ){
		                    resultSum = curr_sum;
		                    minDifference = diffToTarget;
		                }
		        }   
		    }  
		        return resultSum;        
	    }
	 
	public static List<List<Integer>> threeSum(int[] arr) {
//duplicates not removed with arraylist set remove duplicates.
		
        if (arr == null || arr.length < 3) return new ArrayList<>();

        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
    	System.out.println(arr);
    	 
    	  
        for (int i = 0; i < n -2; i++) {
            int l = i + 1; 
            int r = n - 1; 

            while (l < r) {
                int curr_sum = arr[i] + arr[l] + arr[r];
                if (curr_sum == 0) {
                	List<Integer> tempRes = new ArrayList<>();
                	tempRes.add(arr[i]); 
                	tempRes.add(arr[l]);
                    tempRes.add(arr[r]);
                    res.add(tempRes);
                    l++;
                    r--;
                }
                else if (curr_sum < 0) {
                    l++;
                }
                else { 
                    r--;
                }
            }
        }
        return res;
    }
	
	 public static List<List<Integer>> threeSum1(int[] nums) {
	     
		    Set<List<Integer>> s = new HashSet<>();
		        Arrays.sort(nums);
		      //  List<Integer> temp = new ArrayList<>();
		        int sum=0;
		        for (int i = 0; i < nums.length - 2; i++) {
		           int start = i + 1;
		            int end = nums.length - 1;
		            while (start < end) {
		              sum = nums[start] + nums[end] + nums[i];
		               if (sum > 0)     
		                end--;
		                if(sum < 0)
		                start++;
		                 if(sum == 0){
		                   // temp.add(nums[start] , nums[end] , nums[i]);
		                     s.add(Arrays.asList(nums[i], nums[start], nums[end]));
		                      start++;
		                    end--;
		                }              
		                
		            }
		         }
		       
		        return new ArrayList(s);
		    }
}
