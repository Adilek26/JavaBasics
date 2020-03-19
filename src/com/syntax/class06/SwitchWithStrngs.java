package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrngs {
public static void main(String[] args) {
	/* Ask a user Where she or he is from
	 * based on the country we will define favotite food
	 * Your favorite food is _
	 */
	Scanner scan;
	String country;
	String favFood;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch(country) {
	
	
	case"morocco":
		favFood="couscous";
	break;
	case"belarus":
		favFood="Potato";
		break;
	case"tajikistan":
		favFood="Osh";
		break;
	case"turkey":
		favFood="Baklava";
		break;
	case"afghanistan":
		favFood="Mantu";
		break;
	case"kazakistan":
		favFood="Beshparmak";
		break;
		
	default:
			favFood="Unknown";
			break;
	}System.out.println("Your favorite food is "+ favFood);
	
}
}
