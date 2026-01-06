package com.crackcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BannedList {

	public static void main(String args[]) {

		// Given a string paragraph and a string array of the banned words banned,
		// return the most frequent word that is not banned. It is guaranteed there is
		// at least one word that is not banned, and that the answer is unique.

//The words in paragraph are case-insensitive and the answer should be returned in lowercase.

		String str = "Bob. hIt, baLl";

		String[] s1 = new String[] { "bob,hit" };
		String res = mostCommonWord(str, s1);

		System.out.print("Answer " + res + " ");

	}

	public static String mostCommonWord(String paragraph, String[] banned) {

		 HashMap<String, Integer> map = new HashMap<>();
			paragraph = paragraph.toLowerCase();
			
			String[] convstr =paragraph.split("\\W+");
			ArrayList<String> list = new ArrayList<>(Arrays.asList(banned));

			for (String str : convstr) {
				if (list.contains(str)) {
					
					System.out.println("banned");
					/*
					 * if (map.containsKey(str)) { int cnt = map.get(str); cnt++;
					 * System.out.println(str); map.put(str, cnt); } else map.put(str, 1);
					 */
				}
			}

			String result = "";
			int max = 0;
			for (Map.Entry<String, Integer> m : map.entrySet()) {
				System.out.println(m.getKey());
				System.out.println(m.getValue());

				if (max < m.getValue()) {
					max = m.getValue();
					result = m.getKey();
				}
			}
			result = result.toLowerCase();
			return result;
		  
	    }
}
