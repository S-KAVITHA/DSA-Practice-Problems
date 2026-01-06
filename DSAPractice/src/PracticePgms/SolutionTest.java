package PracticePgms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'ChangeMaker' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. FLOAT price 2. FLOAT_ARRAY payment
	 */

	public static List<Integer> ChangeMaker(float price, List<Float> payment) {
		float totalAmt = 0;
		int diffAmt = 0;
		List<Integer> retunAmt = new ArrayList<Integer>();
		for (float element : payment) {
			
			totalAmt =  totalAmt + element;
		}
		
		System.out.println(totalAmt);
		
		if (totalAmt > price) {
			diffAmt = (int) (totalAmt - price);
			
		}
		
		
	if	diffAmt % 10 
		
		if (diffAmt > 5) {
			retunAmt.add(0, diffAmt);
			
		}
		
		if (diffAmt < 5 && diffAmt > 10) {
			int remainAmt = diffAmt - 5 ;
			
			retunAmt.add(0, remainAmt);
			retunAmt.add(1, 5);
			
		}
		
		if (diffAmt < 10 && diffAmt > 20) {
			int remainAmt = diffAmt - 5 ;
			
			retunAmt.add(0, remainAmt);
			retunAmt.add(1, 5);
			
		}
		
	
		return null;
	}

}

public class SolutionTest {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		float price = Float.parseFloat(bufferedReader.readLine().trim());

		int paymentCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Float> payment = IntStream.range(0, paymentCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Float::parseFloat).collect(toList());

		List<Integer> result = Result.ChangeMaker(price, payment);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
