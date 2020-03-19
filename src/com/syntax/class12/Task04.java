package com.syntax.class12;

public class Task04 {

	public static void main(String[] args) {
		
//		Create a String that will hold a sentence. 
//		Write a program to get a new String without any spaces.
		String sent="Today is the begining of the holiday";
		String[] news=sent.split(" ");
		for(int i=0; i<news.length; i++) {
		System.out.print(news[i]);
		}
		System.out.println("-------------Task 2------------");
		
//		Create a String that should be combination of letters,
//		numbers and special characters.
//		Find out how many alpha characters are there in the String.
		
		String com="I am sorry 345356 ^%$&*//";
		String[] big=com.split("I am sorry");
		System.out.println(big.length);
		
	}

}
