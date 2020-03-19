package com.syntax.class04;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner cd=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=cd.nextInt();
		if (age>25) {
			System.out.println("Please enter your gender: M or F");
			String gender=cd.next();
			if(gender.contentEquals("M")) {
				System.out.println("Man");
			}else {
				System.out.println("Woman");
			}
		}else {
			System.out.println("Please enter your gender: M or F");
		String gender=cd.next();
		 if(gender.contentEquals("M")) {
			System.out.println("Boy");
		}else {
			System.out.println("Girl");
		}
		}
		}

	}


