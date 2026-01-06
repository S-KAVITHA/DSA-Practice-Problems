package PracticePgms;

public class StringEg1 {

	//. Study the rule “String objects are Immutable” .
	
	
	 public static void main(String[] args)
	    {
	        String ta = "A ";
	        ta = ta.concat("B ");
	        String tb = "C ";
	        ta = ta.concat(tb);
	     // String append is only possible cant be changed
	        ta.replace('C', 'D');
	        
	        ta = ta.concat(tb);
	        System.out.println(ta);
	        
	        ta = ta.concat(tb);
	        System.out.println(ta);
	        
	    }
}
