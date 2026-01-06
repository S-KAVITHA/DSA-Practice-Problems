package com.arrays;

public class Zero1s2sArray {
	 public static void sort012(int a[], int n)
	    {
	        int mid =0,low =0, high=n-1;
	        int temp = 0;
	        while(mid<=high){
	            switch (a[mid]){
	                case 0:
	                    temp = a[low];
	                    a[low] = a[mid];
	                    a[mid]= temp;
	                    low++;
	                    mid++;
	                    break;
	                case 1:
	                    mid++;
	                    break;
	                case 2:
	                    temp = a[high];
	                    a[high]=a[mid];
	                    a[mid]=temp;
	                    high --;
	                    break;
	            }
	        }
	            
	    }
}

