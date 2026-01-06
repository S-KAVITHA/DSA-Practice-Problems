package PracticePgms;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of strings you want to enter: ");
        String[] string = new String[sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++) {
            string[i] = sc.nextLine();
        }
        System.out.println("\nYou have entered: ");
        
        int j = 1;
        for (String str : string) {
                    System.out.println( j + " " + str);
            j++;
        }
    }
}