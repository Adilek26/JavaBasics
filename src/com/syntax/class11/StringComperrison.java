package com.syntax.class11;

public class StringComperrison {
public static void main(String[] args) {
	String str1="Hello";
	String str2=new String("Hello");
	if(str1.contentEquals(str2)) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are NOT equals");
	}
	System.out.println("-------COMPARING USING == OPERATOR");
	if(str1==str2) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are NOT equals");
	
	}
	
	String str3="Hello";
	if(str1==str3) {
		System.out.println("Str1 equals to str3");
		
	}else {
		System.out.println("Str1 is NOT equal to str3");
	}
}
}
