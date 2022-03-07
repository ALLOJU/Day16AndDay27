package com.bridgelabz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Purpose: Program is for ordered list is implemented using linked list.
 * @author mounika
 *
 */
public class OrderedList {
	public String readFile(String path) throws IOException {
		String str = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}
	public String writeFile(String path, String str) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(str);
		bufferedWriter.close();
		return "\nFile is Written...";
	}
	public static void main(String[] args) {
		OrderedList OrderedList = new OrderedList();
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] strArr = null;

		try {
			strArr = (OrderedList.readFile(
					"C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/numbers")
					.split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] integerArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			integerArr[i] = Integer.parseInt(strArr[i]);
			list.add(integerArr[i]);
		}
		int size = integerArr.length;
		System.out.println(list.show());
		System.out.println("\nSorting");
		list.sort(size);
		System.out.println(list.show());

		System.out.println("\nEnter key to search in list:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		size = list.searchNode(key, size);



		scanner.close();

		System.out.println("\nSorting");
		list.sort(size);

		System.out.println(list.show());
		String str = list.returnListInString();
		try {
			OrderedList.writeFile(
					"C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/numbersoutput",
					str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
