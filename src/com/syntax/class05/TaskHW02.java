package com.syntax.class05;

import java.util.Scanner;

public class TaskHW02 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String bMonth;
	String season=null;
	
	System.out.println("Please enter your birth month");
	bMonth=scan.next();
	if(bMonth.contentEquals("December") || bMonth.contentEquals("January") ||bMonth.contentEquals("February") ) {
		season="Winter";
	}else if(bMonth.contentEquals("March") || bMonth.contentEquals("April") || bMonth.contentEquals("May")) {
		season="Spring";
	}else if(bMonth.contentEquals("June") || bMonth.contentEquals("July") || bMonth.contentEquals("August")) {
		season="Summer";
	}else if(bMonth.contentEquals("September")  || bMonth.contentEquals("November") || bMonth.contentEquals("December")){
		season="Fall";
	}else {
		season="Invalid";
	}System.out.println("You were born "+season);
	
}
}
