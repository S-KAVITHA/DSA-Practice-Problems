package com.arrays;

public class LeapNo {
 
		public static void main(String[] args) {    
		    int year=2028;    
		    if(((year % 4 ==0)|| (year % 400==0)) && (year % 100 !=0)) {  
		        System.out.println("LEAP YEAR");  
		    }  
		    else{  
		        System.out.println("COMMON YEAR");  
		    }  
		}    
		}    

