package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOfStrings {
	/**
	 * program to calculate anagram of strings means anagram can be found by rearranging the letters 
	 * of the words
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.next();
		System.out.println("Enter second String");
		String s2=sc.next();
		boolean isAnagram=AnagramOfStrings.isAnagram(s1,s2);
		if(isAnagram) {
			System.out.println("Two Strings are Anagram");
		}
		else {
			System.out.println("Two Strings are Not Anagram");

		}
	}
	/**
	 * Purpose: method for finding two string are anagram or not
	 * 
	 * Identifier: P1AnagramDetection
	 * 
	 * @param str1 input from user
	 * @param str2 input from user
	 * @return true or false depending upon anagram or not
	 */
	private static boolean isAnagram(String s1, String s2) {
		
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		if (s1.length() != s2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
}
