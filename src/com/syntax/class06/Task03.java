package com.syntax.class06;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner scan;
		int num1,num2;
		int sum,sub,mult,div;
		double result=0.0;
		scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		num1=scan.nextInt();
		System.out.println("Please enter a number");
		num2=scan.nextInt();
		System.out.println("Please enter an operator");
		char operator=scan.next().charAt(0);	
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case'*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
			default:
				
				System.out.println("Wrong caracter");
		}
       System.out.println("The result is "+result);
	}

}
