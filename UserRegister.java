package com.brifgelabz.day9;
import java.util.Scanner;
import java.util.regex.*;
public class UserRegister {

	public static void main(String[] args) {
		int namechk=0;
		while(namechk==0) {
			System.out.println("Please Enter your name");
			Scanner s=new Scanner(System.in);
			String name=s.next();
			namechk=chechname(name);


		}


	}

	private static int chechname(String name) {
		int check=0;
		Pattern pattern = Pattern.compile("([A-Z])\\w+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(name);
		boolean matchFound = matcher.find();
		if(matchFound) {
System.out.println("match found");
			return 1;
		}
		else {
			System.out.println("match not found");
			return 0;
		}
	}


}
