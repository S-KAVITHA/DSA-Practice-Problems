package com.arrays;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int sum = 0;
		int temp = 0;
		System.out.println(number);
		
		while (number > 0) {
		
			 temp = number % 10;
			if (sum == 0) {
				
				sum = temp;
				
			} else {
				sum = (sum * 10) + temp;
			}
			
			number = number / 10;
		}
		System.out.println(sum);
	}
}
