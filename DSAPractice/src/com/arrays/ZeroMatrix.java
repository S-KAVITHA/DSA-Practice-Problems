package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
	public static void main(String[] args) {

		int matrix[][] = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		int row = matrix.length;
		int col = matrix[0].length;

		System.out.println("The Original Matrix is: " + row + " " + col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		int[][] b = zeromatrix(matrix, row, col);

		System.out.println("The result Matrix is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

		int matrix1[][] = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		int[][] b1 = zeromatrix1(matrix1, row, col);

		System.out.println("The result Matrix is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(b1[i][j] + "\t");
			}
			System.out.println();
		}

		int matrix2[][] = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		int[][] b2 = zeromatrix2(matrix2, row, col);

		System.out.println("The result Matrix is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(b2[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[][] zeromatrix1(int matrix[][], int row, int col) {

		boolean[] rowFlag = new boolean[row];
		boolean[] colFlag = new boolean[col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0) {
					rowFlag[i] = true;
					colFlag[j] = true;
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (rowFlag[i] || colFlag[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;

	}

	static int[][] zeromatrix2(int matrix[][], int row, int col) {
		Set<Integer> rowSet = new HashSet<Integer>();
		Set<Integer> colSet = new HashSet<Integer>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0) {
					rowSet.add(i);
					colSet.add(j);
				}
			}
		}
		for (int i : rowSet) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = 0;
			}
		}

		for (int i : colSet) {
			for (int j = 0; j < row; j++) {
				matrix[j][i] = 0;
			}
		}

		return matrix;

	}

	static int[][] zeromatrix(int matrix[][], int row, int col) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean[][] flagArr = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					flagArr[i][j] = true;
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (flagArr[i][j] == true) {
					/* for rows */
					for (int k = 0; k < rows; k++) {
						matrix[k][j] = 0;
					}
					/* for cols */
					for (int z = 0; z < cols; z++) {
						matrix[i][z] = 0;
					}
				}
			}

		}
		return matrix;
	}
}
