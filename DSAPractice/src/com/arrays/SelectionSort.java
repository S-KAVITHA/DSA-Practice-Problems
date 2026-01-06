package com.arrays;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) {
		// o( n2)
		int[] array = { 6, 5, 12, 10, 9, 1 };

		SelectSort(array,6);

	}

	private static void SelectSort(int[] a, int n) {

		for (int i = 0; i < n; i++) {
			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}
			if (min != i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}

		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(a));
	}

}
