package com.syntax.class18;

public class Task01 {

//	Write a program that will have a constructor:
	//one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of 
	//the constructors.
//

	Task01(String text){
		System.out.println("This is with parameters "+text);
	}
	Task01(){
		System.out.println("This is without parameters ");
	}
	public static void main(String[] args) {
		Task01 str=new Task01("constructor");
		Task01 str1=new Task01();
	}
}
