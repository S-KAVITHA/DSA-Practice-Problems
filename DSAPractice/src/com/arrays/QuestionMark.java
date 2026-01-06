package com.arrays;

import java.util.*; 
import java.io.*;

class Main {

  public static String QuestionsMarks(String str) {

String result = "false";

    int questionMarkCount;
  Integer value1;
  Integer value2;
  boolean addsUpToTen = false;
    for(int i = 0; i < str.length(); i++)
    {
        questionMarkCount = 0;
        if(Character.isDigit(str.charAt(i)))
        {
            value1 = Character.getNumericValue(str.charAt(i)); 
            for(int j = i+1; j < str.length(); j++)
            {
                if(Character.isDigit(str.charAt(j)))
                {
                    value2 = Character.getNumericValue(str.charAt(j));
                    
                    if(value1 + value2 == 10)
                    {
                        
                         if(questionMarkCount == 3)
                         return "true";
                        
                        if(questionMarkCount != 3)
                        {
                            //return "false";
                            addsUpToTen = false;
                        }
                        
                        break;
                    }
                    
                }
                
                else if(str.charAt(j) == '?')
                {
                    questionMarkCount += 1;
                }
                
            }
        }
    }
    
    if(!addsUpToTen)
    {
        return "false";
    }
    
    else
    {
        return "true";
    }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }

}


== RUNNING SAMPLE TEST CASES ==

== INPUT ==
"acc?7??sss?3rr1??????5"

== OUTPUT ==
true
<< CORRECT >>

== INPUT ==
"aa6?9"

== OUTPUT ==
false
<< CORRECT >>

== 8 TEST CASES HIDDEN ==

false
false
false
== RUNNING SAMPLE TEST CASES ==

== INPUT ==
"acc?7??sss?3rr1??????5"

== OUTPUT ==
true
<< CORRECT >>

== INPUT ==
"aa6?9"

== OUTPUT ==
false
<< CORRECT >>

== 8 TEST CASES HIDDEN ==

false
== RUNNING SAMPLE TEST CASES ==

== INPUT ==
"acc?7??sss?3rr1??????5"

== OUTPUT ==
true
<< CORRECT >>

== INPUT ==
"aa6?9"

== OUTPUT ==
false
<< CORRECT >>

== 8 TEST CASES HIDDEN ==
