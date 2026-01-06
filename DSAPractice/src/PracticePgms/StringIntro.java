package PracticePgms;

import java.io.*;
import java.util.*;

public class StringIntro {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int Alength = A.length();
		int Blength = B.length();
		int result = 0;
		int min_length = Math.min(Alength, Blength);

		int k = 0;
		while (k < min_length) {

			char Achar = A.charAt(k);
			char Bchar = B.charAt(k);

			// System.out.println(Achar);
			// System.out.println(Bchar);
			if (Achar != Bchar) {

				result = ((int) A.charAt(k) - B.charAt(k));
				// System.out.println(result);
				break;
			}
			k++;
		}

		System.out.println(Alength + Blength);
		if (result != 0) {

			if (result < 0) {
				// System.out.println("First is lesser than second");
				System.out.println("No");
			} else if (result > 0) {
				// System.out.println("First is greater than second");
				System.out.println("Yes");
			}
			
		} else if (Alength > Blength) {
			// System.out.println("First is greater than second");
			System.out.println("Yes");
			
		} else if (Alength < Blength) {
			// System.out.println("First is equal to second");
			System.out.println("No");

		} else if (Alength == Blength) {
			System.out.println("No");
		}

		String A_output = A.substring(0, 1).toUpperCase() + A.substring(1);
		String B_output = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(A_output + " " + B_output);
	}
}
