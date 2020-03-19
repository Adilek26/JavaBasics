package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		/*
		 * Take age input from auser and than based on the age print output if age is
		 * from0-3-->you are a baby if age from 4-5 -->you are a kid if age from 6-12-->
		 * you are chil if your age from 12-19 -->you are teeneger if age from 20-64
		 * -->you are an adult if age is more and equal 65 -->you are still young
		 */

		// 1-let's declare all variables
		int age;
		Scanner scan;// to import windows : contrl+shift_O
		// 2-capture values
		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
		// 3-Perform verification
		if (age > 0) {
			if (age >= 0 && age < 3) {
				System.out.println("You are a baby");
			} else if (age >= 3 && age <= 5) {
				System.out.println("You are a kid");
			} else if (age >= 6 && age <= 12) {
				System.out.println("You are a child");
			} else if (age >12 && age <= 19) {
				System.out.println("You are a teeneger");
			} else if (age >= 20 && age <= 64) {
				System.out.println("you are an adult");
			} else {
				System.out.println("You are enjoying your life");
			}

		} else {
			System.out.println("Please enter valid age");
		}
	}

}
