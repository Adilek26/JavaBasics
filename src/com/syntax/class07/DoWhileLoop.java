package com.syntax.class07;

public class DoWhileLoop {
public static void main(String[] args) {
	// Hello  5 times
	int num=6;
	
	do {
		System.out.println("Hello");
		num++;
	}while(num<=5);//does show ones
	
	
	System.out.println("&&&&&&&&&&");
	int num1=6;
	while (num1<=5) {
		System.out.println("Hello");
		num1++;//doesn't show 
	}
}
}
