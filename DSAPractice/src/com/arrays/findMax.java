package com.arrays;

public class findMax {
    public static  int findMax1(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
          
        	 if (arr[lo] <= arr[hi])
                 return arr[hi];
             
             int mid = (lo + hi) / 2;

             // The left half is sorted, the maximum must 
             // be either arr[mid] or in the right half.
             if (arr[mid] > arr[lo])
                 lo = mid;
             else
                 hi = mid - 1;
         }

         return arr[lo]; 
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 1, 2, 3, 4, 5};
        System.out.println(findMax1(arr));
    }
}