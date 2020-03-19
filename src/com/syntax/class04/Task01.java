package com.syntax.class04;

import java.util.Scanner;

public class Task01 {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("How much loan you need?");
	int loan=scan.nextInt();
	System.out.println(loan);
	if(loan<=200000) {
		System.out.println("You are accepted");
	}else {
		System.out.println("You rejected");
	}

}
}
