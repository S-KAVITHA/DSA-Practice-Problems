package com.search;

import java.util.ArrayList;

public class Intersection2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int num : nums2)
			list2.add(num);

		for (int i = 0; i < nums1.length; i++) {
			if (list2.contains(nums1[i])) {
				int index = list2.indexOf(nums1[i]);
				list2.remove(index);
				result.add(nums1[i]);
			}
		}

		int arr[] = new int[list2.size()];
		for (int k = 0; k < list2.size(); k++)
			arr[k] = list2.get(k);
		return arr;

	}

	public int[] intersect2(int[] nums1, int[] nums2) {
		 Map<Integer, Integer> m1 = new HashMap();
			Map<Integer, Integer> m2 = new HashMap();
			ArrayList<Integer> al = new ArrayList();
			for (int i = 0; i < nums1.length; i++)
				m1.put(nums1[i], m1.getOrDefault(nums1[i], 0) + 1);
			
	        for (int i = 0; i < nums2.length; i++){
				if (m1.containsKey(nums2[i])) {
	                if(m1.get(nums2[i]) > 0){ 
					m1.put(nums2[i], m1.getOrDefault(nums2[i], 0) -1);
					al.add(nums2[i]);
	                }
				}
			}
			int[] arr = new int[al.size()];
			for (int j = 0; j < al.size(); j++)
				arr[j] = al.get(j);
			


	     return arr;   
	}
}
