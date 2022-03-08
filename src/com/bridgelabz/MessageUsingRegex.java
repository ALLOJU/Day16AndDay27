package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageUsingRegex {
	
	
	private final static String REGEX_NAME = "<<name>>";
	private final static String REGEX_FULLNAME = "<<full name>> ";
	private final static String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final static String REGEX_DATE = "12/06/2016";
	BufferedReader br;
	/**
	 * date formatted in dd/mm/yyyy manner
	 * @param date
	 * @return
	 */
	public static String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}
	
	
	//constructor to initialize bufferedReader
	public MessageUsingRegex(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	/**
	 * get text message from file as string
	 * @param path
	 * @return
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
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		UserDetails user=new UserDetails();
	
		
		System.out.println("Enter User first name");
		user.setFirstName(sc.next());
		System.out.println("Enter Last name");
		user.setLastName(sc.next());
		System.out.println("Enter mobile number");
		user.setMobileNo(sc.next());
		user.setDate(MessageUsingRegex.getFormatedDate(new Date(12/06/2016)));
		String str =MessageUsingRegex.getFromFile("C:/Users/nani/Documents/Java Programs/Day16AndDay17/src/com/bridgelabz/newfile.txt");
		System.out.println(str);
	
		System.out.println(MessageUsingRegex.convertString(user,str));
		sc.close();
	}
	/**
	 * Regex pattern matcher match the string and replace the regex pattern with user details.
	 * @param user - input of user details like first name,lastname,mobile number,date
	 * @param message - input text from the text file
	 * @return
	 */
	private static String convertString(UserDetails user, String message) {
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(user.getFirstName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(user.getFirstName()+" "+user.getLastName()+" ");

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(user.getMobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(user.getDate());

		return message;
	}
}
