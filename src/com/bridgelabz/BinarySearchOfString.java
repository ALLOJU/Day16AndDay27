package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchOfString {
	/**
	 * Purpose: method for taking information from file
	 * 
	 * @param path directory path given by program
	 * @return String of information which is there in file
	 */
	public static String getFromFile(String path) {
		BufferedReader bufferedReader = null;
		String str = "";
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			str = bufferedReader.readLine();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * Purpose: method for to find string in the  binary search
	 * 
	 * Identifier: P4CallUtility
	 * 
	 * @param arr input from user
	 * @param key input from user
	 * @return returns index of key searched else returns -1
	 */
	public static int stringBinarySearch(String[] arr, String key) {
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid].equals(key))
				return mid;

			if (arr[mid].compareTo(key) > 0)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		String str = BinarySearchOfString.getFromFile("C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/file.txt");
		String[] strArr = str.split(",");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter key to search");
		String key = scanner.next();
		int index = BinarySearchOfString.stringBinarySearch(strArr, key);
		if (index >= 0)
			System.out.println("Key found at index : " + index + " which is : " + strArr[index]);
		else if(index==-1) {
			System.out.println("Key not found");
		}
		
		scanner.close();
	}
}
