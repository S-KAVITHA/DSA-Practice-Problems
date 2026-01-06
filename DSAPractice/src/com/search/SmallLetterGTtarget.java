package com.search;

public class SmallLetterGTtarget {
	//744. Find Smallest Letter Greater Than Target
	 public char nextGreatestLetter(char[] letters, char target) {
	     // for (char c: letters)
	       //     if (c > target) return c;
	       // return letters[0]; 
	        
	        
	      
	        
	       int ans = 0;
			int start = 0 , end = letters.length-1;
			
			while (start <= end ) {
				int mid = start + (end - start) / 2;
	            System.out.print(start);	
	            System.out.print(end);	
			
				
				if ( letters[mid]  >  target) {
					end = mid - 1;
				}else if(letters[mid]  <=  target) 
	                start = mid+1;
					
				
			}
//Note that the letters wrap around. 
			//["c","f","j"]
			//"j" ans is "c" so return the modulo to get first index
			return letters[start% letters.length];
	    }
}
