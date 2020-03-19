package com.syntax.class05;

import java.util.Scanner;

public class TaskHW03 {
public static void main(String[] args) {
	/* 1.Write a program to find largest of three double values using if-else..if
	 * and logical operators provided by a user (numbers must be distinct)
	 * 2.Program to find largest number among three numbers using nested if provided by a user
	 * (numbers must be distinct)
	 */
	Scanner input;
	double num1,num2,num3,largest = 0;
	 input=new Scanner(System.in);
	System.out.println("Please enter a double value");
	num1=input.nextDouble();
	System.out.println("Please enter second double value");
	num2=input.nextDouble();
	System.out.println("Please enter thirth double value");
	num3=input.nextDouble();
	
	if(num1>num2 && num1>num3) {
		largest=num1;
	}else if(num2>num1 && num2>num3) {
		largest=num2;
	}else if (num3>num1 && num3>num2) {
		largest=num3;
	}System.out.println("The largest number is "+largest);
	
	
}
}
