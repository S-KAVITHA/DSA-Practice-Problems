package com.arrays;

import java.util.Arrays;

public class Search2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

		int target = 5;

		// searchMatrixsearch(matrix, target);
		System.out.println("Brute Force: " + search(matrix, target));
		System.out.println("Staircase Search: " + searchSorted(matrix, target));
	}

	public static boolean search(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Brute Force Approach
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	// Optimized Approach for Sorted Matrix (Staircase Search)
	public static boolean searchSorted(int[][] matrix, int target) {

		int r = matrix.length;
		int c = matrix[0].length;
		boolean result = false ;
		for (int i = 0; i < r; i++) { // to Find particular row containing targeted element.

			if (matrix[i][0] <= target && target <= matrix[i][c - 1]) {

				// Search using binary search to improve the search in row.
				result = binarySearchRow(matrix[i], target);
			}
		}

		return result;
	}

	static boolean binarySearchRow(int[] arr, int key) {
		//return Arrays.binarySearch(row, target1);
		int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = high + low / 2;

            if (arr[mid] == key) {
                return true; // Key found, return the index
            } else if (arr[mid] < key) {
                low = mid + 1; // Key is in the right half
            } else {
                high = mid - 1; // Key is in the left half
            }
        }

        return false; // Key not found
	}

	// below is more optimal

	public static boolean searchMatrix(int[][] matrix, int target) {
		System.out.println(matrix);
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		int[] ans = matrix[0];
		for (int i = 0; i < numRows; i++) {
			System.out.println(matrix[i]);
			ans = matrix[i];
			if (target <= matrix[i][numCols - 1]) {
				break;
			}
		}

		for (int val : ans) {
			if (val == target) {
				return true;
			}
		}
		return false;

		// int r = matrix.length;
		// int c = matrix[0].length;

		// for(int i=0; i<r;i++) { // to Find particular row containing targeted
		// element.

		// if(matrix[i][0] <= target && target <= matrix[i][c-1]) {

		// Search using binary search to improve the search in row.
		// return search(matrix[i], target);
		// } }

		// return false;
	}

	// iterative binary search approach.
	private static boolean search(int[] arr, int target)

	{
		int low = 0;
		int high = arr.length - 1;

		while (high - low > 1) {
			int mid = (low + high) / 2;
			if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return (arr[low] == target || arr[high] == target);
	}

}
