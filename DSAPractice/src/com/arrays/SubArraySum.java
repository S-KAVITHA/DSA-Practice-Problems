package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SubArraySum {

	 public int subarraySum(int[] nums, int k) {

		   int count=0;  
		    Map<Integer, Integer> map = new HashMap<>();
		    int sum=0;
		    
		    for(int i=0;i<nums.length;i++){
		        sum+=nums[i];
		        if(sum==k)count++;
		        if(map.containsKey(sum-k)){
		             count+= map.get(sum-k);
		        }
		         map.put(sum,map.getOrDefault(sum,0)+1);
		         
		    }
		         return count; 
		}
	 
	 
	static int subarray(int arr[], int n, int sum) {
		int currentsum = 0, begin = 0, i;

		// Always start with the initial index of an array
		for (i = 0; i < n; i++) {

			currentsum = currentsum + arr[i];

			while (currentsum > sum && begin < i) {
				currentsum = currentsum - arr[begin];
				begin++;
			}

			if (currentsum == sum) {
				int p = i;
				System.out.println("Sum found between indexes " + begin + " and " + p);
				return 1;
			}

		}

		System.out.println("No subarray found");
		return 0;
	}

	static ArrayList<Integer> subarraySum(int[] arr, int target) {

		int sum = 0;
		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum += arr[j];

				if (sum == target) {
					li.add(i + 1);
					li.add(j + 1);
					break;
				}
			}

			if (sum == target) {
				break;
			}
		}

		if (li.isEmpty()) {
			li.add(-1);
		}
		return li;
	}

	static ArrayList<Integer> subarraySum1(int[] arr, int target) {

		ArrayList<Integer> li = new ArrayList<>();

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			int sum = arr[i];

			if (sum == target) {
				li.add(i + 1);
				li.add(i + 1);
				flag = true;
				break;
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					sum += arr[j];

					if (sum == target) {
						li.add(i + 1);
						li.add(j + 1);
						flag = true;
						break;
					}
				}
				if (flag)
					break;
			}
		}

		if (li.isEmpty()) {
			li.add(-1);
		}
		return li;
	}

	
	 public static boolean isSubset(int arr1[], int arr2[]) {
	        
	        
		 HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count frequencies of elements in arr1
	        for (int num : arr1) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Check if arr2 elements are present in arr1 with sufficient frequency
	        for (int num : arr2) {
	            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) <= 0) {
	                return false;
	            }
	            frequencyMap.put(num, frequencyMap.get(num) - 1);
	        }

	        return true;
	    }
	 
	public static void main(String[] args) {
		int n;
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println(" Enter number of elements :  "); n = sc.nextInt(); int[]
		 * array = new int[100]; System.out.println(" Enter elements of the array :  ");
		 * for (int i = 0; i < n; i++) { array[i] = sc.nextInt(); }
		 */

		/*
		 * System.out.println(" Enter value of sum : "); int sum = sc.nextInt();
		 * subarray(array, n, sum);
		 */

		int array[] = { 19, 28, 2 };
		System.out.println(subarraySum1(array, 20000));
		
		int array1[] = { 10 ,5 ,3, 23, 19 };
		int array2[] = { 19, 3, 3};
		System.out.println(isSubset(array1, array2));
		
	}
}