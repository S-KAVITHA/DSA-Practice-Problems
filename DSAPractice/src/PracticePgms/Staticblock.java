package PracticePgms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staticblock {

	static boolean flag = false;
	static int B = 0;
	static int H = 0;
	static {
		
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter the Breath?");
	B = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the Height?");
	H = scanner.nextInt();
	scanner.nextLine();
	if ((B > 0) && (H > 0)) {
		 flag = true;
	} else {
		flag=false;
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	
	}
	
	public static void main(String[] args){
		
		if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}// end of main

}// end of class



