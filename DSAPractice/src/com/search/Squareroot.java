package com.search;

import java.util.HashMap;

public class Squareroot {
	static int mySqrt(int x) {
		//69. Sqrt(x) brute force
		
		//367. Valid Perfect Square
		
		
		
		int ans = 0;
		int i = 1;
		while (i <= x ) {

			int sqr = i * i;
			System.out.println("i" + i);
			if (sqr == x) {

				ans = i;
			}
			if (sqr > x) {
				ans = i - 1;
				break;
			}
			i++;
		}

		return ans;
	}

	
	static int mySqrtbin(int x) {
		//69. Sqrt(x) brute force
		  
        if (x == 1)
            return 1;
        
       int ans = 0;
		int start = 1 , end = x/2;
		
		while (start <= end ) {
			int mid = start + (end - start) / 2;
			int sqr = mid * mid;
			
			if (mid == x/mid) {

				return mid;
			}
			else if ( mid  > x/ mid) {
				end = mid - 1;
			}else if(mid < x/mid) 
                start = mid+1;
				
			
		}

		return end;
		
		/* Assign s, e , mid as long as mid * mid need more space
		 * finaly return only int 
		 * 
		 * 
		 * if (x == 1)
            return 1;
        
        long start = 1, end = x / 2;
        
        while (start <= end)
        {
            long mid = start + (end - start) / 2;

            if (x == mid * mid)
                return (int)mid;
            else if (x < mid * mid)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return (int)end;
		 * 
		 * 
		 * 
		 * 
		 */
	}
	public static void main(String args[]) {

		int x = 25;
		int y = mySqrtbin(x);
		System.out.print(y);

	}

}
