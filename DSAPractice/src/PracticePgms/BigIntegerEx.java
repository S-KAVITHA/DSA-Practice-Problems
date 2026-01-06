package PracticePgms;

import java.util.*;
import java.math.*;

public class BigIntegerEx {

	public static void main(String[] args) {
		BigInteger m = BigInteger.valueOf(1);
		BigInteger n = BigInteger.valueOf(1);
		Scanner sc = new Scanner(System.in);
		m = sc.nextBigInteger();
		n = sc.nextBigInteger();
		System.out.println(m.add(n));
		System.out.println(m.multiply(n));
		sc.close();

		
	}
}