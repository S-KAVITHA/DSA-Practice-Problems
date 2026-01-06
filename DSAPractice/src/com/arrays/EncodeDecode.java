package com.arrays;

import com.stackqueue.StackSort;

public class EncodeDecode {

	 public static void main(String []args){
	        String test = "Ali";
	        char encoder = 'D';
	        String encoded = encode(test, encoder);
	        System.out.println(encoded);
	        System.out.println(decode(encoded));
	        
	        test = "Test";
	        encoder = 'R';
	        encoded = encode(test, encoder);
	        System.out.println(encoded);
	        System.out.println(decode(encoded));
	     }
	     
	     private static String encode(String text, char encoder){
	        char firstChar = text.charAt(0);
	        int distance = encoder - firstChar;
	        String encoded = "" + encoder + firstChar;
	        for(int i = 1; i < text.length(); i++){
	            encoded += (char)(text.charAt(i) + distance);
	        }
	        return encoded;
	     }
	     
	     private static String decode(String text){
	        char encoder = text.charAt(0);
	        char firstChar = text.charAt(1);
	        int distance = encoder - firstChar;
	        String decoded = "" + firstChar;
	        for(int i = 2; i < text.length(); i++){
	            decoded += (char)(text.charAt(i) - distance);
	        }
	        return decoded;
	     }
	}

