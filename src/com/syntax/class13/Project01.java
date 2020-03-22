package com.syntax.class13;

public class Project01 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		//Swap  2 strings without a temporary variable?
int a=20;
int b=10;
a=a+b;// 30
b=a-b;//20
a=a-b;//10
System.out.println("a'nin degeri: "+a+" b'nin yeni degeri: "+b);

String str1="Hello";
String str2="Java";
str1=str1.concat(str2);//"HelloJava
str2=str1.substring(0,5);//"Hello"
str1=str1.substring(5);//"Java"
System.out.println(str1);
System.out.println(str2);
	}

}
