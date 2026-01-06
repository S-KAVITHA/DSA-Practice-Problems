package com.crackcoding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCharacter     
{    
     public static void main(String[] args) {    
        String str = "picture perfect";    
        int[] freq = new int[str.length()];    
        int i, j;    
            
        //Converts given string into character array    
        char[] string = str.toCharArray();    
        System.out.println(string); 
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(i = 0; i <str.length(); i++) {    
            
               // if(map.containsKey(string[i])) { 
                //	int count = map.get(string[i]);
        	    	 if (string[i]  != ' ')  {
                       map.put(string[i], map.getOrDefault(string[i], 0)+1);
        	}
               // }   else
                //	 map.put(string[i], 1);
          
            
        }
        
        System.out.println(string);

        
        //Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(Entry<Character, Integer> m : map.entrySet()) {    
               
                System.out.println(m.getKey() + "-" + m.getValue());    
        }    
    }    
}    