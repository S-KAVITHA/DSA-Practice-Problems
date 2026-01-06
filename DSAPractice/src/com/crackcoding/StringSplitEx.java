package com.crackcoding;
import java.lang.*;
public class StringSplitEx {
	
	
	   public static void main(String[] args) {
	      String str = "good day! fine day. nice day,";
	    //  String delimiters = "\\s+|,\\s*|\\.\\s*";
	      String delimiters = "\\s";
	 
	      String[] tokensVal = str.split(delimiters);

	      System.out.println("Count of tokens = " + tokensVal.length);

	      for(String token : tokensVal) {
	         System.out.println(token.replaceAll("\\p{Punct}","" ));
	      }
	   }
	}

