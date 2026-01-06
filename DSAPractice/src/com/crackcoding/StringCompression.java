package com.crackcoding;

public class StringCompression {

	// 2 diff solutions with string and string builder. string appending takes time
	// than string builder.

	public static void main(String[] args) {
		String s2 = "aaaabbbcccccddddeeeef";
		char[] chars = { 'a', 'a', 'c', 'd', 'e' };
		

	
		System.out.println(compressleetcode(chars));
		// System.out.println(Compression1(s2));
	}

	 public int compressleetcodemine(char[] chars) {
		 // below code modified easy logic.
		 
		 
	      String sb = "";
			int count = 1;
	        if (chars.length == 1 ) return chars.length;
			for (int i = 0; i < chars.length-1; i++) {

				if ( chars[i] == chars[i + 1]) {
					count++;
				} else {
					sb += chars[i];
					if (count > 1) {
						sb += count;
					}
					count = 1;
				}
			}
			
	        if (chars[chars.length-1] == chars[chars.length-1] - 2) {
				sb += chars[chars.length-1];
				if (count > 1) {
						sb += count;
					}
			} else {
				sb += chars[chars.length-1];
				if (count > 1) {
						sb += count;
					}
			}
	        System.out.print(sb);
			for(int i=0;i<sb.length();i++)
		        chars[i]=sb.charAt(i);
			
			System.out.println(chars);
			return sb.length();
	    }
	 
	 
	public static int compressleetcode(char[] chars) {
		

		String sb = "";
		int count = 1;
		for (int i = 0; i < chars.length; i++) {

			if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
				count++;
			} else {
				sb += chars[i];
				if (count > 1) {
					sb += count;
				}
				count = 1;
			}
		}
		
		for(int i=0;i<sb.length();i++)
	        chars[i]=sb.charAt(i);
		
		System.out.println(chars);
		return sb.length();

	}

	private static String Compression1(String s2) {
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 1; i < s2.length(); i++) {
			if (s2.charAt(i - 1) == s2.charAt(i)) {
				count++;
			} else {
				sb.append(s2.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}

		if (s2.charAt(s2.length() - 1) == s2.charAt(s2.length() - 2)) {
			sb.append(s2.charAt(s2.length() - 1));
			sb.append(count);
		} else {
			sb.append(s2.charAt(s2.length() - 1));
			sb.append(count);
		}
		return s2 = sb.toString();
	}

}
