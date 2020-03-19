package com.syntax.class04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[]args) {
		Scanner nm=new Scanner(System.in);
		System.out.print("Please enter month number");
		int num=nm.nextInt();
		if(num==1) {
			System.out.println("January");
		}else if(num==2) {
			System.out.println("February");
		}else if(num==3) {
			System.out.println("March");
		}else if(num==4) {
			System.out.println("April");
		}else if(num==5) {
			System.out.println("May");
		}else if(num==6) {
			System.out.println("June");
		}else if(num==7) {
			System.out.println("July");
		}else if(num==8) {
			System.out.println("August");
		}else if(num==9) {
			System.out.println("September");
		}else if(num==10) {
			System.out.println("October");
		}else if(num==11) {
			System.out.println("November");
		}else if(num==12) {
			System.out.println("December");
		}else {
			System.out.println("Invalid");
		}
	}

}
