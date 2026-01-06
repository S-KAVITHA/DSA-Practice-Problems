package PracticePgms;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[]) {
		
		
		//quick wasy to reverse String in Java - Use StringBuffer
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s ,reversed String %s  %n", word, reverse);
     
        //another quick to reverse String in Java - use StringBuilder
        word = "WakeUp";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s ,reversed String %s %n", word, reverse);
     
        // one way to reverse String without using
        // StringBuffer or StringBuilder is writing
        // own utility method
        word = "Band";
        reverse = reverse(word);
        System.out.printf(" original String : %s ,reversed String %s %n", word, reverse);
	
	
	
		System.out.println("Enter the string");
		@SuppressWarnings("resource")
		String text = new Scanner(System.in).nextLine();
		String revText = reverse(text);
		System.out.println(revText);
	}

	public static String reverse(String text) {
		if(text == null || text.isEmpty()){
			return text;
		}
		int strLen = text.length();
		String reverse = "";

		for (int i = strLen - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}
		
		return reverse;
	}

}
