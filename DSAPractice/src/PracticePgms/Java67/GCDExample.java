package PracticePgms.Java67;

import java.util.Scanner;

public class GCDExample {

	public static void main(String args[]) {
		// Enter two number whose GCD needs to be calculated.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD");
		int number1 = scanner.nextInt();
		System.out.println("Please enter second number to find GCD");
		int number2 = scanner.nextInt();
		System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD(number1, number2));
		System.out.println("Recursive :   GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD1(number1, number2));
		
	}

	private static int findGCD(int number1, int number2) {
		int temp = 0;
		
		while (number2 != 0) {
			temp = number1;
			number1 = number2;
			number2 = (temp % number1);
		}
		return number1;
	}
	
	private static int findGCD1(int number1, int number2) { 
		//base case
		if(number2 == 0){ return number1; } 
		return findGCD(number2, number1%number2); 
	}
				
}
