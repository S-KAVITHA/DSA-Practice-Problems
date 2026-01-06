package PracticePgms;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] numbers = new double[5];
		int n = 3;
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Please enter number");
			numbers[i] = input.nextDouble();
		}

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		// System.out.println((int) A.charAt(0) - B.charAt(0));
		int get_val = (A.compareTo(B));
		System.out.println(get_val);

		if (A.length() > B.length()) {
			System.out.println("First string is larger than the second");
		} else {
			System.out.println("Second string is larger than the first");
		}
		/*
		 * if (get_val < 0) { System.out.println("A is greater than B"); } else if
		 * (get_val == 0) { System.out.println("A is equal to B"); } else {
		 * System.out.println("A is less than B"); }
		 */

	}
}
