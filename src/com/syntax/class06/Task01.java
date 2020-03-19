package com.syntax.class06;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	
	Scanner scan;
	String country;
	String language;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch(country) {
	case"turkey":
		language="Turkish";
		break;
	case"germany":
		language="German";
		break;
	case"switzerland":
		language="German";
		break;
	case"england":
		language="English";
		break;
	case"saudia":
		language="Arabic";
		break;
	case"meksico":
		language="Spanish";
		default:
			language="Unknown";
	}System.out.println("You are speaking "+language);
	
}
}
