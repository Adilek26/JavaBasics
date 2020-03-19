package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		//declare data and a day
		//if day is Friday-->if date is 13-->watch a scary movie
		//              -->if date is 13-->watch a comedy
		boolean isFriday=true;
		int date=13;
		
		if (isFriday) {
			System.out.println("Today is Fridat,I am going to movies");
			if(date==13) {
				System.out.println("I'll watch scary movie");
			}else {
				System.out.println("I'll watch comedy");
			}
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}

	}

}
