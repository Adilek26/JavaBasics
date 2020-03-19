package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		/*
		 * We have total 7 class
		 *  if day is2-3-->SDLC class 
		 *  if day is6-7-->JAVA class 
		 *  if day is 1-5--> off day 
		 *  if day is 4-->Reviev class
		 */
		int day = 6;
		day = 7;
		if (day == 2 || day == 3) {
			System.out.println("day is2-3-->SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("day is6-7-->JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println(" day is 1-5--> off day");
		} else if (day == 4) {
			System.out.println("day is 4-->Reviev class with Elion");
		} else {
			System.out.println("Invaild day");
		}
		System.out.println("----------------using Strings--------");

		String day1 = "Saturday";
		if (day1.contentEquals("Tuesday") || day1.contentEquals("Wednesday")) {
			System.out.println("day is2-3-->SDLC class");
		} else if (day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
			System.out.println("Today is a Java class");
		} else if (day1.contentEquals("Monday") || day1.equals("Friday")) {
			System.out.println("Today is off class");
		} else if (day1.contentEquals("Thursday")) {
			System.out.println("Today is Reviev");
		} else {
			System.out.println("invalid day");
		}

	}
}
