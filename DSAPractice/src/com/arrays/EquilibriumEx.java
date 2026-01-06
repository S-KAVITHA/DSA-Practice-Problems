package com.arrays;

public class EquilibriumEx {
	public static int findEquilibrium(int nums[], int n) {
		
		//724 pivot index
		 int total = 0 , sumCurrent = 0;

	     for(int num: nums)
	        total += num;

	    int prevSum = 0;
	    for (int i=0; i<nums.length; i++){
	      //right sum is exclude left sum and current elem.
	        int right = total-nums[i] - prevSum;
	        int left = prevSum;

	        prevSum += nums[i];

	        if(right == left)
	            return i;
	    }

	    return -1;
	}
}
