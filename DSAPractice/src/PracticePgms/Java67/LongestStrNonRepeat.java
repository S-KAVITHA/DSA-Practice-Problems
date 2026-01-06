package PracticePgms.Java67;

import java.util.HashSet;
import java.util.Set;

public class LongestStrNonRepeat {

	public static void main(String args[]) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}

	/*
	 * public static int lengthOfLongestSubstring(String s) {
	 * 
	 * Given a string s, find the length of the longest substring without repeating
	 * characters.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
	 * length of 3.
	 * 
	 * 
	 * if ((s == null) || (s.length() == 0)) return 0;
	 * 
	 * Map<Character,Integer> map = new HashMap<>(); int start = 0 , end = 0; int
	 * maxValue = Integer.MIN_VALUE;
	 * 
	 * while (end < s.length() ){ char c = s.charAt(end); if (map.containsKey(c)){
	 * 
	 * start = Math.max(start, map.get(c) + 1 ); } map.put(c,end); maxValue =
	 * Math.max(maxValue, end - start + 1); end++; } return maxValue; }
	 */

	public static int lengthOfLongestSubstring(String s) {

		/*
		 * Given a string s, find the length of the longest substring without repeating
		 * characters.
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
		 * length of 3.
		 */

		if ((s == null) || (s.length() == 0))
			return 0;

		if (s.length() == 1)
			return 1;

		int left = 0;
		int right = 0;
		int ans = 0;
		Set<Character> set = new HashSet<>();

		while (right < s.length()) {
			char c = s.charAt(right);
			if (set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			} else {
			set.add(c);
			ans = Math.max(ans, right - left + 1);
			right++;
			}
		}

		return ans;
	}

}
