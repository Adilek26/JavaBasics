package com.syntax.class08;

public class BreakAndContinu {
public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
		if(i==4) {
			System.out.println("I'm stopping loop");
			break;
		}System.out.println(i);
		System.out.println("I'm inside the loop");
		}
		System.out.println("&&&&&&&&&&&&&&");
		
		for(int y=1;y<=10; y++) {
			if(y==4) {
				System.out.println("I'm skipping iteration");
				continue;
			}
			System.out.println("I'm inside the loops");
			System.out.println(y);
		}
		
		for(int x=1; x<21; x++) {
			if(x==5 || x==6 || x==7) {
				
				System.out.println("-");
				continue;
			}System.out.println(x);
			
				}
		
		//write a program 1-100
		//I don't wan to write to print 35-55
		for(int r=1; r<=100; r++) {
					if(r>35 && r<55) {
						continue;
			}System.out.println(r);
		}
	}
}

