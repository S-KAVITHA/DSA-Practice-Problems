package com.arrays;

public class BinarySearch {

	static int binarysearch(int arr[], int n, int k) {
		int res = 0;
		int start = 0;
		int end = n;
		int midValue = end / 2;

		if (arr[0] == k)
			return start;

		if (arr[midValue] == k)
			return midValue;

		if (k < arr[midValue]) {
			for (start = 1; start < midValue; start++) {
				if (arr[start] == k) {
					res = start;
					break;
				}
			}
		} else {
			for (start = midValue; start < n; start++) {
				if (arr[start] == k) {
					res = start;
					break;
				}
			}
		}

		if (res > 0)
			return res;
		else
			return -1;
	}
	
	public static void main(String[] args)
    {
		 	        int a[] = { 2, 3, 4, 10, 40 };
	        int n = a.length;
	        int x = 10;
	      
	        int res;
			try {
				res = binarysearch(a, n, x);
				if (res == -1)
		            System.out.println("Element not present");
		        else
		            System.out.println("Element found at index " + res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        
	    }
    }
    

