package com.arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayFormInteger {
	class Solution {
	    public List<Integer> addToArrayForm(int[] num, int k) {
	      /* 
	       * test case failed
	       * 
	       * 
	       *  List<Integer> list = new ArrayList<>();
	        StringBuilder sb = new StringBuilder();
	        
	        
	for(int i=0;i<num.length;i++){    
	   sb.append(num[i]);
	}   
	      
	        int d = Integer.parseInt(sb.toString()) + k;
	          System.out.println(d);
	       
	      while (d > 0){
	         int remain = d % 10;
	   list.add(remain);
	          d = d / 10;
	} 
	       Collections.reverse(list) ;
	        return list;*/
	        
	        int carry = 0, sum;

	    List<Integer> list = new LinkedList<>();
	    
	    for(int i=num.length-1; i>-1; i--)
	    {
	        sum = carry + (k%10) + num[i];
	        list.add(sum%10);
	        carry = sum/10 ;
	        k =  k / 10;            
	    }
	    
	    int rest = k + carry;
	       // System.out.print(k);
	       // System.out.print(rest);
	    while(rest > 0)
	    {
	       
	        list.add(rest%10);
	       rest /= 10;
	    }
	    
	    Collections.reverse(list);    
	    return list;
	    Collections.reverse(list);    
	    return list;

	    
	    
	    }
	}
}
