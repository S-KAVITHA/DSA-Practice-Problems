package com.arrays;

public class KarrayRotate {
	/*Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

Example 1:

Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
	 */

	 int findKRotation(int a[], int n) {
		 int rotate=0;
         for(int i=0;i<n-1;i++){
            
        if(a[i]>a[i+1])
         rotate = i+1;
        
    }
    // System.out.println(rotate);
    if (rotate > 0)
    return rotate ;
    else
    return 0;
    }
}
