package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
	// Utility function to swap two characters in a character array
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
 
        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
 
    public static void findPermutationsRecursion(String str) {
 
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
 
        permutations(str.toCharArray(), 0);
    }
    
 
    // generate all permutations of a string in Java
    public static void main(String[] args)
    {
        String str = "ABC";
        findPermutationsRecursion(str);
        findPermutationsIterative(str);
    }
 // Iterative function to generate all permutations of a string in Java
    // using Collections
	private static void findPermutationsIterative(String str) {
		
		// base case
        if (str == null || str.length() == 0) {
            return;
        }
 
        // create an empty ArrayList to store (partial) permutations
        List<String> partial = new ArrayList<>();
 
        // initialize the list with the first character of the string
        partial.add(String.valueOf(str.charAt(0)));
 
        // do for every character of the specified string
        for (int i = 1; i < str.length(); i++)
        {
            // consider previously constructed partial permutation one by one
 
            // (iterate backward to avoid ConcurrentModificationException)
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                // remove current partial permutation from the ArrayList
                String s = partial.remove(j);
 
                // Insert the next character of the specified string at all
                // possible positions of current partial permutation. Then
                // insert each of these newly constructed strings in the list
 
                for (int k = 0; k <= s.length(); k++)
                {
                    // Advice: use StringBuilder for concatenation
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
 
        System.out.println(partial);
	}
  
}
