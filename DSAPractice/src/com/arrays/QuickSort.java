package com.arrays;

import java.util.Arrays;

public class QuickSort {
	//best o(n logn)
	//avg case o(n logn)
	//worst o(n^2)
	
	public static void main(String args[]) {
		int arr[] = {  7, 9 ,8,10 };
		int n = arr.length;

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		 int n1 = arr.length;
	        for (int i=0; i<n1; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	}

	private void sort(int[] arr, int start, int end) {
		
		if (end<= start) return;
		int pivot = partition(arr,start,end);
		sort(arr,start,pivot -1);
		sort(arr,pivot + 1 , end);
		
	}

	private int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = start - 1;
		
		for (int j = start ;j <= end -1 ; j++) {
			if (arr[j] < pivot) {
				 
				i++;
				 System.out.println(i+" "+j);
				int temp = arr[i];
				System.out.println(temp);
				System.out.println(arr[j]);
				arr[i] = arr[j];
				arr[j] = temp;
				System.out.println(temp);
				System.out.println(arr[j]);
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}
}
