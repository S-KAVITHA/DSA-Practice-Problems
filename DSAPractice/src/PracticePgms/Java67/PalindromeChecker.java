package PracticePgms.Java67;

/**
 * * Java program to check if given String is palindrome or not. * * @author
 * WINDOWS 8
 */
public class PalindromeChecker {
	 public static boolean isPalindrome(
			 //recursive
			String input) {
		if (input == null) {
			return false;
		}
		String reversed = reverse(input);
		return input.equals(reversed);
	}

	public static String reverse(String str) {
		
		System.out.println(str);
		if (str == null) {
			return null;
		}
		if (str.length() <= 1) {
			return str;
		}
		
		System.out.println(str.charAt(0));
		System.out.println(str.substring(1));
		
		System.out.println(str.substring(1) + str.charAt(0));
		return reverse(str.substring(1)) + str.charAt(0);
	}

	 public static boolean checkPalindrome(
			String text) {
		 
		 //iterative
		StringBuilder sb = new StringBuilder(text);
		char[] contents = text.toCharArray();
		for (int i = text.length() - 1; i >= 0; i--) {
			sb.append(contents[i]);
		}
		String reversed = sb.toString();
		return text.equals(reversed);
	}
	 
	 public static boolean isPalindrome1(String s) {
	        s = s.toLowerCase();
	        s = s.replaceAll(",","");
	        s =s.replaceAll(" ","");
	        s = s.replaceAll(":","");

	        int l = 0;
	        int r = s.length() - 1;

	        while (l<r){
	            if (s.charAt(l) == s.charAt(r)){
	                l++;
	                r--;
	            }else
	                return false;
	        }

	        return true;
	    }
	 public static void main(String[] args) 
	    {
	        String str = "A man, a plan, a canal: Panama";
	        System.out.println(isPalindrome(str));
	        System.out.println(checkPalindrome(str));
	        System.out.println(isPalindrome1(str));
	        
	    }    
	 
}

