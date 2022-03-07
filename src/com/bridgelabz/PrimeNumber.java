package com.bridgelabz;

public class PrimeNumber {
	/**
	 * program to print prime numbers between 0 -1000
	 * @param args - main method string arguments
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (PrimeNumber.isPrime(i)) {
				System.out.print(i + " ");
			}

		}
	}
	/**
	 * Purpose: method for finding prime number or not
	 * 
	 * @param num input from user
	 * @return returns true if prime else not prime
	 */
	public static boolean isPrime(int num) {
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
