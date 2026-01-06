package com.crackcoding;

import PracticePgms.SysoutPgm;

public class StringRotation {
	public static void main(String[] args) {
		/*
		 * String s1 = "abcde"; String s2 = "cdeaf"; String s3 = s1 + s2; int fl = 0;
		 * for (int i = 0; i < s3.length() - 1; i++) { String s4 = s3.substring(i,
		 * s3.length()); if (s4.equals(s2)) { fl = 1; System.out.println("yes");
		 * 
		 * } } if (fl == 0) System.out.println("no"); else System.out.println("yes");
		 */
		String s = "aab";
		String goal = "baa";
		int l1 = s.length();
		int l2 = goal.length();
		int flag =0;
		// temp.contains(goal)   simple solution 
		if (l1 != l2)
			System.out.println("no");
		
		
		 int len1 = s.length();
	        int len2 = goal.length();
	       
	        
	        if (len1 != len2) System.out.print("no");
	     
	        
	        for (int i=1; i< len1 ; i++){
	        	 System.out.println(s.substring(i,len1));
	        	 
	        	 System.out.println(s.substring(0,i));
	           String res = s.substring(i,len1)+ s.substring(0,i);
	           System.out.println(res+"::::::::::");	
	            if (res.equals(goal)) flag  = 1;
	        }
	        
	        if (flag == 1) System.out.print("yes");
			else System.out.print("no");
		
	}

}
