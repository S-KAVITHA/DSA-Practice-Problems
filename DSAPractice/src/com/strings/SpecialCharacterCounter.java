package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterCounter {

    public static void main(String[] args) {
        String inputString = "Hello, World! @#$%";
        int count = countSpecialCharacters(inputString);
        System.out.println("Number of special characters: " + count);
    }

    public static int countSpecialCharacters(String str) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]"); // Matches anything that is not a letter, number, or whitespace
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}