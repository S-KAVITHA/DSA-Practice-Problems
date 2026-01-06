package com.arrays;

public class InsertionSort {
	
	public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);

        insertionSort1(arr, arr.length);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
	
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	public void insertionSort(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}

	}

	public static void insertionSort1(int arr[], int n) {

		// smaller elem are placed in the front after compare.
		for (int i = 1; i < n; i++) {
			
			for (int j = i; j > 0; j--) {
				
				if (arr[j] au < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j - 1] = temp;
				}

				
			}

			
		}

	}

}
