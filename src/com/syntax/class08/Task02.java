package com.syntax.class08;

public class Task02 {
	public static void main(String[] args) {
		
	int sum=0;
		for(int i=1; i<=99; i+=2) {
			sum=sum+i;
			
	}System.out.println("total is odd numbers "+sum);
	
	System.out.println("*******************");
	int sum1=0;
	for(int s=1; s<=99; s++) {
		if(s%2!=0) {
			sum1=sum1+s;
		}
	}System.out.println("total of even numbers "+sum1);
	}
}
