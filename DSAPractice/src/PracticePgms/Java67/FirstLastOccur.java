package PracticePgms.Java67;

import java.util.ArrayList;

public class FirstLastOccur {
	public static void main(String args[]) {

		
	}

	ArrayList<Long> find(long arr[], int n, int x) {
		ArrayList<Long> result = new ArrayList<Long>();
		ArrayList<Long> emptyList = new ArrayList<Long>();
		emptyList.add(-1L);
		emptyList.add(-1L);
		Long last = 0L;
		Long first = 0L;
		boolean findFisrt = false;
		boolean elemFound = false;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x && findFisrt == false) {
				findFisrt = true;
				elemFound = true;
				first = Long.valueOf(i);
				last = Long.valueOf(i);
			}
			if (arr[i] == x && findFisrt == true)
				last = Long.valueOf(i);

		}

		result.add(first);
		result.add(last);

		if (elemFound)
			return result;
		else
			return emptyList;
	}
