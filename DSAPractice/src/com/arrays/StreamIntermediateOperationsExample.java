package com.arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
	/*
	 * public static void main(String[] args) { // List of lists of names
	 * List<List<String>> listOfLists = Arrays.asList( Arrays.asList("Reflection",
	 * "Collection", "Stream"), Arrays.asList("Structure", "State", "Flow"),
	 * Arrays.asList("Sorting", "Mapping", "Reduction", "Stream") );
	 * 
	 * // Create a set to hold intermediate results Set<String> intermediateResults
	 * = new HashSet<>();
	 * 
	 * // Stream pipeline demonstrating various intermediate operations List<String>
	 * result = listOfLists.stream() .flatMap(List::stream) // Flatten the list of
	 * lists into a single stream .filter(s -> s.startsWith("S")) // Filter elements
	 * starting with "S" .map(String::toUpperCase) // Transform each element to
	 * uppercase .distinct() // Remove duplicate elements .sorted() // Sort elements
	 * .peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on
	 * each element .collect(Collectors.toList()); // Collect the final result into
	 * a list
	 * 
	 * // Print the intermediate results
	 * System.out.println("Intermediate Results:");
	 * intermediateResults.forEach(System.out::println);
	 * 
	 * System.out.println(); // Print the final result
	 * System.out.println("Final Result:"); result.forEach(System.out::println); }
	 */
	
	/*

*/ 
	  // Function to Find Common Elements 
    private static void FindCommonElement(String[] arr1,String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
      
          // Common Elements in Arrays
          System.out.println(set.toString());
    }

    // Main Method
    public static void main(String[] args)
    {

        // Create Array 1
        String[] arr1 = { "Article", "in", "Geeks" };

        // Create Array 2
        String[] arr2 = { "Geeks", "for", "many" ,"may" , "in"};

        // Find the Common Elements
        FindCommonElement(arr1, arr2);
    }
}