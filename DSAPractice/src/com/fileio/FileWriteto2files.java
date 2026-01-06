package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteto2files {
	public static void main(String[] args) throws IOException {

		// File write first step
		FileReader fr = null;
		FileWriter fw1 = null;
		String res[] = { "This is a good day", "This is a nice day", "This is a super day","This is a bad day" };

		try {

			fw1 = new FileWriter("sample.txt");

			for (String s : res) {
				fw1.write(s + "\n");
			}
			System.out.println();
			System.out.println("Successfully wrote to the file.");
			fw1.close();

		} catch (Exception e) {
			System.out.print("Error occurred in file IO");
		}

		// Read and write to another file
		try {
			fr = new FileReader("sample.txt");
			FileWriter fw2 = new FileWriter("Output.txt");
			
			int i;
			String str1 = "";
			
			while ((i = fr.read()) != -1) {
				
					str1 += (char) i;
			}
			
			fw2.write(str1);
			
			fw2.close();
			
			fr.close();

		} catch (Exception e) {
			System.out.print("Error occurred in file IO");
		}

		// Read and write to 2 files
		try {
			fr = new FileReader("sample.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw2 = new FileWriter("Output1.txt");
			FileWriter fw3 = new FileWriter("Output2.txt");

			String i="";
			String str1 = "";
			String str2 = "";
			int count=1;
			while ((i =br.readLine()) != null) {
				if (count % 2 == 0)
					fw2.write(i+"\n");
				
				else
					fw3.write(i+"\n");
				count++;
			}
			
			
			

			fw2.close();
			fw3.close();
			fr.close();

		} catch (Exception e) {
			System.out.print("Error occurred in file IO");
		}

	}
}
