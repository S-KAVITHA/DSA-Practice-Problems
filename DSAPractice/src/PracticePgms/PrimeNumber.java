package PracticePgms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No");
		int number = input.nextInt();

		

		boolean getFlag = findPrime(number);
		if (getFlag) {
			System.out.println(number + " is a Prime No");
		}else {
			System.out.println(number + " is not a Prime No");	
		}
	}

	public static boolean findPrime(int number) {

		int sqrtNumber =  (int) Math.sqrt(number) ;
		System.out.println(sqrtNumber);
		
		
		if (number < 2)
			return false;

		if (number == 2)
			return true;

		if ((number % 2) == 0)
			return false;
		
		for (int i = 3; i <= sqrtNumber ; i += 2) {
			if ((number % i) == 0) {
				return false;
			} 
		}

		return true;
	}
}
