package com.syntax.class15;

public class Number {
//	Create a method that will take 2 parameters as a numbers and prints which number is larger.
//	Create a method that will take a number and prints whether the number is even or odd.
//	Create a method that will print whether given String is palindrome or not.
void lNum(int a,int b) {
	if(a>b) {
		System.out.println(a+" is bigger than "+b);
	}else {
		System.out.println(b+" is bigger than "+a);
	}
}
void evenOdd(int a) {
	if(a%2==0) {
		System.out.println("it is an even number");
	}else {
		System.out.println("it is an odd number");
	}
}
//palindrome
void palindrom(String word) {
	char[] array=word.toCharArray();
	String reverse="";
	for(int i=array.length-1;i>=0; i--) {
		reverse+=array[i];}
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This isn't Palindrome");
		}
	}
}


   

