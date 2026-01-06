package com.arrays;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]) {
//o(log n)
		int[] array = { 6, 5, 12, 10, 9, 1 };

		mergeSort(array);

		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(array));
	}

	static void mergeSort(int array[]) {

		int length = array.length;
		if (length <= 1)
			return;

		int mid = (length) / 2;

		int L[] = new int[mid];
		int R[] = new int[length - mid];
		int i = 0, j = 0;
		for (; i < length; i++) {
			if (i < mid)
				L[i] = array[i];
			else {
				R[j] = array[i];
				j++;
			}
		}

		mergeSort(L);
		mergeSort(R);

		merge(L, R, array);

	}

	static void merge(int L[], int R[], int array[]) {
//88. Merge Sorted Array leetcode sol . 
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;

		int i, l, r;
		i = 0;
		l = 0;
		r = 0;

		while (l < leftSize && r < rightSize) {
			if (L[l] < R[r]) {
				array[i] = L[l];
				i++;
				l++;
			} else {
				array[i] = R[r];
				r++;
				i++;
			}
		}
System.out.print(l + " "+r);
		while (l < leftSize) {
			array[i] = L[l];
			i++;
			l++;
		}

		while (r < rightSize) {
			array[i] = R[r];
			r++;
			i++;
		}
	}

}
