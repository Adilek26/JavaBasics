package com.syntax.class16;

public class InstanceVariables {
String name="Jhon";//instanca variable
public static void main(String[] args) {
	String name="Yunus";
	System.out.println(name);//Yunus
	
	InstanceVariables obj=new InstanceVariables();
	System.out.println(obj.name);//jhon
	obj.name="Ali";
	System.out.println(name);//yunus
	System.out.println(obj.name);//ali
	
	//change value of local variable
	name="Farid";
	System.out.println(name);//Farid
}
}
