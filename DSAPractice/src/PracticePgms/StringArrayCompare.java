package PracticePgms;

import java.util.Scanner;
import java.util.*;

public class StringArrayCompare
{
  public static void main (String[]args) throws Exception
  {
   /* String arr[] = {"meow","bray","mood"};
    String a="meow";
    String b="meow1";
    String c = new String("meow");
    System.out.println(arr[0].equals(c));
    System.out.println(arr[0]==(c));
    System.out.println(c==a);
    System.out.println(Arrays.toString(arr));
    
    String a1="meow";
    String b1 = a1 + "deal";
    String abc = "meowdeal";
    System.out.println(abc);
    System.out.println(b1);
    System.out.println(b1==abc);
    
    */
             String s1 = "Hello".concat("World"); // s1 to be created in heap.
          String s2 = s1.intern(); //Line-2   //Since "HelloWorld" doesn't exist in String constant pool (SCP), s1 and s2 point the same.      
          String s3 = "HelloWorld"; //Line-3  s3 to be created in SCP.
          String s4 = s1.intern();  //Since "HelloWorld" exists in SCP, s3 & s4 should refer to String in SCP.
          System.out.println(s1 == s2); // true
          System.out.println(s1 == s4); // Expected false. But it is true.
          System.out.println(s1 == s3); // Expected false. But it is true. 
          System.out.println(s3 == s4); //true
       }
    }