package com.crackcoding;

public class URLify {
	public static void main(String[] args) {
		String s = "picture perfect day cool ";
		String output = URLify(s);
		System.out.println(s);
		System.out.println(output);
	}

	public static String URLify(String str) {
		char[] oldCharArray = str.toCharArray();
		int spaceCount = 0;
		System.out.println(str.length());
		for (int i = 0; i < oldCharArray.length; i++) {
			if (oldCharArray[i] == ' ') {
				spaceCount++;
			}
		}

		int newLength = str.length()  + spaceCount * 2;
		char[] newStr = new char[newLength];
		int j = 0;

		for (int i = 0; i < oldCharArray.length ; i++) {

			if (oldCharArray[i] == ' ') {
				newStr[j] = '%';
				newStr[j + 1] = '2';
				newStr[j + 2] = '0';
				j += 3;
			} else {
				newStr[j] = oldCharArray[i];
				j++;
			}
		}

		str = String.valueOf(newStr);

		return str;
	}

}
