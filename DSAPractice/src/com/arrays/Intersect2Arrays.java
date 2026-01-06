package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Intersect2Arrays {
	 public int[] intersect(int[] nums1, int[] nums2) {
	        
	        int length1 = nums1.length;
	        int length2 = nums2.length;
	        int tempLen = 0;
	        
	        if (length1 < length2) tempLen = length2;
	        else tempLen= length1;
	        
	        HashMap<Integer, Integer> map = new LinkedHashMap<>();
	        List<Integer> res = new ArrayList<>();
	        
	        for(int i=0;i<=length1-1;i++){
	            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
	        }
	        int cnt = 0;
	        for(int j=0; j<=length2-1;j++){
	            if (map.containsKey(nums2[j])){
	               int getCntr = map.put(nums2[j],map.getOrDefault(nums2[j],0));
	                if (getCntr>0) {
	                res.add(nums2[j]);
	                map.put(nums2[j],getCntr-1);
	                cnt++;
	                }
	            }
	        }
	        
	            	    int count[] = new int[res.size()];
	            	    for (int i =0; i< res.size(); i++) {
	            	        count[i] = res.get(i);
	            	    }
	            	    return count;
	    }
}
