package PracticePgms.Java67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramCheck {

	public static List<List<String>> isAnagram(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);

			if (map.containsKey(sortedWord)) {
				map.get(sortedWord).add(word);
				
			}else {
				
				List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortedWord,list );
                			}
			
			//another way
			/*
			 * if (!map.containsKey(sortedWord)) { map.put(sortedWord, new ArrayList<>()); }
			 * 
			 * map.get(sortedWord).add(word);
			 */
		}

		/* expansion of below code
		 * List<List<String>> ans = new ArrayList<>(); for(Map.Entry<String,
		 * List<String>> entry : map.entrySet()){ ans.add(entry.getValue()); }
		 */
	        
		return new ArrayList<>(map.values());
	}

	public static void main(String args[]) {

		System.out.println("--------------------------");
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(isAnagram(arr));

	}
}