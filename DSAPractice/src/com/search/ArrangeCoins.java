package com.search;

public class ArrangeCoins {
	
// 441 Arranging Coins | LeetCode 441 | C++, Java, Python
	public static void main(String args[]) {
		// o( n2)
		//int[] array = { 6, 5, 12, 10, 9, 1 };

		System.out.println(arrangeCoins(1189641421));

	}
	
	 public static int arrangeCoins(int n) {
	        boolean flag = true;
	        
	    int i=1, result = 0;int sum= 0;
	        while(flag){
	            
	            sum += i;
	            if (sum <= n){
	                result ++;
	               // System.out.println("sum"+sum);
	                System.out.println(result);
	            }else
	                flag = false;
	            i++;
	        }
	    return result;
	    }
	 public int arrangeCoinsbINARY(int n) {
	 long s = 0, e = n;
	    while(s <= e){
	        long mid = s + (e-s)/2;
	        long k = mid*(mid+1)/2; //Sum of n no's formulae
	        
	        if(k == n){
	            return (int)mid;
	        }
	        else if (k > n){
	            e = mid - 1;
	        }
	        else{
	            s = mid + 1;
	        }
	    }
	    return (int)e;
	}
}
	
