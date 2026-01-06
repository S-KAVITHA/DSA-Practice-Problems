package PracticePgms.Java67;

import java.util.Arrays;

public class DuplicateNo {
	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			/*
			 * System.out.println(arr[i]+" "); System.out.println(arr[i+1]+" ");
			 */
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
				System.out.println(j);
			}
		}

		temp[j++] = arr[n - 1];
		// Changing original array
		// System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			/*
			 * System.out.println(i); if(i < j ){ // Just in case arr isn't larger arr[i] =
			 * temp[i]; } else { arr[i] = 0; // Or whatever default value you want here }
			 */

			arr[i] = temp[i];
		}
		return j;
	}

	public static int removeDuplicateElements1(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		// int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			/*
			 * System.out.println(arr[i]+" "); System.out.println(arr[i+1]+" ");
			 */
			if (arr[i] != arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				j++;
				System.out.println(j);
			}
		}

		// temp[j++] = arr[n-1];
		// Changing original array
		// System.out.println(arr.length);
		/*
		 * for (int i=0; i< arr.length; i++){
		 * 
		 * System.out.println(i); if(i < j ){ // Just in case arr isn't larger arr[i] =
		 * temp[i]; } else { arr[i] = 0; // Or whatever default value you want here }
		 * 
		 * 
		 * arr[i] = temp[i]; }
		 */
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 70, 10, 90, 20, 20, 30, 40, 70, 50 };// unsorted array
		Arrays.sort(arr);// sorting array
		int length = arr.length;
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

		length = removeDuplicateElements1(arr, length);
		// printing array elements

		System.out.print("============= ");
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}
