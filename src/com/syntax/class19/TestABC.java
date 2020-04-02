package com.syntax.class19;

public class TestABC {
	public static void main(String[] args) {
		
	
//	Write program for multilevel inheritance 
//	where class A inherited by B and class B inherit class by C.
//
//   Write program to inherit class A that has method printF which is static
//   and call or reuse that method into class B
	B str=new B();
	str.pepHos();
	str.eyeColor="Green";
	str.classA();
	str.read="books";
	str.classB();
	C str1=new C();
	str1.age=18;
	str1.classC();
	str1.read="Comic books";
	str1.classB();
	System.out.println("People the age of "+str1.age+" likes to read "+str1.read);
	}
}
