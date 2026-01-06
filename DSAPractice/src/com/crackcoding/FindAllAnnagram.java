package com.crackcoding;

import java.util.ArrayList;
import java.util.Arrays;


public class FindAllAnnagram {

	//438. Find All Anagrams in a String
	
	 public List<Integer> findAnagrams(String s, String p) {
	   // time limit exceeded    
List<Integer> res = new ArrayList<>();
		 
		 char[] pArr = p.toCharArray();
		 Arrays.sort(pArr);
        
		 for(int i=0; i<=s.length() - p.length();i++) {
			 char[] temp= s.substring(i, i+p.length()).toCharArray();
			 
			 Arrays.sort(temp);
			 if (Arrays.equals(pArr,temp)) 
				 res.add(i);
			 
		 }
		 
		 return res; 
	    }
	 
}
