package PracticePgms.Java67;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedChar {

	public static void main(String args[]) {

		System.out.println(getFirstNonRepeatedChar("AVA"));
		System.out.println(firstNonRepeatedCharacter("AVA"));
	}

	public static char getFirstNonRepeatedChar(String text) {

		char[] tempText = text.toCharArray();
		LinkedHashMap<Character, Integer> getCountRepeat = new LinkedHashMap<Character, Integer>();
		char getStoreKey = ' ';
		Integer getStoreValue = 0;
		for (char c : tempText) {

			getCountRepeat.put(c, getCountRepeat.containsKey(c) ? getCountRepeat.get(c) + 1 : 1);

		}

		Set<Map.Entry<Character, Integer>> entryset = getCountRepeat.entrySet();
		for (Map.Entry<Character, Integer> entry : entryset) {
			getStoreKey = entry.getKey();
			getStoreValue = entry.getValue();
			if (getStoreValue == 1)
				break;
		}
		return getStoreKey;

	}

	public static char firstNonRepeatedCharacter(String word) {
		HashMap<Character, Integer> scoreboard = new HashMap<>();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}

}
