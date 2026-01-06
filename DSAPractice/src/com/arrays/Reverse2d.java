package com.arrays;

import java.util.*;

public class Reverse2d {
 
    /*function reverses the elements of the array*/
    static void reverse(Integer  myArray[])
    {
    	
    	
    	
    	    
    	System.out.println(" Array:" + Arrays.toString(myArray));
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.toString(myArray));
    }
 
     public static void main(String[] args)
    {
        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
        
        
		/*
		 * int[] oldArray = new int[]{1,1,0}; Integer[] newArray = new
		 * Integer[oldArray.length]; int i = 0; for (int value : oldArray) {
		 * newArray[i++] = Integer.valueOf(value); } System.out.println(" OldArray:" +
		 * Arrays.toString(oldArray)); System.out.println(" NewArray:" +
		 * Arrays.toString(newArray));
		 * 
		 * int j = 0; for (Integer value : newArray) { oldArray[j++] =
		 * (value).intValue(); } System.out.println(" OldArray:" +
		 * Arrays.toString(oldArray)); System.out.println(" NewArray:" +
		 * Arrays.toString(newArray));
		 * 
		 */
        
        
        
        int[][] res = new int[][] {{1,1,0},{1,0,3},{5,0,0}};
        for(int[] arr : res){
        	int j1 = 0;
        	Integer[] newArray1 = new Integer[arr.length];
            for (int value : arr) {
            	newArray1[j1++] = (value);
            }
        reverse(newArray1);
        }
    }
}