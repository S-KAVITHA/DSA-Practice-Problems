package com.crackcoding;

public class ValidPalinRemoveChar {
//make palindrome by deleting one char
	
	public static void main(String[] args) {

		String s = "abbca";
		System.out.println(validPalindrome(s));
		
	}
	 public static boolean validPalindrome(String s) {
	      
         int i = 0;
        int j = s.length() - 1;

        while (i < j) {
        if (s.charAt(i) != s.charAt(j)){
            return (ispalind(s,i+1,j) || ispalind(s,i,j-1)) ;
            
        }
        
            i ++;
            j--;
        }
          

        return true;
    }
    
    public static boolean ispalind(String s , int low , int high){
        
        while(low<high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low ++;
            high--;
        }
        
        return true;
    }
}
