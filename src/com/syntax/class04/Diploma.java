package com.syntax.class04;

public class Diploma {
	public static void main(String [] args) {
		boolean diploma=true;
		double gpaScore=4.3;
		if(diploma) {
			System.out.println("Congratulations");
			if (gpaScore>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else if(gpaScore<3.5) {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You should have a degree");
		}
	}

}
