package PracticePgms;

import java.util.Scanner;

public class String_Hack {

	public static void main(String[] args) {

		/*
		 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
		 * System.out.print("Please enter the number of strings you want to enter: ");
		 * String[] string = new String[sc.nextInt()];
		 * 
		 * sc.nextLine(); for (int i = 0; i < string.length; i++) { string[i] =
		 * sc.nextLine(); } System.out.println("\nYou have entered: ");
		 * 
		 * int j = 1; for (String str : string) { System.out.println( j + " " + str);
		 * j++; }
		 */

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; scanner.hasNext(); i++) {
			System.out.println(i + " " + scanner.nextLine());
		}
	}

}
