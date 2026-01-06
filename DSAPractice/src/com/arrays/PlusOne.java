package com.arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String args[]) {
		int[] numbers;

		// initializing array after declaration
		numbers = new int[] { 8,9, 9 };
		int[] sol = new int[15];
		sol = plusOne(numbers);
		System.out.println(Arrays.toString(sol));
	}

	public static int[] plusOne(int[] digits) {

		
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
				
			} else {
				digits[i]++;
				return digits;
			}
		}
		int[] sol = new int[digits.length + 1];
		System.out.println(Arrays.toString(sol));
		sol[0] = 1;
		System.out.println(Arrays.toString(sol));
		return sol;
		
		
		/*
		 * 
		 *  int carry = 0, sum;

	    List<Integer> list = new LinkedList<>();
	    int k = 1;
	    for(int i=num.length-1; i>-1; i--)
	    {
	        sum = carry + (k%10) + num[i];
	        list.add(sum%10);
	        carry = sum/10 ;
	        k =  k / 10;            
	    }
	    
	    int rest = k + carry;
	      
	    while(rest > 0)
	    {
	       
	        list.add(rest%10);
	       rest /= 10;
	    }
	    
	    Collections.reverse(list);    
	    
 
        System.out.println(list.toString());
       
          int[] r = new int[list.size()];
       
       
  int index = 0;
        for (Integer x : list){
            System.out.print(x + " ");
        r[index] = x;
            index++;
        }
	    return r;
	  

		 */
	}
}
