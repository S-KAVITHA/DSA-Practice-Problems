package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String args[]) {

		/*
		 * // Used to get input number for which square root to find Scanner scanner =
		 * new Scanner(System.in);
		 * 
		 * System.out.println("Enter number to find square root in Java : ");
		 * 
		 * // getting input number from user to calculate square root double square =
		 * scanner.nextDouble();
		 * 
		 * // getting the square root of a number in Java double squareRoot =
		 * Math.sqrt(square);
		 * 
		 * // printing number and its square root in Java
		 * System.out.printf("Square root of number: %f is : %f %n", square,
		 * squareRoot);
		 */
		 int []array= {-4,-1,0,3,10};
		sortedSquares(array);
	}

	public static void sortedSquares(int[] nums) {

		/*
		 * int []array= new int [nums.length]; for(int i=0;i<nums.length;i++){ array[i]=
		 * (int) Math.pow(nums[i],2);; } Arrays.sort(array); return array;
		 */

		/*
		 * int[] res = new int[nums.length]; int l=0; int i; int k;
		 * for(i=nums.length-1,k=nums.length-1;k>-1;i--,k--){
		 * if(nums[i]<Math.abs(nums[l])){ res[k] = (int) Math.pow(nums[l],2); i++; l++;
		 * } else{ res[k]=(int) Math.pow(nums[i],2); }
		 * 
		 * } return res;
		 */

		int ans[] = new int[nums.length];
		int x = 0, y = nums.length - 1, c = nums.length - 1;
		while (x <= y) {
			if ((nums[x] * nums[x]) < (nums[y] * nums[y])) {
				ans[c--] = nums[y] * nums[y];
				y--;
			} else {
				ans[c--] = nums[x] * nums[x];
				x++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
