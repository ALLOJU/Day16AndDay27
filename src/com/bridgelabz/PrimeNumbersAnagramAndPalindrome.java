package com.bridgelabz;

import java.util.Arrays;

public class PrimeNumbersAnagramAndPalindrome {
	/**Purpose : To find prime numbers which are both anagram and palindrome
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeNumbersAnagramAndPalindrome primeAnagramPalindrome = new PrimeNumbersAnagramAndPalindrome();
		for (int i = 0; i <= 1000; i++) {
			if (primeAnagramPalindrome.isPrime(i)) {
				for (int j = i; j < 1000; j++) {
					if (i != j) {
						if (primeAnagramPalindrome.isPrime(j)) {
							if (primeAnagramPalindrome.isAnagram(String.valueOf(i), String.valueOf(j)) && primeAnagramPalindrome.isPalindrome(i)) {
								System.out.println(i + " " + j + " is prime and anagram and palindrome");
							}
						}
					}
				}

			}

		}

	}
	/**
	 * Purpose: method is check for palindrome number
	 * @param num input taken
	 * @return return true is num is palindrome else false
	 */
	private boolean isPalindrome(int num) {
	
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Purpose: method for finding two string are anagram or not
	 * @param str1 input from user
	 * @param str2 input from user
	 * @return true or false depending upon anagram or not
	 */
	private boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		if (str1.length() != str2.length()) {
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
	/**
	 * Purpose: method for finding prime number or not
	 * @param num input from user
	 * @return returns true if prime else not prime
	 */
	private boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
