package com.syntax.class04;

import java.util.Scanner;

public class Task02 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("You can get a licence");
		}else {
			System.out.println("You can get a lerners permit");
		}
		
	}

}
