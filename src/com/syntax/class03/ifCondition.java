package com.syntax.class03;

public class ifCondition {
	public static void main(String args[]) {
		//Declare a number and compare if number is numberis larger than 100
		//If number is latger than 100 --> my number is large
		System.out.println("Start cooding");
		int num=178;
		if (num>1000) {
			System.out.println("My number is large");
		}
		System.out.println("End of the program");
		System.out.println("------------");
		int expectedHours=15;
		int actualHours=15;
		//if actual is more than expected -->you will love Java
		if(actualHours>=expectedHours) {//if true go inside if block
			System.out.println("You will love Java");
		}	else {//otherwise (if false) --> go inside else block
			System.out.println("You will not like Java");
		}	
		
		System.out.println("---------");
		double budget=10000;
		double carPrice=12000;
		//using if we are doing verification and selective execution
		if (budget>carPrice) {
			System.out.println("I will buy this car today");
		}else {
			System.out.println("I will not buy this car today,"+"I will go and learn Java");
		}
		System.out.println("I am code after if condition");
	}

}
