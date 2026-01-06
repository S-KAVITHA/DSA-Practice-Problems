package com.arrays;

public class RotateMatrix {
	public static void main(String[] args) {
		int n = 3;
		int matrix[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("The Original Matrix is: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(matrix[i][j] + " " + "\t");
			}
			System.out.println();
		}

		rightRotate(matrix, n);

		int matrix1[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// anti clock wise rotation
		leftRotate(matrix1, n);
	}

	static void leftRotate(int matrix[][], int n) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return;
		// transpose
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// reverse matrix
		for (int i = 0; i < n; i++) {
			int l = 0, r = n - 1;
			while (l < r) {
				int temp = matrix[l][i];
				matrix[l][i] = matrix[r][i];
				matrix[r][i] = temp;
				l++;
				r--;

			}
		}

		System.out.println("The anticlockwise Matrix is: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " " + "\t");
			}
			System.out.println();
		}

	}

	static void rightRotate(int matrix[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
//clockwise both sol working
		for (int i = 0; i < n; i++) {
			int l = 0, r = n - 1;
			while (l < r) {
				int temp = matrix[i][l];
				matrix[i][l] = matrix[i][r];
				matrix[i][r] = temp;
				l++;
				r--;
			}
		}
		// ---------------------------

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - j - 1];
				matrix[i][n - j - 1] = temp;
			}
		}

		System.out.println("The clockwise Matrix is: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " " + "\t");
			}
			System.out.println();
		}

	}
}
