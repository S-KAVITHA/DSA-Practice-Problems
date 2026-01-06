package com.arrays;

import java.util.Arrays;

public class MergeSort1 {
	

	static void divide(int array[], int si, int ei) {

		if (si >= ei)
			return;

		int mid =(si + ei) / 2;

		divide(array, si, mid);
		divide(array, mid + 1, ei);

		conquer(array, si, mid, ei);

	}

	public static void main(String args[]) {
		//o(log n)
				 int arr[]={6,3,9,5,2,8};
			        int n=arr.length;
			        divide(arr,0,n-1);
			        for (int i=0;i<n ;i++ ){
			            System.out.print(arr[i]+" ");
			        }

			}
	static void conquer(int arr[], int si, int mid, int ei) {
		
		System.out.println(si + " " + ei);
		 int merged[]=new int [ei-si+1];
	        int idx1=si;
	        int idx2=mid+1;
	        int x=0;
	        while(idx1<= mid && idx2<=ei){
	            if(arr[idx1] <= arr[idx2]) {

	                merged [x++] = arr[idx1++];
	            }  else{
	                merged [x++] = arr[idx2++];
	            }
	        }
	        while(idx1 <= mid) {
	         merged [x++] = arr[idx1++];
	        }
	        while(idx2 <= ei) {
	            merged [x++] = arr[idx2++];
	        }
	      //  System.out.println(merged.length);
	        for(int i=0, j=si; i<merged.length; i++,j++){
	        	 // System.out.print(i+" "+j);
	        	 // System.out.println(" ");
	            arr[j] = merged [i];
	        }
	}
}
