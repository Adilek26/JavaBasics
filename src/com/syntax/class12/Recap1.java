package com.syntax.class12;

public class Recap1 {
public static void main(String[] args) {
	String str="";//empty
	System.out.println(str.isEmpty());
	
	String str1=null;//no value at all
	//System.out.println(str1.isEmpty();Runtime error -->Null pointer exeption);

String str2="Good Morning ";
String str3="students";
String str4="!";
//"  Good Morning "-->"Good Morning"-->"Good Morningstudents"-->"Go..nigstdents!"
str2=str2.trim().concat(str3).concat(str4);
System.out.println(str2);

String str5="Day";
int date=25;
//str5.concat(date);CE:change type
String str6=" Hello ";
String str7="Syntax";
//str6=str6.concat(str7).trim();
//System.out.println(str6);-->"Hello Syntax"
str6=str6.trim().concat(str7);
System.out.println(str6);//"HelloSyntax"

}
}
