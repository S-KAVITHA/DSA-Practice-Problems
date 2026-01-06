package PracticePgms;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Numberprint {



    // Complete the countUp function below.
    static void countUp(int start) {
    
    	
    	StringBuilder a = new StringBuilder();
    	  
    	 
    for (int i=1  ; i<= 10 ; i++){
    	start += 1;
        if (i==1 ){
        	 a.append(start);
     
        } else {
        	
        	 a.append(" then ");
        	 a.append(start);
         
        }      
        
    }
    System.out.println(a);  
}

    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(bufferedReader.readLine().trim());

        countUp(start);

        bufferedReader.close();
    }
}

