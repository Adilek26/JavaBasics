package com.syntax.class11;

import java.util.Scanner;

public class TaskUserName {

	public static void main(String[] args) {
		//Accept username, password and confirm password from a user and check;
		//username and password cannot be empty,
		//if so-->message="Username and Password cannot be empty"
		//Password should be minimum 8 caracters,if less-->"Pasword is too short"
		//Password cannot contain usernameif so-->"Pasword can't contain username"
		//Password should matchconfirm passwordif not-->"Passwords don't match"
		//only after all requirements met-->"Your username and password has been created"
		
		String username, password, confirm;
		int character;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a Username and a password");
		username=scan.nextLine();
		password=scan.nextLine();
		if(!(password.isEmpty() || username.isEmpty())){
			if(password.length()>=8) {
				if(!(password.contains(username))) {
					System.out.println("Please confirm your password");
					confirm=scan.nextLine();
					if(password.contentEquals(confirm)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords don't match");
					}
				}else {
					System.out.println("Pasword can't contain username");
				}
				
			}else {
				System.out.println("Pasword is too short");
			}
		}else {
			System.out.println("Username and Password cannot be empty");
		}
		
	}

}
