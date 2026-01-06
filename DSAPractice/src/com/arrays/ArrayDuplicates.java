package com.arrays;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class ArrayDuplicates {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			ArrayList<Integer> ans = duplicates(a, n);
			for (Integer val : ans)
				System.out.print(val + " ");
			System.out.println();
		}
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		
		//hashset optimal solution
		
		
		ArrayList<Integer> list = new ArrayList<>();
		 ArrayList<Integer> emptyList = new ArrayList<>();
	       emptyList.add(-1);
	       int flag=0;
	       Arrays.sort(arr);
	       for(int i=0; i<n-1; i++){
	           if(arr[i]==arr[i+1]){
	               flag++;
	               if(flag==1){
	                   list.add(arr[i]);
	               }
	           }
	           else{
	               flag=0;
	           }
	       }
	       if(list.size()>0){
	           return list;
	       }
	       return emptyList;
	}

}
