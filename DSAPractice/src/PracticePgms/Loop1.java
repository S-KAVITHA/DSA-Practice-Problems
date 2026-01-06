package PracticePgms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loop1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		int i = 0;

		for (i = 1; i <= 10; i++) {
			int Multi_value = i * N;
			System.out.println(N + "×" + i + "=" + Multi_value);
		}
		bufferedReader.close();
	}
}
