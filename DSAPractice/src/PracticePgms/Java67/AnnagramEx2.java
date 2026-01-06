package PracticePgms.Java67;

import java.util.Arrays;
import java.util.HashMap;
/*Given two strings S1 and S2 in lowercase, 
the task is to make them anagram. 
The only allowed operation is to remove a character from any string. 
Find the minimum number of characters to be deleted to make both the strings anagram. 
Two strings are called anagram of each other if one of them can be converted into
another by rearranging its letters.*/

public class AnnagramEx2 {

	private static Integer getMapValue;

	public static void main(String args[]) {
		String s = "basgadhbfgvhads";
		String s1 = "sjdhgvbjdsbhvbvd";

		System.out.println(remAnagrams(s, s1));
	}

	

	public static int remAnagrams(String s, String s1) {

		int count = 0;
		Integer getMapValue = null;

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.get(ch) + 1);
		}

		System.out.println(map);

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			if (map.containsKey(ch) == false)
				// map.put(ch,-1);
				count += 1;
			else {
				getMapValue = map.get(ch);
				if (getMapValue != null)
					map.put(ch, getMapValue - 1);
				else

					count += 1;
			}
		}

		System.out.println(map);

		for (int i : map.values()) {

			if (i < 0)
				count = count - i;
			else
				count = count + i;

		}

		return count;
	}
}