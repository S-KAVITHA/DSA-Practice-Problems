package com.search;

public class CountNegNum {
	
	//1351. Count Negative Numbers in a Sorted Matrix
	 public int countNegatives(int[][] grid) {
	        int count =0 ;
	        
	     for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
	                if (grid[i][j] < 0)
	                    count++;
	            }   
	     }
	        return count;
	        
	    }
	 public int countNegativesBinary(int[][] grid) {
		 
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
}
