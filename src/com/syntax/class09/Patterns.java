package com.syntax.class09;

public class Patterns {
public static void main(String[] args) {
	for(int a=1; a<=5; a++) {
		System.out.print("*");
	}System.out.println("**********************");
	/* *****
	* ******
	* ******
	* *****
	* *****/
	for(int a=1; a<=5; a++) {
		System.out.print("*");}
	System.out.println();
		for(int a=1; a<=5; a++) {
			System.out.print("*");}
		System.out.println();
			for(int a=1; a<=5; a++) {
				System.out.print("*");}
			System.out.println();
				for(int a=1; a<=5; a++) {
					System.out.print("*");
				}System.out.println("__-Printing nexted loop");
				for(int i=1; i<=4; i++) {
					for (int r=1; r<=5; r++) {
						System.out.print("*");
					}System.out.println();
				}
}
}
