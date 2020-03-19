package com.syntax.class08;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		/*Print number 1-100
		 * 
		 * 
		 * 
		 */
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				continue;
			}System.out.println(i);
			
		}System.out.println("^^^^^^^^^^^^^");
		Scanner scan;
		int user=0;
		scan=new Scanner(System.in);
		String ask=null;
		do {
			System.out.println("Would you like to apply a creditcard?");
			ask=scan.next();
		}
	while (user<=10);{	
		
		user++;
		}
	
	}
}
