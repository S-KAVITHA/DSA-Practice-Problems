package com.crackcoding;

import java.util.HashMap;
import java.util.Map;

public class TopFeqReplace {
	//424. Longest Repeating Character Replacement
	
	  public int characterReplacement(String s, int k) {
	        
	      /*  StringBuilder res= new StringBuilder();
	        res.append(s.charAt(0));
	        
	       // List<String> temp = new ArrayList<>();
	        
	        int cnt =1;
	        
	        int right =1 , left = 0;
	        int tempCnt = 0;
	        
	        while (right<s.length()){
	           
	            if (s.charAt(left) != s.charAt(right)){
	                if (cnt <= k){
	                    res.append(s.charAt(left));
	                    cnt++;
	                    
	                }else
	                   break;
	             }else
	                  res.append(s.charAt(left));
	            
	            right++;
	            
	        }
	        
	        
	        return res.length();*/
		  
		  //optimal sol
		  
		  
	        HashMap<Character, Integer> map = new HashMap<>();
	        int maxCount = 0;
	        int left = 0;
	        int right = 0;
	        int res = 0;
	        while (right < s.length()) {
	            char curr = s.charAt(right);
	            int freq = map.getOrDefault(curr, 0);
	            maxCount = Math.max(freq + 1, maxCount);
	            map.put(curr, freq + 1);
	            int numberOfCurr = right - left + 1;
	            // number of char need to be changed more than k .move left bound
	            if (numberOfCurr - maxCount > k) {
	                char last = s.charAt(left);
	                map.put(last, map.get(last) - 1);
	                left++;
	            }
	            res = Math.max(res, right - left + 1);
	            right++;
	        }
	        return res;
	    }
}
