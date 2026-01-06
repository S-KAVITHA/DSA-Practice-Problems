package PracticePgms;
import java.util.*;
import java.text.*;

public class Currencyconvertor {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	        
	        Format india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	       
	        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        
	        // Write your code here.
	        
	        System.out.println("US: " + us.format(payment));
	        System.out.println("India: " + india.format(payment));
	        System.out.println("China: " + china.format(payment));
	        System.out.println("France: " + france.format(payment));
	    }
	}
	
	

