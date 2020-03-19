package com.syntax.class05;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	int age;
	Scanner scan;// to import windows : contrl+shift_O
	// 2-capture values
	scan = new Scanner(System.in);
	System.out.println("Please enter your age");
	age = scan.nextInt();
	// 3-Perform verification
	String human;
	if (age > 0) {
		if (age >= 0 && age < 3) {
			human="baby";
		} else if (age >= 3 && age <= 5) {
			human="kid";
		} else if (age >= 6 && age <= 12) {
			human ="child";
		} else if (age > 12 && age <= 19) {
			human="teeneger";
		} else if (age >= 20 && age <= 64) {
			human="adult";
		} else {
			human="senior";
		}
		System.out.println("You are "+human);

	} else {
		System.out.println("Please enter valid age");
	}
}

}
