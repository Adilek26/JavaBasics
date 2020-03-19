package com.syntax.class08;

import java.util.Scanner;

public class Recap {
public static void main(String[] args) {
	
	/*Ask auser to pay for a candy
	 * keep asking until pay for $2
	 */
	Scanner s;
	double price;
	s=new Scanner(System.in);
	
	//do {
	//	System.out.println("Please pay for a candy");
	//	price=s.nextDouble();
//	}while(price!=2);
	//System.out.println("Enjoy your candy");
	
	System.out.println("Please pay for a candy");
	price=s.nextDouble();
	while(price!=2) {
		System.out.println("Please pay for a candy");
		price=s.nextDouble();
	}System.out.println("Enjoy your candy");
	
	}
}
