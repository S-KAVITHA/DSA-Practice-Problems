package com.crackcoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class LongSubstringWithoutRepeatChara {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.print(lengthOfLongestSubstring(s));

	}

//3. Longest Substring Without Repeating Characters
	public static int lengthOfLongestSubstring(String s) {

			HashSet<Character> set = new HashSet<>();
		int left = 0, right = 0, max = 0;
		if (s == " ")
			return 1;

		while (right < s.length()) {
			if (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			} else {
				set.add(s.charAt(right));
				right++;
				max = Math.max(max, set.size());
			}
		}
		return max;
	}
}
