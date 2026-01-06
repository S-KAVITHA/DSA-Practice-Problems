package com.arrays;

public class BubbleSort {
	public static void main(String args[]) {
		// o( n2)
		int[] array = { 6, 5, 12, 10, 9, 1 };

		 for (int a:array) {
         	System.out.print(a + " ");
         }
         System.out.println(" ");
		Sort(array,6);

	}

	private static void Sort(int[] arr, int n) {
		 for (int i=0;i<n-1;i++){
	            for(int j=0;j < n-i-1;j++){
	                if (arr[j+1] < arr[j]){
	                    int temp = arr[j+1];
	                    arr[j+1] = arr[j];
	                    arr[j] = temp;
	                }	
	                
	                
	            }
	            
	            for (int a:arr) {
                	System.out.print(a + " ");
                }
                System.out.println(" " + i);
	        }
		
	}
}
