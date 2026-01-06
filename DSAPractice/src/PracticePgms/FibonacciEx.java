package PracticePgms;

import java.util.Scanner;

public class FibonacciEx {

	public static void main(String args[]) {
		int number = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no for series:");
		number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			int getfibvalue = fibonacci(i);
			System.out.print(getfibvalue + " ");
		}
		
		System.out.println("  ");
		System.out.println(" ---recursive--------- ");
		
		for (int i = 1; i <= number; i++) {
			int getfibvalue = fibonacci1(i);
			System.out.print(getfibvalue + " ");
		}

	}
	
	
// recursive function logic for fibonacci
	
	public static int fibonacci1(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci1(number - 1) + fibonacci1(number - 2);
	}

	// loop function logic for fibonacci
	
	public static int fibonacci(int number) {

		int fib1 = 1;
		int fib2 = 1;
		int fibonumber = 1;

		if ((number == 1) || (number == 2)) {
			fibonumber = 1;
		}
        
		for (int i = 3; i <= number; i++) {

			fibonumber = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonumber;
			
		}
		return fibonumber;

	}
}
