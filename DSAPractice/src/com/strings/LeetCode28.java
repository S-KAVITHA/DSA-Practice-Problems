package com.strings;

public class LeetCode28 {

	 public static void main(String[] args) {
	       
	        System.out.println(strStr("leetcode","code"));
	        System.out.println(baseNeg2(13));
	        
	        }
	      
	 public static String baseNeg2(int n) {
		    
		    if (n == 0) return "0";
		    StringBuilder res = new StringBuilder();
		    while (n !=  0 )  {
		        if (n % 2 == 1) res.append(1);
		        else res.append(0);
		        n= n/2;
		    }
		    return res.toString();
		    }
	 
	 
	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0 || haystack.length() == 0)
			return -1;
		if (haystack.length() < needle.length())
			return -1;

		int j = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				int k = i;				
				while ( j < needle.length() &&  k < haystack.length() && (haystack.charAt(k) == needle.charAt(j))){
		           	k++;
					j++;
					if (j == needle.length())
						return i;
				}
			}
		}
		return -1;
	}
}
