package com.syntax.class05;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your heights");
		int height=scan.nextInt();
	if(height>0 && height<60) {
		System.out.println("You are short");
	}else if(height>=60 && height<72) {
		System.out.println("You are medium size");
	}else {
		System.out.println("You are tall");
	}
	System.out.println("---weekdays------");
	
	
	System.out.println("Please enter the day");
	int day=scan.nextInt();
	if (day>0 && day<=5) {
		System.out.println("It Is a weekday");
	}else if(day>5 && day<=7) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("invalid day");
	}
	System.out.println("----or using--------");
	if(day==1 ||day==2 || day==3 || day==4 ||day==5 ) {
		System.out.println("It is a weekday");
	}else if(day==6 ||day==7) {
		System.out.println("It is weekend");
	}else {
		System.out.println("invalid day");
	}
}
}
