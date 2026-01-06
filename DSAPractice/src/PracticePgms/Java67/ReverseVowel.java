package PracticePgms.Java67;

public class ReverseVowel {

	public static void main(String args[]) {
		String s = "airoe";
		System.out.println(modify(s));
	}

	
	   static String modify (String s)
	   {
	       int start=0;
	       int end=s.length()-1;
	       char[] arr = s.toCharArray();
	       while(start<end){
	           if(!isVowel(arr[start])){
	               start++;
	               continue;
	           }
	           if(!isVowel(arr[end])){
	               end--;
	               continue;
	           }
	           char ch = arr[start];
	           arr[start] = arr[end];
	           arr[end] = ch;
	           start++;
	           end--;
	       }
	       return String.valueOf(arr);
	   }
	 
	private static boolean isVowel(char c) {
		 if( (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
					return true;
		}
		return false;
	}
}