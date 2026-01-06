package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
	 public static void main(String []args){
	        //String test = "Ali";
		 //String[] test = new String[] {"lint","code","love","you" };
		 List<String> test = new ArrayList();
		 test.add("lint");
		 test.add("code");
		 test.add("love");
		 test.add("you");
		 
	       // char encoder = 'D';
	        String encoded = encode(test);
	        System.out.println(encoded);
	       System.out.println(decode("4#lint4#code4#love3#you"));
	        
	       
	     }
	     
	 public static String encode(List<String> strs) {
	        StringBuilder encodedString = new StringBuilder();
	        for (String str : strs) {
	            encodedString.append(str.length()).append("#").append(str);
	        }
	        return encodedString.toString();
	 }
	     
	  public static List<String> decode(String str) {
	        List<String> list = new ArrayList<>();
	        int i = 0;
	        while (i < str.length()) {
	            int j = i;
	           // System.out.println(str.charAt(j));
	          
	            while (str.charAt(j) != '#') j++;
	            System.out.println((j));
	            int length = Integer.valueOf(str.substring(i, j));
	            i = j + 1 + length;
	            System.out.println((i));
	            list.add(str.substring(j + 1, i));
	        }
	        return list;
	    }
}
