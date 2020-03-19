package com.syntax.class04;

import java.util.Scanner;

public class Task03 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which city you live?");
		String city=scan.nextLine();
		
		System.out.println("What is the temperature?");
		
		
		double fah=scan.nextDouble();
		double cel=(fah-32)*5/9;
		System.out.println("The temperature is the city "+city+" is "+cel);
		
		
	}

}
