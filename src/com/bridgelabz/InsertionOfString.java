package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InsertionOfString {
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
	public static String[] stringInsertionSort(String[] arr) {
		String key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		String str = InsertionOfString.getFromFile("C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/file.txt");
		String[] strArr = str.split(",");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		stringInsertionSort(strArr);
		System.out.println("After insertion sort");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		
	}
}
