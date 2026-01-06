package com.crackcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import PracticePgms.SysoutPgm;

class StringPermutation {
//Check if String contains any permutation/anagram of given pattern

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cbaebabacd";
		// String s1 = "a";
		// String s2 = "ab";

		String s3 = "abk";
		String s4 = "eidbaooo";
		String s5 = "superdupersy";

		// System.out.println((int) 'a' - 'a');
		// System.out.println(permute(s1, s2));
		System.out.println(permutesub(s3, s4));
		System.out.println(permutesub12(s1, s2));
		System.out.println(permutesub1(s1, s2));

		// System.out.println(permutePalidrome(s5));

	}

	public static Boolean permutePalidrome(String str1) {
		// String if it can be rearranged to form a palindrome string.
		// 'superdupers' if str length is even all char length shd be even
		// else if str length is odd one odd char length is allowed.

		int len1 = str1.length();

		int[] a1 = new int[128];

		for (int i = 0; i < len1; i++) {
			int c = (int) str1.charAt(i);
			a1[c]++;
		}

		int odd = 0;

		for (int i = 0; i < 128; i++) {
			if ((a1[i] % 2) == 1)
				odd++;

			if (odd > 1)
				return false;
		}
		return true;

	}

	public static Boolean permute(String str1, String str2) {
		// two strings are permutation of each other

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 != len2)
			return false;
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			a1[str1.charAt(i) - 'a']++;
			a2[str2.charAt(i) - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (a1[i] != a2[i])
				return false;
		}
		return true;

	}

	public static boolean permutesub(String s1, String s2) {
		// s1 is permutation of s2 brute force.
		char[] s1Arr = s1.toCharArray();
		Arrays.sort(s1Arr);
		String sortedS1 = new String(s1Arr);

		for (int i = 0; i < s2.length(); i++) {
			for (int j = i; j < s2.length(); j++) {
				char[] subStrArr = s2.substring(i, j + 1).toCharArray();
				Arrays.sort(subStrArr);
				String sortedSubStr = new String(subStrArr);

				if (sortedSubStr.equals(sortedS1)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean permutesub12(String str1, String str2) {

		// return true if one of s1's permutations is the substring of s2.
		// s1 = "ab", s2 = "eidbaooo" true

		// Leetcode 438 find all anagram modified of this pblm.

		List<Integer> res = new ArrayList<>();

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 > len2 || len2 == 0)
			return false;

		int[] a1 = new int[26];
		int[] a2 = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			a1[str1.charAt(i) - 'a']++;
			a2[str2.charAt(i) - 'a']++;
		}

		for (int i = len1; i < len2; i++) {

			if (Arrays.equals(a1, a2))
				return true;
			System.out.println(str2.charAt(i - len1));
			a2[str2.charAt(i - len1) - 'a']--;
			a2[str2.charAt(i) - 'a']++;
		}

		if (Arrays.equals(a1, a2))
			return true;
		else
			return false;
		// return matches(a1, a2);
	}

	public static List<Integer> permutesub1(String str1, String str2) {

		// return true if one of s1's permutations is the substring of s2.
		// s1 = "ab", s2 = "eidbaooo" true

		// Leetcode 438 find all anagram modified of this pblm.

		List<Integer> res = new ArrayList<>();

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 > len2 || len2 == 0)
			// return false;
			return new ArrayList<>();

		int[] a1 = new int[26];
		int[] a2 = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			a1[str1.charAt(i) - 'a']++;
			a2[str2.charAt(i) - 'a']++;
		}

		for (int i = 0; i < len2 - len1; i++) {
			if (matches(a1, a2)) // return true;
				res.add(i);

			a2[str2.charAt(i + len1) - 'a']++;
			a2[str2.charAt(i) - 'a']--;
		}

		if (matches(a1, a2)) {
			res.add(len2 - len1);
		}
		return res;
		// return matches(a1, a2);
	}

	public static boolean matches(int[] s1map, int[] s2map) {
		for (int i = 0; i < 26; i++) {
			if (s1map[i] != s2map[i])
				return false;
		}
		return true;
	}
}
