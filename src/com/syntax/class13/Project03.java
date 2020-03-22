package com.syntax.class13;

public class Project03 {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int a,b,c;
		a=0;
		b=1;
		for(int i=1; i<10;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
