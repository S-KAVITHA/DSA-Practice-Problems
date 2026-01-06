package com.search;

import java.util.Arrays;

public class CheckNDouble {
//Check If N and Its Double Exist

	public boolean checkIfExist(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// System.out.print(2*arr[i]);
				if (arr[j] == (2 * arr[i]) && i != j) {
					System.out.print(arr[j]);
					System.out.print(2 * arr[i]);
					System.out.print(i);
					System.out.print(j);
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkIfExistBin(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			if (binarySearch(arr, 2 * arr[i], i))
				return true;
		}
		return false;
	}

	public boolean binarySearch(int[] arr, int target, int notIndex) {

		System.out.println(notIndex);
		System.out.println(target);
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			System.out.println("mid" + mid);
			if (arr[mid] == target && mid != notIndex)
				return true;

			if (arr[mid] < target) {
				start = mid + 1;
			} else
				end = mid - 1;
		}

		return false;

	}
//_------------------------------
	
	 public boolean checkIfExist2(int[] arr) {
	      Arrays.sort(arr);
	        boolean flag = false;
	        for (int i=0; i<arr.length;i++){
	            
	            flag = (binarySearch(arr,i));
	            if (flag) return true;
	            
	        }
	        return flag;
	        
	    }
	         public boolean binarySearch(int[] arr ,int i) {
	         int s = 0, e = arr.length-1;
	             int getNo = 2 * arr[i];
		    while(s <= e){
		       int mid = s + (e-s)/2;
	            
		        if(mid != i && arr[mid] == getNo){
	                 System.out.println("getNo"+ getNo);
	              
		            return true;
		        }
		        else if (arr[mid] > getNo){
		            e = mid - 1;
		        }
		        else{
		            s = mid + 1;
		        }
		    }
		    return false;
	    }
	         
}
