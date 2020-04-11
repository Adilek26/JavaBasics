package com.syntax.class22;

public class StudentTest {
public static void main(String[] args) {
	Student std1=new SyntaxStudent();
	std1.study("Mary",14236587);
	std1.read("History book");
	//sdt1.coding("Java");
	System.out.println("----------");
	Student std2=new CollegeStudent();
	std2.study("Mike",14465387);
	//std2.play("Soccer");
	std2.read("Math Books");
	System.out.println("----------");
	Student std3=new SchoolStudent();
	std3.study("John",65436587);
	std3.read("History book");
	//sdt3.listening("Rock"); 
	System.out.println("----------");
	Student obj=new Student();
	obj.study("Mary", 453621);
	obj.read("History Book");
	//obj.coding("Java");
	System.out.println("----------");
	SyntaxStudent obj1=new SyntaxStudent();
	obj1.study("Mike", 765345);
	obj1.coding("Phoyton");
	System.out.println("----------");
	CollegeStudent obj2=new CollegeStudent();
	obj2.study("john", 465325);
	obj2.play("Soccer");
	obj2.read("Science fiction");
}
}
