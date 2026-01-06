package PracticePgms;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String args[]){
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(3);
		primes.add(5);
		
		System.out.println("list of prime numbers : " + primes);

		
		Set<Integer> removeDuplicate = new LinkedHashSet<Integer>(primes);
		primes.clear();
		primes.addAll(removeDuplicate);
		
		
		int[] nums = new int[] {1,1,1,2,2,3};
		
		System.out.println("Duplicate removal : " + removeDuplicate(nums));	

	}
	
	  private static int removeDuplicate(int[] nums) {
		  int n = nums.length;
		    int twiceCount = 0;

		    if(n==0 || n==1){
		       return n;
		    }
		        
		    int j = 0;
		    for(int i=1; i<n-1; i++){
		        
		        if(nums[i]!=nums[i-1]){
		            nums[j++]=nums[i];
		            twiceCount = 0;
		        }else{
		            if (twiceCount < 2){
		               nums[j++]=nums[i];
		                twiceCount++; 
		            }
		        }
		    }
		    nums[j++]=nums[n-1];
		    return j;

		    }
	  
}
