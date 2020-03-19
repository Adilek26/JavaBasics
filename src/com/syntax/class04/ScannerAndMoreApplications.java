package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndMoreApplications {
	public static void main(String[]args) {
		/*Capture 2 number from auser
		 * Compare number and identify
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		int num1=input.nextInt();
		
		System.out.println("Please enter the second number");
		int num2=input.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}else  if(num2>num1){
			System.out.println(num2+" is bigger than "+num1);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		
	}

}
