package com.syntax.class07;

public class ForLoopIntro {
public static void main(String[] args) {
	//Good morning 5 times
	for(int c=1; c<6; c++) {
		System.out.println("Good morning");
	}
	
	
	//print numbers 1-10
	
	for(int num=1; num<=10; num++) {
		System.out.println(num);}
	//print numbers 10-1
	for(int num1=10; num1>=1; num1--) {
		System.out.println(num1);
	}System.out.println("-------------");
	//what will be output?
	int sum=0;
	for(int i=1; i<5; i++) {
		sum=sum+i;
		System.out.println(sum);
	}
}
}
