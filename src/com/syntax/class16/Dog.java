package com.syntax.class16;

public class Dog {
	String name,size;
	int age;
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	void displayDog() {
		System.out.println("Dog name is "+name+" and it "+size+" dog and age is "+age);
		System.out.println("Dods breed is "+breed+" and it has "+tail+" tail and "+eyes+" eyes ");
	}
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		//how to acces instance variables?-->by creating an odject and using reference variables
		dog1.name="Lucy";
		dog1.size="Big";
		dog1.age=5;
		dog1.age=6;
		dog1.displayDog();
		
		//how to accesstatic variables?-->static variables belong to the class-->accesed by className
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		System.out.println(dog1.breed);//acces static variable in static way
		System.out.println(breed);
		
		//changing value of static variable
		
		Dog dog2=new Dog();
		dog2.name="Sharik";
		dog2.size="Small";
		dog2.age=2;
		
		Dog dog3=new Dog();
		dog3.name="Pepsi";
		dog3.size="Small";
		dog3.age=3;
		
	}

}
