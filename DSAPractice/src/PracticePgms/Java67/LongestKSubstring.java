package PracticePgms.Java67;

import java.util.HashMap;
import java.util.Map;

public class LongestKSubstring {
	//Given a string you need to print the size of the longest possible substring that has exactly K unique characters. 
	//If there is no possible substring then print -1
	
	public static void main(String args[]) {
		String s = "aabacbebebe";
		int x;
		try {
			x = longestkSubstr(s, 3);
			System.out.println(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	 public static int longestkSubstr(String s, int k) {
	        int left = 0, right = 0;
	        char[] arr = s.toCharArray();
	        int n = arr.length;
	        int ans = -1;
	        HashMap<Character, Integer> map = new HashMap<>();
	        while(right<n) {
	       
	            map.put(arr[right], map.getOrDefault(arr[right], 0) +1);
	            if(map.size()==k){
	                ans = Math.max(ans, right-left+1);
	            }
	            if(map.size()>k){
	              
	                map.put(arr[left],map.get(arr[left])-1);
	                if(map.get(arr[left])==0){
	                	map.remove(arr[left]);
	                }
	                left++;
	            }
	            right++;
	        }
	        return ans;
	    }
	 
	 
	public static int longestkSubstr1(String s, int k) {

		if ((s == null )|| (s.length() == 0) || ( k <= 0 ) || (k > s.length()))
	    	return -1;
	        HashMap<Character , Integer> map = new HashMap<>();
	        int i = 0;
	        int j = 0;
	        
	        int max = Integer.MIN_VALUE;
	        int n = s.length();
	        
	        while (j < n)
	        {
	            //calculation
	            char ch = s.charAt(j);
	                map.put (ch , map.getOrDefault(ch, 0)+1);
	          
	                       
	            int size = map.size();
	            
	            if (map.size() < k)
	            {
	                j++;
	            }
	            
	            else if (size == k)
	            {
	                max = Math.max(max , j-i+1);
	                j++;
	            }
	            
	            else if (size > k)
	            {
	                while (size > k)
	                {
	                    char chi = s.charAt(i);
	                    if (map.containsKey(chi))
	                    {
	                        map.put (chi , map.get(chi) - 1);
	                    }
	                    
	                    if (map.get(chi) == 0)
	                    {
	                        map.remove(chi);
	                        size--;
	                    }
	                    
	                    i++;
	                }
	                
	                j++;
	            }
	        }
	        
	        if (max == Integer.MIN_VALUE)
	        {
	            return -1;
	        }
	        
	        return max;
	}

}
