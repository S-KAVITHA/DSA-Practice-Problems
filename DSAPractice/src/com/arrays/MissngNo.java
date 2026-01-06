package com.arrays;

public class MissngNo {
	
	public static void main(String args[]) {
		int[] nums = {3,0,1};
		System.out.print(MissingNumber(nums,3));
		
		int[] nums1 = {1, 2 ,3, 5};
		System.out.print(missingNumber(nums1));
	}
	
	 static int missingNumber(int arr[]) {
		    
		    	 
	      int n = arr.length + 1;      
	        
	      int res[] = new int[n+1];
	      for( int i=0; i<arr.length ;i++){
	          res[arr[i]]++;
	      }
	      
	    for( int i=1; i<=n ;i++){
	          if (res[i] == 0) return i;
	      }
	      
	      return -1;
	    }
	 
	    static int MissingNumber(int nums[], int n) {
			/*
			 * int sum = (n * (n+1) ) / 2; for(int i = 0; i < n ; i++) { sum = sum -
			 * array[i]; } return sum;
			 */
	    	int y = nums.length ;
	    	//System.out.print(y);
	        int result =(nums.length * (nums.length+1))/2;
	       
	        for(int i=0;i<=nums.length-1;i++){
	        	// System.out.print(nums[i]);
	            result -= nums[i];
	           // System.out.print(result);
	        }
	      
	        return result  ;
	    }
	
}
