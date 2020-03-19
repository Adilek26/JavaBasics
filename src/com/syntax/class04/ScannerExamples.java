package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {
	public static void main(String[]args) {
		//Capture name from a user and
		//print in the format
		//My name is ---------
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("My name is"+name);
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		System.out.println("Your name is "+name+" Your age is "+age);
	}

}
