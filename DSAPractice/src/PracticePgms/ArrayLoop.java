package PracticePgms;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class ArrayLoop {

	public static void resultCalc(int a, int b, int n) {
		int[] list = new int[n];

		int temp = 0;
		int temp1 = 0;
		int temp2 = 0;

		for (int k = 0; k < n; k++) {
			temp = (int) Math.pow(2, k);
			temp1 = temp * b;
		//	System.out.println(temp1);
			if (k == 0) {
				temp2 = a;
			}
			temp2 = temp2 + temp1;
		//	System.out.println(temp2);
			list[k] = temp2;

		}

		StringJoiner sj = new StringJoiner(" ");
		IntStream.of(list).forEach(x -> sj.add(String.valueOf(x)));
		System.out.println(sj.toString());

		// System.out.println(Arrays.toString(list));

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("Enter a ");
			int a = in.nextInt();
			System.out.println("Enter b ");
			int b = in.nextInt();
			System.out.println("Enter n ");
			int n = in.nextInt();
			resultCalc(a, b, n);
		}
		in.close();
	}
}
