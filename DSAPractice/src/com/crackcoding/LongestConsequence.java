package com.crackcoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsequence {

	//128. Longest Consecutive Sequence
	/*Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
Therefore its length is 4.*/
	
	
	 public int longestConsecutive1(int[] nums) {
	        Set<Integer> numset = new HashSet<Integer>();
	        for (int num : nums) {
	        	numset.add(num);
	        }
/* for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }*/
	        int longcount = 0;

	        for (int num : numset) {
	            if (!numset.contains(num-1)) {
	                int currentNum = num;
	                int current = 1;

	                while (numset.contains(currentNum+1)) {
	                    currentNum += 1;
	                    current += 1;
	                }

	                longcount = Math.max(longcount, current);
	            }
	        }

	        return longcount;
	    }
	
	 public int longestConsecutive(int[] nums) {
	      if(nums.length<1) return 0;
	        
	        Arrays.sort(nums);
	       //  System.out.println(Arrays.toString(nums));
	        int ans=1;
	        int prev=nums[0];
	        int cur=1;
	        
	        for(int i=1;i<nums.length;i++){
	            
	             if(nums[i]==prev) continue;
	             if(nums[i]==prev+1){
	              cur++;
	            } else
	                 cur = 1;
	           
	          System.out.println(ans +" "+cur);
	            ans=Math.max(cur,ans);
	            
	               prev=nums[i];
	               
	        }
	        return ans;   
	    }
	
}
