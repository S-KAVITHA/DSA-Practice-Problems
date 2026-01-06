package com.arrays;

public class PeakElement {

	public int peakElement(int[] a, int n) {

		/*
		 * An element is called a peak element if its value is not smaller than the
		 * value of its adjacent elements(if they exists). Given an array arr[] of size
		 * N, Return the index of any one of its peak elements. Note: The generated
		 * output will always be 1 if the index that you return is correct. Otherwise
		 * output will be 0.
		 * 
		 */
		int i;
		if (n == 1)
			return 0;
		if (a[0] > a[1])
			return 0;
		if (a[n - 1] > a[n - 2])
			return n - 1;
		else {
			for (i = 1; i < n - 1; i++) {
				if ((a[i] > a[i - 1]) && (a[i] > a[i + 1]))
					break;
			}
		}
		if (i == n)
			return -1;

		return i;

	}
	
	public static int peakIndexInMountainArrayBinay(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		   int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			
			// error outs if mid=last index and try to do + 1.
			// if mid = 0 and -1 will error out.
			// 
		/*if ((mid == 0 || nums[mid] > nums[mid + 1] )
				&& (mid == nums.length - 1  || nums[mid] > nums[mid - 1]))*/
		
		
		if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == nums.length - 1 || nums[mid + 1] <= nums[mid])) {
			return nums[mid];

			// if mid-1 is GT then it means mid cant be peak. mid -1 can be peak move
			// pointer.
		} else if (mid > 0 && nums[mid - 1] > nums[mid]) {
			end = mid - 1;
				
				
				//below stmt throws error if mid gets value of 0 and 0-1 throws exception.
				// else if (nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]) {
				
			//} else if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				
			}else
				start = mid + 1;
				
			
		}
		return -1;
	}
	
	/*
	 * public static int peakIndexInMountainArrayBinay(int[] nums) { int start = 0;
	 * int end = nums.length - 1;
	 * 
	 * while (start <= end) { int mid = start + (end - start) / 2; if (nums[mid] >
	 * nums[mid + 1] && nums[mid] > nums[mid - 1]) { return mid; } else if
	 * (nums[mid] < nums[mid + 1]) { //below stmt throws error if mid gets value of
	 * 0 and 0-1 throws exception. // else if (nums[mid] < nums[mid + 1] &&
	 * nums[mid] < nums[mid - 1]) { start = mid + 1; } else if (nums[mid] < nums[mid
	 * - 1] && nums[mid] > nums[mid + 1]) { end = mid - 1; } } return start; }
	 */
	
	public static void main(String args[]) {
		int arr1[] = { 1, 3, 20, 4, 0, 0 };
		System.out.println(peakIndexInMountainArrayBinay(arr1));
		
		int arr2[] = { 1, 13, 2, 4, 10, 0 };
		System.out.println(peakIndexInMountainArrayBinay(arr2));
		
		int arr[] = { 1, 1, 2, 4, 10, 0 };
		System.out.println(peakIndexInMountainArrayBinay(arr));
	}
	
}
