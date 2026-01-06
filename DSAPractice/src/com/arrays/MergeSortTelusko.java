package com.arrays;


public class MergeSortTelusko {

	 static void divide(int[] ar, int l, int r) {
	        if (l < r) {
	            int mid = (l + r) / 2; 
	            divide(ar, l, mid); // Sort the left half
	            divide(ar, mid + 1, r); // Sort the right half
	            conquer(ar, l, mid, r); // Merge the sorted halves
	        }
	    }

	    static void conquer(int[] ar, int l, int mid, int r) {
	        int n1 = mid - l + 1;
	        int n2 = r - mid;
	        int[] leftArr = new int[n1];
	        int[] rightArr = new int[n2];

	        for (int i = 0; i < n1; i++) {
	        	leftArr[i] = ar[l + i];
	        }
	        for (int i = 0; i < n2; i++) {
	        	rightArr[i] = ar[mid + 1 + i];
	        }

	        int i = 0, j = 0, k = l;

	        while (i < n1 &&  j < n2) {
	            if (leftArr[i] <= rightArr[j]) {
	                ar[k] = leftArr[i];
	                i++;
	            } else {
	                ar[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            ar[k] = leftArr[i];
	            k++;
	            i++;
	        }

	        while (j < n2) {
	            ar[k] = rightArr[j];
	            k++;
	            j++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] ar = {12, 1, 23, 57, 27, 37, 3, 8, 9, 17, 72};

	        System.out.println("Original array:");
	        for (int e : ar) {
	            System.out.print(e + " ");
	        }
	        System.out.println();

	        divide(ar, 0, ar.length - 1);

	        System.out.println("\nSorted array:");
	        for (int e : ar) {
	            System.out.print(e + " ");
	        }
	    }
	}

