package com.strings;

public class Stringpatternfound {


	    public static void main(String[] args) {
	        String text = "Navinreddy";
	        String pattern = "red";

	        int textLength = text.length();
	        int patternLength = pattern.length();

	        for (int i = 0; i <= textLength-patternLength; i++) {
	            int j;
	            System.out.println(text.charAt(i));
	            for (j = 0; j < patternLength; j++) {
	                if (text.charAt(i + j) != pattern.charAt(j)) 
	                    break;
	                
	            }
	            if (j == patternLength) {
	                System.out.println("Pattern found at index: " + i);
	                break;
	            }
	        }
	    }
	}

