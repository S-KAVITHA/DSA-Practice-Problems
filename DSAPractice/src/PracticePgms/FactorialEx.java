package PracticePgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialEx {

	// the factorial of 4 is 4�3�2�1, which is equal to 24

	public static void main(String args[]) {

		System.out.println("Enter No");
		@SuppressWarnings("resource")
		//int number = new Scanner(System.in).nextInt();
	//	int getFact = factorial(number);
	//	System.out.println(getFact);

		// ---------recursive-------
	//	System.out.println("----------recursive------");
		//int getFact1 = factorial11(number);
		ArrayList<Integer> c= factorial11(5);
		System.out.println(c);
		//System.out.println(getFact1);
	}

	public static int factorial(int number) {
		int factNumber = 1;
		for (int i = number; i > 0; i--) {
			factNumber *= i;
		}
		return factNumber;
	}
	
	public static ArrayList<Integer> factorial11(int n) {
		ArrayList a = new ArrayList();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		int digit = 0;
		while (fact > 0) {
			int temp = fact % 10;
			digit = temp;
			a.add(digit);
			fact = fact / 10;

		}
		Collections.reverse(a);
		return a;
	}

	/*
	 * public static int factorial1(int number) { //System.out.println(number ); if
	 * (number == 0) { return 1; }
	 * 
	 * ArrayList<Integer> c= factorial11(5); System.out.println(c); return number *
	 * factorial1(number - 1); }
	 */

}
