package com.search;

import java.util.HashSet;

//888. Fair Candy Swap
public class CandyShare {
	 public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	      int[] result= new int[2];
	        int sumA=0, sumB=0;
	        HashSet<Integer> set = new HashSet<>();
	        
	       for (int a: aliceSizes) sumA += a;
	        for (int b:bobSizes ){ sumB += b; set.add(b); }
	        
	        int totSum = (sumB - sumA) /2;
	        
	        for (int a: aliceSizes){
	            if (set.contains(a + totSum)){
	                result[0] = a;
	                result[1] = a + totSum;
	            }
	        }
	        return result;
	    }
}
