package PracticePgms.Java67;


public class ReverseString {

	static /* Function to print reverse of the passed string */
	void reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}

	
	 public static String reverse1(String str) {
		 // DIRECT APPEND TO O/P OF FUNCTION RETURN VALUES.
		if ((str == null) || (str.length() <= 1))
			  return str;
		else {
			System.out.print(str.charAt(str.length() - 1));
			return str.charAt(str.length() - 1) + reverse1(str.substring(0, str.length() - 1));
		     
		}
	}
	 public static String reverseRecursively(String str) {
	       // USES STACK TO STORE ALL VALUES FINALLY RETURNS REVERSE O/P
	        if (str.length() < 2) {
	            return str;
	        }

	        return reverseRecursively(str.substring(1)) + str.charAt(0);
	    }

	
	public static void main(String[] args) {
		String str = "Geeks";
		//StringReverse obj = new StringReverse();
		reverse(str);
		String res= reverse1(str);
		System.out.print(res);
		
		String reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);


	}
}
