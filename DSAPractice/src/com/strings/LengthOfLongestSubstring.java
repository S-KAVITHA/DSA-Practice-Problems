package com.strings;

public class LengthOfLongestSubstring {

	// LEETCODE 3
	
	int longestUniqueSubsttr(String s) {
        /*int len = s.length();
        if (len == 1 ) return 1;
        
        int maxlen = 0;
        for (int i=0 ; i < s.length()-1 ; i++){
            StringBuilder temp = new StringBuilder();
               temp.append(s.charAt(i)); 
            for (int j=i+1 ; j < s.length() ; j++){
                if (temp.indexOf(String.valueOf(s.charAt(j))) == -1){
                    temp.append(s.charAt(j)); 
                    maxlen = Math.max(maxlen,temp.length());
                }
            }
        }
        return maxlen;*/
        
        
      int n = s.length();
        if(n<=1) return n;
        int maxLen = 0;
        int left = 0, right=0;
        HashMap<Character,Integer> map = new HashMap<>(); 
        while(right<n){
        char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                int len = right-left;
                maxLen = Math.max(maxLen,len);
                left = map.get(ch) + 1;
            }
         map.put(ch,right);
         right++;
        }
        int len = right-left;
        maxLen = Math.max(maxLen,len);
        return maxLen;
        
        
    }
	
	
	 public int lengthOfLongestSubstring(String s) {
	     if ((s == null) || (s.length() == 0))
				return 0;

			if (s.length() == 1)
				return 1;

			int left = 0;
			int right = 0;
			int ans = 0;
			Set<Character> set = new HashSet<>();

			while (right < s.length()) {
				char c = s.charAt(right);
				while (set.contains(c)) {
					set.remove(s.charAt(left));
					left++;
				}
				set.add(c);
				ans = Math.max(ans, right - left + 1);
				right++;
			}

			return ans;
	    }
	 
}
