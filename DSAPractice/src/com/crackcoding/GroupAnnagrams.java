package com.crackcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnnagrams {
	  public List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> result = new ArrayList<>();
	        
	        if (strs.length == 0) return result;
	        
	        HashMap<String , ArrayList<String>> map = new HashMap<>();
	        
	        for (String str: strs){
	           char[] arr = str.toCharArray();
	            Arrays.sort(arr);
	            String sorted = new String(arr);
	           
	            
	            if(map.containsKey(sorted)) 
	             { 
	                    ArrayList< String > list = map.get(sorted); 
	                    list.add(str); 
	                    map.put(sorted, list); 
	              } 
	             else
	              { 
	                     ArrayList < String > list = new ArrayList < > (); 
	                     list.add(str); 
	                     map.put(sorted, list); 
	             }              
	        }
	        
	        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
	            ArrayList<String> value = entry.getValue();
	            result.add(value);
	        }
	        return result;
	    }
}
