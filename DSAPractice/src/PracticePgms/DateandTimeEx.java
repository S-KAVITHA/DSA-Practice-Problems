package PracticePgms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
	import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DateandTimeEx {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(String month, String day, String year) throws ParseException {

		int d = Integer.parseInt(day);
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);
		LocalDate lt = LocalDate.of(y, m, d);
		return lt.getDayOfWeek().name();
		
	}

	public static void main(String[] args) throws IOException, ParseException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ");
		 * 
		 * int month = Integer.parseInt(firstMultipleInput[0]);
		 * 
		 * int day = Integer.parseInt(firstMultipleInput[1]);
		 * 
		 * int year = Integer.parseInt(firstMultipleInput[2]);
		 */

		@SuppressWarnings("resource")
		/*Scanner scanIn = new Scanner(System.in);
		String get_date = scanIn.nextLine();*/

		String month = "02";
		String day = "05";

		String year = "2014";
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);

		String res = DateandTimeEx.findDay(month, day, year);
		System.out.println(res);

		/*
		 * bufferedWriter.write(res); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
	}
}
