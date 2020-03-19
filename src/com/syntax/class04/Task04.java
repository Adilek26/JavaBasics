package com.syntax.class04;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner that=new Scanner(System.in);
		System.out.println("Do you have a creditcard?");
		
		String card=that.nextLine();
		if(card.equals("yes")) {
			System.out.println("What's your balance?");
			int balance=that.nextInt();
		
			if (balance>1000){
			System.out.println("You need to pay off immediately.");
		    }else {
			System.out.println("You are free to spend more!");
		    }
		}else {
			System.out.println("Would you like to get one?");
		}
		
		
	}

}
