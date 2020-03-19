package com.syntax.class07;

public class Task03 {
public static void main(String[] args) {
	boolean workDay=true;
	int day=1;
	while(workDay) {
	if(day<6) {
		System.out.println("I need a day off");
		
	}else {
		System.out.println("I don't need a day off any more");
		workDay=false;
	}day++;
		
	}
}
}
