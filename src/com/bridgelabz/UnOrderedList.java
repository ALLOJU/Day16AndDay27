package com.bridgelabz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedList {
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


		UnOrderedList ul=new UnOrderedList();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		try {
			strArray = ul.readFile(
					"C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/file.txt")
					.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}
		System.out.println(list.show());

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());

		try {
			ul.writeFile(
					"C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/file.txt",
					list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
