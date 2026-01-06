package PracticePgms;

public class ANDoperator {

	//. Study the difference between &(Bitwise AND) and &&(Logical AND) Operator.
	//Reason: Because ‘&&’ operator doesn’t check second operand if value for the first operand is ‘false’. But ‘&’ must check both the operands.
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (++a <= 10 && --b < 20) {
		}
		System.out.println("Output of && operator: " + "a = " + a + " b = " + b);
		System.out.println("-------------");

		a = 10;
		b = 20;
		if (++a <= 10 & --b < 20) {
		}
		System.out.println("Output of & operator: " + "a = " + a + " b = " + b);
	}
}
