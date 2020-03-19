package com.syntax.class11;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
//		Accept username, password and confirm password from a user and check following requirements:
//
//			Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//			Password should be minimum 8 characters, if less → message=“Password is too short”.
//			Password cannot contain username if so, → message=“Password cannot contain username”.
//			Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//			Only after all requirements met → message “Your username and password has been created
		Scanner scan=new Scanner(System.in);
		String message=null;
		System.out.println("Please enter a Username");
		String username=scan.next();
		System.out.println("Please enter a Password");
		String password=scan.next();
		
		
		if(!(username.isEmpty() || password.isEmpty())) {
			if(password.length()>=8) {
				if(!password.contains(username)) {
					System.out.println("Confirm");
					String con=scan.next();
					if(password.contentEquals(con)) {
						System.out.println("Your accaunt is created");
					}else {
						System.out.println("Passwords are not matched");
					}
				}else {
					System.out.println("Password cannot contain username");
				}
				
			}else {
				System.out.println("Password is too short");
			}
			
	}else {
			message="Username or password cannot be empty";
		}
	}

}
