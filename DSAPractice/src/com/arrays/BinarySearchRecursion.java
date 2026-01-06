package com.arrays;

public class BinarySearchRecursion {
	public static void main(String[] args) {
		int arr[] = {  12, 40,50,72,89 };
		int n = arr.length;
		int start = 0;
		int end = n-1;
		int k=89;
		System.out.print(binarysearch(arr,start,end,k));
		
	}
	
	static int binarysearch(int arr[], int start, int end, int k) {
		
		int midValue = start +(end - start) / 2;

		if (start > end) return -1;
		
		if (arr[midValue] == k)
			return midValue;

		if (k < arr[midValue]) {
			//System.out.println(binarysearch(arr, start, midValue-1,  k));
			return binarysearch(arr, start, midValue-1,  k);
		} else {
			//System.out.print(binarysearch(arr,  midValue+1,end,  k));
			return binarysearch(arr,  midValue+1,end,  k);
		}

		
	}
}
