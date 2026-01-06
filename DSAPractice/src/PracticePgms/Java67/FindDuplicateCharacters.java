package PracticePgms.Java67;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String args[]) {

		Map<Integer, String> storeValues = new HashMap<>();
		storeValues.put(1001, "Amit");
		storeValues.put(1002, "Kalyan");
		storeValues.put(1003, "Sharma");

		System.out.println("------------For each ----------");
		// ----------set for each traverse---------
		Set<Map.Entry<Integer, String>> mapentry = storeValues.entrySet();
		System.out.println(storeValues);
		for (Entry<Integer, String> e : mapentry)
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

		System.out.println("------------Iterator----------");
		// ----------Iterator traverse---------
		Iterator<Map.Entry<Integer, String>> mapentry1 = storeValues.entrySet().iterator();
		while (mapentry1.hasNext()) {
			Entry<Integer, String> getNextValue = mapentry1.next();
			System.out.println("Key: " + getNextValue.getKey() + " Value: " + getNextValue.getValue());
		}

		System.out.println("------------Duplicate logic ----------");
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("Combination");
		printDuplicateCharacters("Java");
	}

	public static void printDuplicateCharacters(String text) {
		char[] getText = text.toCharArray();
		Map<Character, Integer> storeValues = new HashMap<Character, Integer>();
		for (char ch : getText) {
			if (storeValues.containsKey(ch)) {
				Integer getMapValue = storeValues.get(ch);
				storeValues.put(ch, getMapValue + 1);
			} else {
				storeValues.put(ch, 1);
			}
		}
		System.out.println("----------------------");
		System.out.println(storeValues);
		System.out.println("----------------------");
		Set<Map.Entry<Character, Integer>> entrySet = storeValues.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", text);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}

	}

}
