package com.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MostRepeatedWord {

	public static void main(String[] args) {

		try {
			File file = new File("test.txt");
			if (file.createNewFile()) {
				System.out.print("CREATED");

			} else
				System.out.println("exists");

			FileWriter fw = new FileWriter(file);
			String test = "This is a wonderful day!!!";
			String test1 = "\nThis is a good day!!!";
			String test2 = "\nThis is a bad day!!!";
			String test3 = "\nThis is a normal day!!!";
			String test4 = "\nThis is a super day!!!";

			fw.write(test);
			fw.write(test1);
			fw.write(test2);
			fw.write(test3);
			fw.write(test4);

			fw.close();
			String line = "" ;
			 ArrayList<String> words = new ArrayList<String>();    
			Scanner scanner = new Scanner(file);
			System.out.println("--------------------------------");
			while (scanner.hasNextLine()) {
				 line = line + scanner.nextLine() + " ";
				
			}
			
			System.out.println(line);
			
			System.out.println("---------------------------------");

			HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();	
			 String[] tokens = line.split("\\s");
			for (String a: tokens) {
				words.add(a);
				
			}
			
			 System.out.println(tokens.length );
			 
			 
			 
			  for(int i = 0; i < words.size(); i++){   
				  if (words.get(i).isEmpty())
		            hm.put(words.get(i), hm.getOrDefault(words.get(i),0)+1);    
			  }
			 
			  int max= 0;
			  for(Map.Entry<String, Integer> es:hm.entrySet()) {
				 				
					if (max <= es.getValue()) {
						max= es.getValue();
						System.out.println(es.getKey() +" " + es.getValue()+" " );	
					}
			  }
			  
			System.out.println("---------------------------------");

			FileReader fr = new FileReader(file);
			System.out.println(file.length());
			
			int i;
	           while((i = fr.read()) != -1) {
	            System.out.print((char)i);
	           }
			  
			/*char[] a = new char[(int) file.length()];
			
			 * while (fr.read(a) != -1) {
			 * 
			 * for (char c : a) System.out.print(c); }
			 * 
			 * 
			 */
			fr.close();

		} catch (IOException e) {

			System.out.print("error");
		}

	}
}
