package com.syntax.class21;

public class ProgramingLanguage {
	String name;
String variable;
public ProgramingLanguage(String name,String variable) {
	this.name=name;
	this.variable=variable;
}
}
class Java extends ProgramingLanguage{
	String constructor;
	Java(String name,String variable, String constructor){
		super(name,variable);
		this.constructor=constructor;
	}
	
	public void details() {
		System.out.println(name+" can we have variables "+variable+" and constructor "+constructor);
	}
}
//class JavaScript extends ProgramingLanguage{
//	public void details() {
//			System.out.println(name+" can we have variables "+variable);
//}}