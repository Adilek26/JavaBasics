package com.syntax.class22;

public class Student {
//	Create a Class Student that will have 3 subclasses as
	//SyntaxStudent, CollegeStudent, SchoolStudent. 
//
//	Define common behavior within parent class and 
	//override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism
	String sName;
	long studentID;
	public void study(String sName, long studentID) {
		
		System.out.println(sName+" "+studentID+" studies their homework");
	}
	public void read(String bookType) {
		
		System.out.println("Likes to read "+bookType);
	}
	
}
class SyntaxStudent extends Student{
	public void study(String sName, long studentID) {
		
		System.out.println(sName+" "+studentID+" studies coding");
	}
	public void coding(String langType) {
		
		System.out.println("Likes to coding in "+langType);
	}
	
}
class CollegeStudent extends Student{
	public void study(String sName, long studentID) {
		
		System.out.println(sName+" "+studentID+" studies Calculus");
	}
	public void play(String sportType) {
		
		System.out.println("Likes to play "+sportType);
	}
	
}
class SchoolStudent extends Student{
	public void study(String sName, long studentID) {
	
		System.out.println(sName+" "+studentID+" studies Math");
	}
	public void listening(String musicType) {
		
		System.out.println("Likes to listen to "+musicType);
	}
	
}