package com.arrays;

//Java program to Finding Minimum Number of Substrings with
//Unique Characters
import java.util.*;

//Function to Find Minimum Number of Substrings with Unique
//Characters
class LengthOfMinNoRepeatSubstring  {
	static int partitionString(String s) {
		if ((s == null) || (s.length() == 0))
			return 0;

		if (s.length() == 1)
			return 1;

		HashSet<Character> set = new HashSet<>();
		int left = 0, right = 0, min = Integer.MAX_VALUE;
		if (s == " ")
			return 1;

		while (right < s.length()) {
			if (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			} else {
				set.add(s.charAt(right));
				right++;
				min = Math.min(min, set.size());
			}
		}
		return min;
	}

	public static void main(String[] args) {
		String S = "abacaba";

		System.out.print(partitionString(S));
	}
}
//This code is contributed by Ravi Singh
