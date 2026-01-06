package com.search;

public class FirstLastPos {
//34. Find First and Last Position of Element in Sorted Array
	 public int[] searchRange(int[] nums, int target) {
		
			 int[] result = {-1,-1};
		        int first = search(nums, target, true);
		        int last = search(nums, target, false);
		        result[0]=first;
		        result[1]=last;
		        return result;
		        
		    }
		    
		    public static int search(int[] nums, int target, boolean isFirst){
		        
		    	 int ans = -1;
		    	    int start = 0;
		    	    int end = nums.length-1;
		    	    
		    	    while(start<=end){
		    	        int mid = start+(end-start)/2;
		    	        if(target>nums[mid]){
		    	            start=mid+1;
		    	        }else if(target<nums[mid]){
		    	            end=mid-1;
		    	        }else{
		    	            ans=mid;
		    	            if(isFirst){
		    	                end=mid-1;
		    	            }else{
		    	                start=mid+1;
		    	            }
		    	        }
		    	        
		    	    }
		    	    return ans;
		        
		    }
	 }
