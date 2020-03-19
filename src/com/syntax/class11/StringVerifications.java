package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		String message="Welcome Admin !";
		//verify that message contains username which is admin
		System.out.println(message.contains("Admin"));
		boolean flag=message.contains("welcome");
		System.out.println(flag);
		//we want to see if welcome stars with  Welcome 
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		//we want to verify that welcome message ends with username 
		System.out.println("----endsWith() Function----");
		String username="Admin";
		
		boolean ends=message.endsWith(username);
		System.out.println(ends);
		System.out.println(message.endsWith("!"));
	}

}
