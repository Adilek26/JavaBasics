package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*You are a salessman
		 * ask a user for how much his sales are
		 * based on the amount of saleswe need to calculate his commision
		 * if sales between 1-100-->commision shoud be10%
		 * if sales between 100-200-->commision shoul be 20%
		 * if sales between 200-500--> commision shoul be30%
		 * if sales more than 500--> commision should be 50%
		 */

		//if your sales are 200-->40
		
		//1. declare all variables that I will need
		Scanner scan;
		double sales;
		double commision;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		 sales=scan.nextDouble();
		
		if(sales>=1 && sales<=100) {
		commision=sales*0.1;
		}else if(sales>100 && sales<=200) {
		commision=sales*0.2;
		}else if(sales>200 && sales<=500) {
		commision=sales*0.3;
		}else {
			commision=sales*0.5;
		}
		System.out.println("Based on your commision is "+commision);
		if (commision >100) {
			System.out.println("you are awsome saler");
		}
	}

}
