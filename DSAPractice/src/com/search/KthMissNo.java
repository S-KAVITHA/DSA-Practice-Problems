package com.search;

public class KthMissNo {
//1539. Kth Missing Positive Number

	public int findKthPositive(int[] arr, int k) {
		
		//linear search
	
		int numCnt = 0;
		int i = 0;
		while (k > 0) {
			numCnt++;
			 if (i<arr.length && arr[i]==numCnt){
			
				i++;
			} else {
				k--;
			}

		}

		return numCnt;

	}

		
		public int findKthPositiveBinary(int[] arr, int k) {
			int notNo = 0;
			int i = 1;
			while (k > 0) {
								 
				if (!binarySearch(arr, i)) {
                    k--;
                    notNo = i;
				}
                    i++;
				

			}

			return notNo;

		}
	public boolean binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == target)
				return true;

			if (arr[mid] < target) {
				start = mid +1;
			} else
				end = mid -1;
		}

		return false;

	}
}