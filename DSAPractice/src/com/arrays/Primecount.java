package com.arrays;

import java.util.Scanner;

public class Primecount {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int k= sc.nextInt();
        display(k);
        }
    }

	static boolean isPrime(int n) {
		
		 if(n<=1) return 0;
	      
	        boolean[] isPrime = new boolean[n];

	       
	        for (int i = 2; i < n; i++) {
	            isPrime[i] = true;
	        }
	      
	        for (int i = 2; i*i < n; i++) {
	            if (isPrime[i] == true) {
	                for (int j = i * i; j < n; j += i) {
	                    isPrime[j] = false;
	                }
	            }
	        }

	        //count
	        int count = 0;
	        for (int i = 2; i < n; i++) {
	            if(isPrime[i] == true){
	                count++;
	            }
	        }
	        return count;
	        
	        
	        
		/*//System.out.println(n);
		int sqt = (int) Math.sqrt(n);
		//System.out.println(sqt);
		for (int i = 2; i <= sqt; i++) {
		//	System.out.println("enter");
		
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void display(int k) {

		int count = 0;

		for (int i = 2; i <= k; i++) {
			if (isPrime(i))
				count++;
		}

		System.out.println(count);
	}
*/
}