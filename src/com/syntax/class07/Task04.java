package com.syntax.class07;

import java.util.Scanner;

public class Task04 {
public static void main(String[] args) {
	
	int lnum=1;
	Scanner scan=new Scanner(System.in);
	while(lnum<+20) {
	System.out.println("Please enter a number between 1-20 ?");
	lnum=scan.nextInt();
	if(lnum==17) {
		
		System.out.println("Congratulations you won");
		break;}
	
	}System.out.println("------------------");
	
	
	int num=17;
do {
	System.out.println("Please enter a number between 1-20 ?");
	lnum=scan.nextInt();
	
	
}while(num!=lnum);
System.out.println("Congrats!");
}
}

