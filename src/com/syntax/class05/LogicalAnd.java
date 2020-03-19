package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		/*
		 * if declared number is between1-10--> this number is smal 
		 * between 11-100-->this isbig number
		 *  between 101-1000--> this is large number
		 */
		int num = 78;

		if (num >= 1 && num <= 10) {
			System.out.println("this number is smal");
		} else if (num > 10 && num <= 100) {
			System.out.println("this is big number");
		} else if (num > 100 && num <= 1000) {
			System.out.println("this is large number");
		} else {
			System.out.println("Number is super large");
		}
	}
}
