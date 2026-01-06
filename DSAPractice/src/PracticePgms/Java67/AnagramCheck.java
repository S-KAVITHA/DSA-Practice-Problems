package PracticePgms.Java67;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public static boolean isAnagram(String str1, String str2) {
		// comparing length
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());

		if (str1.length() != str2.length()) {
			// returns false if the strings are not equal in length
			return false;
		}
		// converts string into character array
		char[] chars = str1.toCharArray();
		// loop iterates over the array
		for (char c : chars) {
			// finds the index
			int index = str2.indexOf(c);
			if (index != -1) {
				// the substring() method returns a new string that is a substring of this
				// string
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
				System.out.println(str2);
			} else {
				return false;
			}
		}
		return str2.isEmpty();
	}

	public static boolean isAnagram1(String s, String t) {

		// solution using char array of 26
		s= s.toLowerCase();
		t= t.toLowerCase();
		
		int[] alphabet = new int[26];
		for (int i = 0; i < s.length(); i++) {
			//System.out.println(s.charAt(i));
			//System.out.println(s.charAt(i) - 'a');
			alphabet[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++)
			alphabet[t.charAt(i) - 'a']--;
		for (int i : alphabet)
			if (i != 0)
				return false;
		return true;
		/*
		 * Map<Character, Integer> count = new HashMap<>();
		 * 
		 * // Count the frequency of characters in string s for (char x :
		 * str1.toCharArray()) { count.put(x, count.getOrDefault(x, 0) + 1); }
		 * 
		 * // Decrement the frequency of characters in string t for (char x :
		 * str2.toCharArray()) { count.put(x, count.getOrDefault(x, 0) - 1); }
		 * 
		 * // Check if any character has non-zero frequency for (int val :
		 * count.values()) { if (val != 0) { return false; } }
		 * 
		 * return true;
		 */

		/*
		 * str1.toLowerCase(); str2.toLowerCase(); char[] arrayStr1 =
		 * str1.toCharArray(); char[] arrayStr2 = str2.toCharArray();
		 * 
		 * Arrays.sort(arrayStr1); System.out.println(arrayStr1);
		 * Arrays.sort(arrayStr2); System.out.println(arrayStr2);
		 * 
		 * 
		 * if (Arrays.equals(arrayStr1,arrayStr2)) { return true; } else return false;
		 */
		/*
		 * Map<Character,Integer> map1=new HashMap<>(); Map<Character,Integer> map2=new
		 * HashMap<>(); for(int i=0;i<a.length();i++){ int
		 * y=map1.getOrDefault(a.charAt(i),0); map1.put(a.charAt(i),y+1); } for(int
		 * j=0;j<b.length();j++){ int x=map2.getOrDefault(b.charAt(j),0);
		 * map2.put(b.charAt(j),x+1); } return map1.equals(map2);
		 */
	}

	public static void main(String args[]) {
		// calling function
		/*
		 * System.out.println(isAnagram("HEART", "EARTH"));
		 * System.out.println(isAnagram("TRIANGLE", "INTEGRAL"));
		 * System.out.println(isAnagram("TOSS", "SHOT"));
		 */
		System.out.println("--------------------------");
		System.out.println(isAnagram1("HEART", "EARTH"));
		System.out.println(isAnagram1("TRIANGLE", "INTEGRAL"));
		System.out.println(isAnagram("TOSS", "SHOT"));
		System.out.println(isAnagram("spot", "pots"));
		System.out.println(isAnagram("spot", "tops"));

	}

	/*
	 * String cleanText1 = text1.replace(" ","").toLowerCase(); String cleanText2 =
	 * text2.replace(" ","").toLowerCase();
	 * if(cleanText1.length()!=cleanText2.length()) return false;
	 * 
	 * // Array to keep track of chracter count int ALL_POSSIBLE_ASCII_CHARACTER =
	 * 256; int[] count = new int[ALL_POSSIBLE_ASCII_CHARACTER]; for(int
	 * i=0;i<cleanText1.length();i++){ count[cleanText1.charAt(i)]++;
	 * count[cleanText2.charAt(i)]--; }
	 * 
	 * // If any count is not 0, the sentences are not an anagram for(int
	 * countForOneCharacter:count){ if (countForOneCharacter!=0){ return false; } }
	 * return true;
	 * 
	 * 
	 * 
	 * 
	 * String cleanText1 = text1.replace(" ","").toLowerCase(); String cleanText2 =
	 * text2.replace(" ","").toLowerCase();
	 * if(cleanText1.length()!=cleanText2.length()) return false;
	 * 
	 * // Sum up the value of all characters int sum1 = 0; int sum2 = 0; for(int
	 * i=0;i<cleanText1.length();i++){ sum1=sum1+(int)cleanText1.charAt(i);
	 * sum2=sum2+(int)cleanText2.charAt(i); } return sum1==sum2;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * String cleanText1 = text1.replace(" ","").toLowerCase(); String cleanText2 =
	 * text2.replace(" ","").toLowerCase();
	 * if(cleanText1.length()!=cleanText2.length()) return false;
	 * 
	 * // Sum up the value of all characters int sum1 = 0; int sum2 = 0; for(int
	 * i=0;i<cleanText1.length();i++){ sum1=sum1+(int)cleanText1.charAt(i);
	 * sum2=sum2+(int)cleanText2.charAt(i); } return sum1==sum2;
	 * 
	 */

}