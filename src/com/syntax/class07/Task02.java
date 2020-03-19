package com.syntax.class07;

public class Task02 {
public static void main(String[] args) {
	int num=1;
	while(num<20) {
		System.out.println(num);
		num+=2;
	}
	//2 way using mod and op
	System.out.println("****************");
	int num4=1;
	
	while(num4<=20) ;
		
		if(num4%2 !=0) {
			System.out.println(num4);
			num4++;
			}
	// 3 way
	int num3=1;
	while(num3<=20) {
		
		System.out.println(num3++);
		num3++;
	}
}
}
