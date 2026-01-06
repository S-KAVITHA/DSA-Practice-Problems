package com.arrays;

public class FindNUniqueSumtoZero {

	//1304. Find N Unique Integers Sum up to Zero
	
	 public int[] sumZero(int n) {
		 int[] arr = new int[n];   

		    int i = 0, j = n - 1;  //accessing the array from two ends
		    int pos = 0, neg = 0;  //storing an integer and it's negative value

		    while (i < j) {
		      arr[i] = ++pos; 
		      arr[j] = --neg;
		      i++;
		      j--;
		    }

		    if (n % 2 == 1) {
		      arr[n / 2] = 0;
		    }
		    
		    return arr;
		    
		    
		    
		    
		    int a[]=new int[n];
		    if(n%2!=0)
		    {
		    a[n-1]=0;
		    n=n-1;
		    }
		    int k=1;
		    for(int i=0;i<n;i+=2)
		    {
		    a[i]=k;
		    a[i+1]=k*(-1);
		    k+=1;
		    }
		    return a;
		    
		    
		    
		    int[] res = new int[n]; // store here the result of our array
	        int num = n/2; // we will get pairs of number divided by half of N
	        
	        // jump every two indexes, cus we will populate res with two values each time
	        for(int i =0; i<n-1; i+=2){
	            res[i] = num;
	            res[i+1] = -num;
	            num--;
	        }
	        
	        return res
	        		
	        		
	    }
}
