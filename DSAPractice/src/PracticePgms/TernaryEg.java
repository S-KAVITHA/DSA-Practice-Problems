package PracticePgms;

public class TernaryEg {
//Study ternary operator and its compile time errors.
	public static void main(String[] args) {

		method1();
		method2();

	}

	static void method1() {

		int marks = 50;
		
		//below code shows compile time error
		
        /*String result = marks > 60 ? "Pass with 1st div."
                        : marks < 50 ? "Pass with 2nd div." : 
                          marks < 40 ? "Pass with 3nd div.";*/
		
		int marks1 = 90;
        String result = marks1 > 60 ? "Pass with 1st div."
                        : marks1 < 50 ? "Pass with 2nd div." : 
                          marks1 < 40 ? "Pass with 3nd div." : "fail";
        System.out.println(result);
        
       
	}

	static void method2() {

		int marks = 90;
		String result = marks > 35 ? "Pass" : "Fail";
		System.out.println(result);
	}
}
