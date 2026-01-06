package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {

	@SuppressWarnings("unlikely-arg-type")
	public static boolean isSubset(int a[], int b[]) {
		 boolean flag = false;

			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < a.length; i++) {
				map.put(a[i],map.getOrDefault(a[i],0)+ 1);
			}
				for (int i = 0; i < b.length; i++) {
					if (map.containsKey(b[i])) {
						if(map.get(b[i]) == 1){
							map.remove(b[i]);
					    } else {
					    	map.put(b[i],map.get(b[i])-1);
				    	}
				    }else{
				    	return false;
				    }
				}
	         	return true;

	}

	public static void main(String[] args) {
		int arr[] = { 11, 7, 1, 13, 21, 3, 7, 3 };
		int arr1[] = { 11, 3, 7, 1,7,7 };
		System.out.println(isSubset(arr, arr1));

	}
}
