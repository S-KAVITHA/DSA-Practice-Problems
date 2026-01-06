package com.crackcoding;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlapInterval {

	public static void main(String[] args) {
		
		int[][] intervals = { {1, 2},{3,5},{2,4},{1,3},{1,2},{4,6} };
		System.out.print(eraseOverlapIntervals(intervals));

	}

	public static int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, (a,b)->(a[0] - b[0]));
		 int ans = 0 , previous = 0;
	
		    for (int current = 1; current < intervals.length; current++) {
		      if (intervals[previous][1] > intervals[current][0]  ) {
		        ans++;
		       
		      }else {
		    	  previous = current;
		      }
		    }
		    return ans;
	}
}
