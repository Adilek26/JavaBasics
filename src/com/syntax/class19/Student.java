package com.syntax.class19;

public class Student {
	String name, address;
	public Student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public void displayInfo(String name, String address) {
		System.out.println("Student's name: "+name+" and address is : "+address);
		
	}
//	Write program as a Student class   that has instance variables name and address.
//	Create a constructor that will initialize those variables.
	// Print name & address of given  student using displayInfo method.
//

	
	public static void main(String[] args) {
		Student str=new Student("Yunus","Atlanta");
		str.displayInfo("Abdullah","Texas" );
	}
}
