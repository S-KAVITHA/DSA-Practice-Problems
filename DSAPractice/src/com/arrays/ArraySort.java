package com.arrays;

public class ArraySort {
	public static void ascSorting(int a[], int n) {

		int l = 0, mid = 0, h = a.length - 1;
		int temp = 0;
		while (mid <= h) {
			System.out.println(mid);
			if (a[mid] == 0) {
				temp = a[l];
				a[l] = a[mid];
				a[mid] = temp;
				l++;
				mid++;
			} else if (a[mid] == 1) {
				mid++;
			} else if (a[mid] == 2) {
				temp = a[h];
				a[h] = a[mid];
				a[mid] = temp;
				h--;
			}
		}

		/*
		 * int lo = 0; int hi = a.length- 1; int mid = 0, temp = 0; while (mid <= hi) {
		 * switch (a[mid]) { case 0: { temp = a[lo]; a[lo] = a[mid]; a[mid] = temp;
		 * lo++; mid++; break; } case 1: mid++; break; case 2: { temp = a[mid]; a[mid] =
		 * a[hi]; a[hi] = temp; hi--; break; } }
		 */
	}

	public static void print(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		
		
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 1, 0, 1, 2, 2 };
		int n = arr.length;
		ascSorting(arr, n);
		print(arr, n);
	}
}