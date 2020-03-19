package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		String school="Syntax";
		String str=new String("Hello");
		String str1="This is a String 769889*";
		
		//how many caracters String has
		System.out.println(school.length());
		int size=str.length();
		System.out.println("String length is "+size);

		//convert String to lower case and upper case
		System.out.println("---to uppr case lower case---");
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		//concatinate two strings
		System.out.println("---Concat Fonction---");
		String newString=str+school;
		System.out.println(newString);
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="student";
		//below code will give compile error , 
		//concat met. use just String with String
		//str2.concat(grade);
		
		
		
		System.out.println("----isEmpty fonction----");
		//tells true if there is no caracters inside the String
		//tels false if there is any caracter is in side the String
		
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("--trim() Function----");
		//remowes empty/white spaces at the begining and end of the String
		String str4="    Welcome to Syntax!    !";
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces:"+str4);
		
	}
	
	

}
