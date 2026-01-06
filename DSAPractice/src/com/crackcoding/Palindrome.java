package com.crackcoding;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		int remainder, sum = 0, temp;
		int number = 4554;// It is the number variable to be checked for palindrome
		 if (number < 0 ) System.out.println("not palindrome");
		temp = number;
		while (number > 0) {
			remainder = number % 10; // getting
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

		/*-------------- solution for string and numbers */
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);
			
		}
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

		// -----------------recursive function-------------

		System.out.println("Is aaa palindrom?: " + isPalindromString("aaa"));

	}

	public static boolean isPalindromString(String text) {
		String reverse = reverse(text);
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}

	/**
	 * * Java method to reverse String using recursion * @param input * @return
	 * reversed String of input
	 */
	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}
	
	public static boolean ValidPalindrome(String s) {
	 s = s.toLowerCase();
     s= s.replaceAll("\\p{Punct}","");
      s= s.replace(" ","");
      	String original, reverse = "";
    for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
					}
       System.out.println(s);
		if (s.equals(reverse))
         return true;
      else return false;
	}
}
