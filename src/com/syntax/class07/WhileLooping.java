package com.syntax.class07;

public class WhileLooping {
public static void main(String[] args) {
	int time=10;
	
	if(time<12) {
		System.out.println("Good morning");
	}
	System.out.println("----while loop------");
	
	//while(time<12){
	//System.out.println("good morning");//CODE WILL EXECUTE INFINITLY}
	while(time<13) {
		System.out.println("Good morning");
		time++;
	}
	System.out.println("----while loop------");
	
	while(time<12) {
		System.out.println("Good morning");
		time++;
	}
	
	//how to writenumbers 20 to 30
	int num1=20;
	while(num1<=30) {
		System.out.println(num1);
		num1++;
	}System.out.println("**********");
	//how to write 5 to 15 all one line
	int num2=5;
	while(num2<=15) {
		System.out.print(num2+" ");
		num2++;
	}
	System.out.println("******************");
	//how to write numbers 10 to 1
	int num3=10;
	while(num3>=1) {
		System.out.println(num3);
		num3--;
	}
}
}
