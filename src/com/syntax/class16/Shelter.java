package com.syntax.class16;

public class Shelter {
	public static void main(String[] args) {
		
	
//acces instance variables
	Dog puppy=new Dog();
	puppy.name="Charly";
	System.out.println(puppy.name);
	
	//acces static variables of different class
	System.out.println(Dog.breed);
	}
	
	
}
