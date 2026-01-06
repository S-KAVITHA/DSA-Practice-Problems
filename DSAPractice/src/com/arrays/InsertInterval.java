package com.arrays;

public class InsertInterval {

	public static void main(String args[]) {

		/*
		 * int[][] matrix = { {1, 2}, { 3,5}, {6, 7}, {8,10}, {12,16} };
		 */
		
		int[][] matrix = new int[0][0] ;
		int[] newInterval = {4,8};
		int[][] res = insert(matrix, newInterval);

		System.out.print("Answer " + res + " ");

	}
	
public static int[][] insert(int[][] intervals, int[] newInterval) {
        
        int[][] result = new int[intervals.length + 1][2];
       // if (intervals.length <= 1) return intervals;

        int i=0 , j = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]){
                result[j++] = intervals[i++];
                
               
        }

         while (i < intervals.length && intervals[i][0] <= newInterval[1]){
                newInterval [0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval [1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
                 
        }      
         result[j++] = newInterval;     

        while (i < intervals.length ){
            result[j++] = intervals[i++]; 
        }

        int[][] newArray = new int[j][2];
      
        for (int m = 0; m < result.length ; m++) {
            for (int n = 0; n < result[0].length; n++) {
            	
            	System.out.println(result[m][n]);
                if (result[m][n] != 0) {
                    newArray[m][n] = result[m][n];
                }
            }
           
        }

        return newArray;
    }

}
