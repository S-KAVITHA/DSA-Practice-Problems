package PracticePgms.Java67;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatinElem {
	public static void main(String args[]) {
		int[] numbers;

		// initializing array after declaration
		numbers = new int[] { 1, 1, 5, 2, 7, 6, 1, 4, 2, 3, 2, 2, 1, 6, 8, 5, 7, 6, 1, 8, 9, 2, 7, 9, 5, 4, 3, 1 };

		System.out.println(firstRepeated(numbers, 28));
	}

	// Function to return the position of the first repeating element.
	public static int firstRepeated(int[] arr, int n) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int num = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				num = e.getKey();
				for (int i = 0; i < n; i++) {
					if (arr[i] == num)
						return i + 1;
				}
				break;
			}
		}

		return -1;
	}
}
