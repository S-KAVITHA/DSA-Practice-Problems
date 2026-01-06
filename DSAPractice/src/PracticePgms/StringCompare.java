package PracticePgms;

public class StringCompare {

	public static void main(String[] args) {
		// == checks for same object reference in memory
		// equals checks if objects are equal.
		useOperators1();
		useOperators2();
	}

	static void useOperators1() {
		String s = new String("hello");
		String s2 = s;
		System.out.println("***********************");
		System.out.println("First Method");
		System.out.println("***********************");
		if (s == s2) {
			System.out.println("==");
		}

		if (s.equals(s2)) {
			System.out.println("equals");
		}
		System.out.println("***********************");
	}

	static void useOperators2() {
		System.out.println("***********************");
		System.out.println("Second Method  *");
		System.out.println("***********************");
		String s = new String("hello");
		String s2 = "hello";

		if (s == s2) {
			System.out.println("==");
		}

		if (s.equals(s2)) {
			System.out.println("equals");
		}
		System.out.println("***********************");
	}
	
	//Reason: Because String class equals method compare objects, but == operator only compares references. If both the references are pointing to the same object then only == operator returns true.
	//Reason: Because both the references are pointing to the same object so “==” printed and If both the reference are pointing to the same object so by default they the equal so “equals” printed.
}
