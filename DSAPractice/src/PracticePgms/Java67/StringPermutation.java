package PracticePgms.Java67;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static List<String> permutations(String str) {
        List<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            List<String> subPermutations = permutations(remaining);
            for (String subPermutation : subPermutations) {
                result.add(ch + subPermutation);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> perms = permutations(str);
        System.out.println(perms);
    }
    
  //  ===============
    
    //leetcode 46
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> dataStructure = new ArrayList<>();
            recurPermute(nums,dataStructure,ans);
            return ans;
        }

         private void recurPermute(int[] nums, List<Integer> dataStructure, List<List<Integer>> ans) {
                if(dataStructure.size() == nums.length) {
                    ans.add(new ArrayList<>(dataStructure)); 
                    return;
                }
                for (int num : nums){
                    if (dataStructure.contains(num))
                        continue;
                    dataStructure.add(num);
                    recurPermute(nums,dataStructure,ans);
                    dataStructure.remove(dataStructure.size() - 1);
                }

         }
    }
    
}
