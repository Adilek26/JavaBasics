package com.syntax.class12;

public class Task01 {
public static void main(String[] args) {
	String str="Sunday";
	String reverse="";
	for(int i=5; i>=0; i--) {
		reverse=reverse+str.charAt(i);
	}
	System.out.println(reverse);
}
}
