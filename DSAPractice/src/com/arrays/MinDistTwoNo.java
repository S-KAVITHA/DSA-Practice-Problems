package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinDistTwoNo {
	
		 public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        int t = Integer.parseInt(br.readLine());
		        while (t-- > 0) {
		            int n = Integer.parseInt(br.readLine().trim());
		            String[] str = br.readLine().trim().split(" ");
		            int[] a = new int[n];
		            for (int i = 0; i < n; i++) 
		                a[i] = Integer.parseInt(str[i]);
		            String[] xy = br.readLine().trim().split(" ");
		            int x = Integer.parseInt(xy[0]);
		            int y = Integer.parseInt(xy[1]);
		            
		            System.out.println(minDist(a, n, x, y));
		        }
		    }
	
	static int minDist(int a[], int n, int x, int y) {
		int prev = 0;
		int found = 0;

		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if ((a[i] == x) || (a[i] == y)) {
				prev = i;
				break;
			}
		}

		int j = (prev + 1);

		for (int i = j; i < n; i++) {

			if ((a[i] == x) || (a[i] == y)) {

				if (a[i] != a[prev] && (i - prev) < minDist) {
					minDist = i - prev;
					prev = i;
					found = 1;

				} else
					prev = i;
			}
		}

		if (found != 0)
			return minDist;
		else
			return -1;
	}
}
