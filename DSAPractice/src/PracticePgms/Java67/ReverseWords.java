package PracticePgms.Java67;

import java.util.ArrayList;
import java.util.Arrays;

import PracticePgms.SysoutPgm;

public class ReverseWords {

	public static void main(String args[]) {
		String text = new String("i.like.this.program");
		System.out.println(reverseWords(text).trim());

		String s2 = "I love Java Programming";
		System.out.println(reverseWords(s2).trim());
	}

	public static String reverseWords(String text) {
		//String[] temp = text.split("\\s");
		String[] temp = text.split("\\.");
		
		System.out.println(Arrays.toString(temp));
		System.out.println(text);
		int length = temp.length;
		length = length - 1 ;
		System.out.println(length);
		String result = "" ;
		
		for (int i = length  ; i >= 0; i--) {
			
			if (result != "") {
				result = result + "." + temp[i];
			} else {
				result = temp[i];
			}
		}

		return result;
	}

}
