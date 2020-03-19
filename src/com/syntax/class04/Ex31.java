package com.syntax.class04;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[]args) {
		Scanner mn=new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		boolean tem=mn.nextBoolean();
	if(tem==true) {
		System.out.println("It is a sunny day,I should go somewhere!");
		System.out.println("What is the temperature outside?");
		int num=mn.nextInt();
		if(num>85) {
			System.out.println("I am going to the beach");
		}else {
			System.out.println("I am going to the park");
		}
	}else {
		System.out.println("I stay home and practice Java");
	}
		
	}

}
