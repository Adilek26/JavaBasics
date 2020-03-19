package com.syntax.class04;

public class Alergies {
	public static void main(String []args) {
		boolean alergies=true;
		boolean appleAlergy=false;
		boolean orangeAlergy=true;
		boolean kiwiAlergy=true;
		if(alergies) {
			System.out.println("Please answer below");
			if(appleAlergy) {
				System.out.println("Don't eat apples");
			}if (orangeAlergy) {
				System.out.println("Don't eat orange");
				
			}else {
				System.out.println("you can eat orange");
			}if(kiwiAlergy) {
				System.out.println("Don't eat kiwi");
			}
		}else {
			System.out.println("You are healthy");
		}
	}

}
