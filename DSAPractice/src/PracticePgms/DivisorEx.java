package PracticePgms;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int number=input.nextInt();
	    int j = 0;
	    
	         for(int i = 1; i <= number; i++) {
	        	 System.out.println(i);
	             if (number % i == 0) {
	                 j = j + i; 
	                
	                //System.out.println(j);
	             }
	             
	         
	         }
	         System.out.println("The Sum Of The Divisors is: ");
	         System.out.println(j);
	}
	
}
