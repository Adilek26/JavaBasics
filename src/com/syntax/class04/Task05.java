package com.syntax.class04;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many years did you work?");
		int years=scan.nextInt();
		System.out.println("What is your annual salary?");
		int salary=scan.nextInt();
		if(years>=5) {
			System.out.println("Congratulations! You won bonus price.");
			if(salary>50000) {
			System.out.println("You got $5000.");
			
			}else {
				System.out.println("You got $3000.");
			}
		}else {
			System.out.println("Well done! Keep working hard.");
		}
		
		
	}

}
