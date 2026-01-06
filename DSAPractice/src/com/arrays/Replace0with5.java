package com.arrays;

public class Replace0with5 {
	 int convertfive(int num) {
		    int digit=0,res=0;
		      int count=1;
		      while(num>0){
		         digit = (num %10);
		         if (digit == 0){
		             digit =5;
		         }
		         res += (digit*count);
		         num = (num / 10);
		         count=count*10;
		      } 
		      return res;
		    }
}
